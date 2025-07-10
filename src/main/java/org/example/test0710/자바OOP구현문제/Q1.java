package org.example.test0710.자바OOP구현문제;

class Animal {
    String name;
    void makeSound() {}
    Animal (String name) {
        this.name = name;
    }
}
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("멍멍");
    }
}
class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("야옹");
    }
}

public class Q1 {
    public static void main(String[] args) {
        /*
        ### Q1. 상속과 오버라이딩
        다음 요구사항을 만족하는 클래스를 구현하시오.
        > Animal 이라는 부모 클래스를 만든다.Animal 클래스에는 String name과 void makeSound() 메서드가 있다.
        Dog, Cat 클래스는 Animal을 상속하고 makeSound() 메서드를 각각 “멍멍”, “야옹”을 출력하도록 오버라이딩한다.
        Main 클래스에서 Animal 배열에 Dog와 Cat 인스턴스를 넣고 반복문으로 모든 동물의 이름과 소리를 출력하라.
         */
        Animal dog = new Dog("쿠키");
        Animal cat = new Cat("나비");

        Animal[] animals = { dog, cat };

        for (Animal animal: animals) {
            System.out.print(animal.name + " ");
            animal.makeSound();
        }

    }
}
