package org.dimigo.inheretence;

public class Person {
    private String name;
    protected int age;
    private int height;
    private int weight;

    public Person() {}

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public String getName() {return name;}

    public void eat(){
        System.out.println(name+"이 밥을 먹는다.");
    }
    public void sleep(){
        System.out.println(name+"이 잠을 잔다.");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

}