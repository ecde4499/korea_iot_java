package org.example.chapter03;

import java.util.ArrayList;
import java.util.Scanner;

public class Z_Quiz07 {
    public static void main(String[] args) {
//        사용자로부터 정수를 입력받아 ArrayList<Integer>에 저장하고,
//        총합과 평균을 구하여 출력하세요.
//        (입력은 5개로 제한)
        int sum = 0;
        int avg = 0;
        ArrayList<Integer> list = new ArrayList<>(5);
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요(5개 제한) >> ");
        for (int i = 0; i < 5; i++) {
            int input = sc.nextInt();
            list.add(input);
        }
        for (int total: list) {
            sum += total;
        }
        for (int average: list) {
            avg = sum / list.size();
        }
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + avg);

    }
}
