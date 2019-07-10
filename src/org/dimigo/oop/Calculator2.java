package org.dimigo.oop;

public class Calculator2 {
    public static double PI=3.141592;
    public boolean powerflag;
    public void powerOn(){
        if(!powerflag) {
            System.out.println("전원을 켭니다.");
            powerflag=true;
        }
    }
    public void powerOff(){
        if(powerflag) {
            System.out.println("전원을 끕니다.");
            powerflag=false;
        }
    }
    public static int add(int num1,int num2,Calculator2 c){
        c.powerOn();
        return num1+num2;
    }
    public static int mul(int num1,int num2,Calculator2 c){
        c.powerOn();
        return num1*num2;
    }
    public static int sub(int num1,int num2,Calculator2 c){
        c.powerOn();
        return num1-num2;
    }
    public static double div(int num1,int num2,Calculator2 c){
        c.powerOn();
        return (double)num1/num2;
    }
    public static void main(String[] args) {
        int x=10,y=20;
        Calculator2 c=new Calculator2();
        Calculator2 c2=new Calculator2();
        Calculator2 c3=new Calculator2();
        System.out.println(c.PI);
        System.out.println(c2.PI);
        System.out.println(c3.PI);

        System.out.println(PI);
        System.out.printf("%d + %d = %d\n",x,y,add(x,y,c));
        System.out.printf("%d - %d = %d\n",x,y,sub(x,y,c));
        System.out.printf("%d * %d = %d\n",x,y,mul(x,y,c));
        System.out.printf("%d / %d = %.1f\n",x,y,div(x,y,c));
        c.powerOff();
    }
}
