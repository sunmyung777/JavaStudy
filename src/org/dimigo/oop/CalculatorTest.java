package org.dimigo.oop;

public class CalculatorTest {
    public static void main(String[] args) {
        int x=10,y=20;
        Calculator calc=new Calculator(x,y);
        System.out.println("<< 실행 결과 >>");
        calc.powerOn();
        System.out.printf("%d + %d = %d\n",x,y,calc.add());
        System.out.printf("%d - %d = %d\n",x,y,calc.sub());
        System.out.printf("%d * %d = %d\n",x,y,calc.mul());
        System.out.printf("%d / %d = %.1f\n",x,y,calc.div());
        calc.powerOff();

    }
}
