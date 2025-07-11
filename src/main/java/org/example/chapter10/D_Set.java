package org.example.chapter10;

/*
    == Set 인터페이스 ==
    : 중복 X, 순서 X
    - 중복된 요소를 포함하지 않는 객체의 집합
    - 객체가 저장 순서를 가지지 않음 (삽입된 순서 유지 X)
    - null 요소 포함 가능

    cf) List: 중복 O, 순서 O, null 요소 포함 가능

    == 종류 ==
    1. HashSet
        : 가장 많이 사용되는 Set 구현체
        - 빠른 데이터 접근, 삽입 지원
        - 정렬 또는 순서 보장 X

    2. LinkedHashSet
        : HashSet + 순서 O (HashSet의 기능 확장 형태)
        - 중복 X, 순서 O

    3. TreeSet
        : 데이터가 자동 정렬, 중복 제거 + 정렬된 순서 유지가 필요한 경우
        - 중복 X, 순서 O
 */

import java.util.HashSet;
import java.util.Set;

public class D_Set {
    public static void main(String[] args) {
        // == Set 컬렉션의 주요 메서드 == //
        // add(), remove(), contains(), size(), isEmpty()

        Set<String> student = new HashSet<>();

        student.add("정지훈");
        student.add("정은혜");
        student.add("최광섭");
        student.add("손태경");

        System.out.println(student); // [최광섭, 손태경, 정지훈, 정은혜] => 순서 보장 X

        student.add("정은혜");
        System.out.println(student); // [최광섭, 손태경, 정지훈, 정은혜] => 중복 X

        boolean result = student.remove("최광섭"); // 제거 후 완료 여부 반환
        System.out.println(result); // true
        System.out.println(student); // [손태경, 정지훈, 정은혜]

        boolean falseResult = student.remove("이승아");
        System.out.println(falseResult); // false

        System.out.println(student.size()); // 3

        System.out.println(student.contains("손태경")); // true
        System.out.println(student.contains("정지훈")); // true
        System.out.println(student.contains("조승범")); // false

        System.out.println(student.isEmpty()); // false
        student.clear();
        System.out.println(student.isEmpty()); // true
    }
}
