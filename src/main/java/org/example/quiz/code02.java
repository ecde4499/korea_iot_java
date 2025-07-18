package org.example.quiz;

//# 문제 2: 배열의 최솟값 찾기

//! 1. 문제 설명
// N개의 정수가 주어지면, 그 중 최솟값을 출력하는 프로그램을 작성하시오.

//! 2. 입력
// 첫 번째 줄에 정수 N이 주어진다.
// 두 번째 줄에 N개의 정수가 공백으로 구분되어 주어진다.

//! 3. 출력
// N개의 정수 중 최솟값을 출력한다.

//✅ 평가자 체크리스트: 문제 2 - 배열의 최솟값 찾기 (Java)
//평가 항목	배점	평가 기준	점수(체크)
//1. 입력 처리 및 변수 초기화	2.5점	???? Scanner 객체 생성 여부
//???? 정수 N을 정확히 입력 받았는가
//???? min = Integer.MAX_VALUE로 초기화했는가	???? 2.5점 / ???? 1.5점 / ???? 1점 / ???? 0점
//2. 최솟값 구하는 알고리즘	5점	???? for 반복문을 통해 N개의 숫자를 입력받는가 (1.5점)
//???? 조건문을 통해 최소값을 갱신하는 로직이 정확한가 (2점)
//???? 반복문 종료 후 올바른 최소값이 출력되도록 처리했는가 (1.5점)	???? 5점 / ???? 3점 / ???? 1.5점 / ???? 0점
//3. 출력 및 자원 해제	2.5점	???? System.out.println(min);으로 결과를 출력했는가 (1.5점)
//???? sc.close();로 Scanner 자원을 적절히 해제했는가 (1점)	???? 2.5점 / ???? 1.5점 / ???? 1점 / ???? 0점

import java.util.Scanner;

public class code02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇 개의 정수를 입력할까요? ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            System.out.println("정수값을 입력해주세요 >> ");
            numbers[i] = sc.nextInt();

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("최소값: " + min);
        sc.close();
    }
}
