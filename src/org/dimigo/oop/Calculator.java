package org.dimigo.oop;

public class Calculator {
    private int num1;
    private int num2;
    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public void powerOn(){
        System.out.println("전원을 켭니다.");
    }
    public void powerOff(){
        System.out.println("전원을 끕니다.");
    }
    public int add(){return this.num1+this.num2;}
    public int sub(){return this.num1-this.num2;}
    public int mul(){return this.num1*this.num2;}
    public double div(){return (double)this.num1/this.num2;}
}
