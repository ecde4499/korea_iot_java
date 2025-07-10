package org.example.chapter03;

import java.util.ArrayList;
import java.util.Scanner;

public class Z_Quiz01 {
    public static void main(String[] args) {
        // 사용자로부터 정수 5개를 입력받아 ArrayList에 저장한 후, 모든 값을 출력하시오.
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

        System.out.println("정수 5개 입력 >> ");

        for(int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            list.add(num);
        }
        for(int listadd: list) {
            System.out.println(listadd);
        }
    }
}
