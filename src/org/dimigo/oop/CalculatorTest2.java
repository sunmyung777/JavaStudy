package org.dimigo.oop;

public class CalculatorTest2 {
    public static void main(String[] args) {
        int x=10,y=20;
        Calculator2 c=new Calculator2();

        System.out.println(Calculator2.PI);
        System.out.printf("%d + %d = %d\n",x,y,Calculator2.add(x,y,c));
        System.out.printf("%d - %d = %d\n",x,y,Calculator2.sub(x,y,c));
        System.out.printf("%d * %d = %d\n",x,y,Calculator2.mul(x,y,c));
        System.out.printf("%d / %d = %.1f\n",x,y,Calculator2.div(x,y,c));
        c.powerOff();
    }
}
