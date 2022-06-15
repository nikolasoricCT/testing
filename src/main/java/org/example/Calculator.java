package org.example;

public class Calculator {

    CalculatorService service;
    public Calculator(CalculatorService service){
        this.service = service;
    }
    public int doubleAction(int i, int j) {
        return service.add(i, j)*i;
    }
    public int multiply(int i,int j){
        return i*j;
    }
    public String person1 = "nikola";
    public String person2 = "veljko";
}
