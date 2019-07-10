package org.dimigo.oop;

public class SingletonTest {
    public static void main(String[] args) {
//        Singleton a=new Singleton();
        System.out.println(Singleton.getInstance2());
        System.out.println(Singleton.getInstance2());
        System.out.println(Singleton.getInstance2());
    }
}
