package org.example.chapter03;

import java.util.ArrayList;

public class Z_Quiz03 {
    public static void main(String[] args) {
        // ArrayList<String>에 "dog", "cat", "bird"를 추가한 후 "cat"을 삭제하고 출력하시오.
        ArrayList<String> list = new ArrayList<>();
        list.add("dog");
        list.add("cat");
        list.add("bird");

        for(String animal1: list) {
            System.out.println(animal1);
        }

        System.out.println();

        list.remove("cat");
        for(String animal2: list) {
            System.out.println(animal2);
        }
    }
}
