package org.example.quiz;

import lombok.Getter;

class Example {
    public static int parseNumber(String str) {
        if (!str.matches("\\d+")) {
            throw new NumberFormatException("잘못된 숫자 형식: " + str);
        }
        return Integer.parseInt(str);
    }
}


public class test {
//    요구사항:
//
//    Student 라는 클래스를 작성합니다.
//
//    name (이름, 문자열 타입)과 score (점수, 정수 타입) 필드를 가집니다.
//    Student 객체를 생성할 때 이름과 점수를 초기화할 수 있는 생성자를 만듭니다.
//    Student 객체 배열을 생성하여 학생 5명의 이름과 점수를 초기화합니다.
//
//    예: 학생 이름: "John", "Jane", "Tom", "Emily", "Alex" / 점수: 85, 92, 78, 88, 95
//
//    반복문을 사용하여 점수가 90점 이상인 학생의 이름을 출력합니다.
    public static void main(String[] args) {

    }
}

@Getter
class Order {
    private String item;
    private int quantity;
    private int pricePerUnit;

    // 생성자, getter, toString()
}

