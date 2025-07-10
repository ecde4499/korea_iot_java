package org.example.chapter03;

import java.util.ArrayList;

public class Z_Quiz02 {
    public static void main(String[] args) {
        // ArrayList<String>을 생성하고, "apple", "banana", "cherry"를 추가한 후 출력하시오.
        ArrayList<String> list = new ArrayList<>(3);
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        System.out.println("== 과일 리스트 ==");
        for(String fruits: list) {
            System.out.println(fruits);
        }

    }
}
