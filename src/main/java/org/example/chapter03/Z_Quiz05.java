package org.example.chapter03;

import java.util.ArrayList;

public class Z_Quiz05 {
    public static void main(String[] args) {
        // "Java", "Python", "C++"을 저장한 ArrayList에서:
//      1. 리스트의 크기를 출력
//
//      2. 인덱스 1의 값을 출력
        ArrayList<String> list = new ArrayList<>(3);
        list.add("JAVA");
        list.add("Python");
        list.add("C++");

        System.out.println(list.size());
        System.out.println(list.get(1));

    }
}
