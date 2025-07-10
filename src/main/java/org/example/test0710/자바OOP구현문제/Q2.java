package org.example.test0710.자바OOP구현문제;

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) { this.age = age;}
        else System.out.println("나이는 0보다 작을 수 없습니다.");
    }
}

public class Q2 {
    public static void main(String[] args) {
        /*
        ### Q2. 캡슐화와 getter/setter
        아래 조건에 맞는 클래스를 구현하시오.
        Person 클래스는 name, age 필드를 가진다.
        모든 필드는 private 으로 선언하고, 각각에 대한 getter와 setter를 작성한다.
        나이가 0보다 작을 수 없도록 age에 대한 유효성 검사 로직을 setter에 작성한다.
        Main 클래스에서 객체 생성 후 정보 출력.
         */
        Person person = new Person();
        person.setName("김태양");
        person.setAge(0);

        System.out.println();
        person.setAge(30);
        System.out.println(person.getName());
        System.out.println(person.getAge());



    }
}
