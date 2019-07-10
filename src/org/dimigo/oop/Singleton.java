package org.dimigo.oop;

public class Singleton {
    private static Singleton instance=new Singleton();

    private Singleton(){
    }
    public static synchronized Singleton getInstance() {
        return instance;
    }
    public static Singleton getInstance2(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
