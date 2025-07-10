package org.example.chapter03;

import java.util.ArrayList;
import java.util.Scanner;

public class Z_Quiz06 {
    public static void main(String[] args) {
//        문자열 리스트에 "apple", "banana", "cherry"를 저장하고,
//        사용자로부터 문자열을 입력받아 해당 값이 리스트에 있는지 확인하세요.
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        Scanner sc = new Scanner(System.in);
        System.out.println("찾는 과일의 이름: ");
        String input = sc.nextLine();

        // System.out.println(list.get());
        boolean found = false;
        if(list.equals(input)) System.out.println(input + "는 리스트에 있습니다.");
        else System.out.println(input + "는 리스트에 없습니다");
    }
}
