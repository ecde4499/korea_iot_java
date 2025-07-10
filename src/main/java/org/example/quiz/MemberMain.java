package org.example.quiz;

class Member {
    // 멤버 변수, static 변수, 생성자 작성
    String name;
    static int count;

    Member (String name) {
        this.name = name;
        count++;
    }
}

// 테스트 클래스
public class MemberMain {
    public static void main(String[] args) {
        new Member("홍길동");  // "현재 회원 수: 1"
        new Member("김철수");  // "현재 회원 수: 2"
        System.out.println(Member.count);
    }
}
