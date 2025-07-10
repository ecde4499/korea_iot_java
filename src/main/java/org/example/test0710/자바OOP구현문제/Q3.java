package org.example.test0710.자바OOP구현문제;

abstract class Shape {
    abstract double getArea();
}

class Circle extends Shape {
    int radius;

    Circle (int radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return radius * radius * 3.14;
    }
}

class Rectangle extends Shape {
    int width;
    int length;

    Rectangle (int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    double getArea() {
        return width * length;
    }
}

public class Q3 {
    public static void main(String[] args) {
        /*
        ### Q3. 추상 클래스와 구현
        Shape 라는 추상 클래스를 만든다.
        double getArea()라는 추상 메서드를 가진다.
        Circle, Rectangle 클래스는 Shape를 상속받고 각자의 면적을 구하는 getArea를 구현한다.
        Main 클래스에서 다형성을 활용해 각각의 도형 면적을 출력하라.
         */
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(3, 4);

        System.out.println(circle.getArea());
        System.out.println(rectangle.getArea());
    }
}
