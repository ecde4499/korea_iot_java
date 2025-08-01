package org.example.chapter09;

// java.util 패키지
// : 자바에서 가장 많이 쓰는 기능을 모아놓은 패키지
// - 컬렉션 프레임워크, 유틸리티(배열, 컬렉션 등) 날짜 및 시간 처리, 랜덤 값 생성, 입력기 등

import java.util.Random;
import java.util.Scanner;

public class JavaUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();

        Random random = new Random(); // 랜덤 객체 생성
        int num = random.nextInt();
        System.out.println(num); // -522481853

        int num2 = random.nextInt(100); // (N): 0부터 N 사이의 난수 생성
        System.out.println(num2);

        int num3 = random.nextInt(101, 200); // (A, B): A부터 B 사이의 난수 생성
        System.out.println(num3);


    }
}
