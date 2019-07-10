package org.dimigo.oop;

public class WrapperTest {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toOctalString(10));
        System.out.println(Integer.toHexString(10));

        Integer i1= 100;
        Integer i2= new Integer("100");
        System.out.println(i1==i2);
        System.out.println(i1.equals(i2));

        Integer i3=Integer.valueOf(100);
        Double d1=Double.valueOf(3.14);

        int r1=i3.intValue();
        double r2=d1.doubleValue();

        int p1=Integer.parseInt("200");
        double p2=Double.parseDouble("3.14");

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[0]+"+"+args[1]+"="+(Integer.parseInt(args[0])+Integer.parseInt(args[1])));

        Integer c = 1000;
    }
}
