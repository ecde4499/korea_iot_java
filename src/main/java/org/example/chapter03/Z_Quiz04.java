package org.example.chapter03;

import java.util.ArrayList;

public class Z_Quiz04 {
    public static void main(String[] args) {
        // 빈 ArrayList<Integer>에 다음 값을 지정된 인덱스에 추가하시오:
//        0번 인덱스에 100 추가
//
//        1번 인덱스에 200 추가
//
//        1번 인덱스에 150 삽입 (기존 200은 뒤로 밀려야 함)

        ArrayList<Integer> list = new ArrayList<>(3);
        list.add(100);
        list.add(200);
        list.add(1, 150);

        for(int number: list) {
            System.out.println(number);
        }

    }
}
