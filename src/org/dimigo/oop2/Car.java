package org.dimigo.oop2;

public class Car {
    private static String company;
    private String name;
    static {
        company="기아";
        System.out.println("static block called");
    }
    public static String getCompany() {return company;}
    public static void setCompany(String company) {Car.company = company;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String toString() {return company+" : "+name;}
    public Car(String name) {
        this.name = name;
        System.out.println("생성자 호출");
    }
}
