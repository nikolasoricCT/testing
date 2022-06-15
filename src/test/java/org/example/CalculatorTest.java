package org.example;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator = null;
    CalculatorService service = mock(CalculatorService.class);

    @Before
    public void setUp()
    {
        calculator = new Calculator(service);
    }
    @Test
    public void doubleAction(){
        when(service.add(2, 3)).thenReturn(5);
        assertEquals(10, calculator.doubleAction(2,3));
        verify(service).add(2, 3);
    }

    @Test
    public void threeTimesTwoEqualSix(){
        assertTrue(calculator.multiply(3,2) == 6);
    }

    @Test
    public void isThisDifferentPerson(){
        assertNotSame(calculator.person2, calculator.person1);
    }
}