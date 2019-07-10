package org.dimigo.abstractclass;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] a={
                new Duck(),new Pig(),new Cow()
        };
        for(Animal b :a){
            b.eat();
            b.bark();
        }
    }
}
