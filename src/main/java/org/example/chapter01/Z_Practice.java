package org.example.chapter01;

import java.util.Scanner;

public class Z_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("이름 입력 >> ");
        String name = sc.nextLine();
        System.out.println("국어 점수 >> ");
        int kor = sc.nextInt();
        System.out.println("영어 점수 >> ");
        int eng = sc.nextInt();
        System.out.println("수학 점수 >> ");
        int mat = sc.nextInt();

        int sum = kor + eng + mat;
        double avg = sum / 3.0;

        System.out.println("[이름 : " + name + "]");
        System.out.println("총점 : " + sum + "점");
        System.out.printf("평균 : %.1f점\n",avg);
        System.out.println(kor >= 60 && eng >= 60 && mat >= 60 ? "판정 : 합격" : "판정 : 불합격");


    }
}
