package org.dimigo.inheretence;

public class PersonTest {
    public static void main(String[] args) {
        Person p=new Person("아이유",25,160,45);
        System.out.println(p);
        p.eat();
        p.sleep();

        Student s=new Student("엄선명",18,170,80,"172416");
        s.study();
        s.sleep();

        Teacher t=new Teacher("지은혜",28,165,50,"컴네");
        t.teach();
        t.doTask();
        t.eat();
        t.sleep();
    }
}
