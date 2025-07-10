package org.example.quiz;

class Book {
    int bookId;
    String title;
    String author;
    boolean isBorrowed;

    Book (int bookId, String title, String author) {
        this.bookId = bookId;
    }

    void borrowBook() {  }
    void returnBook() {  }
    void printBookInfo() {  }
}

// Book 클래스
// 필드: bookId, title, author, year, isBorrowed
// 메서드: printBookInfo(), borrowBook(), returnBook()
// LibraryApp 클래스
//        책 등록, 전체 목록 조회, 대여/반납 기능 구현
// 📌 추가 연습 포인트
// boolean 타입 다루기
// 상태 변화 (isBorrowed → true/false)

public class LibraryApp {
//    static ArrayList<Book> books = new ArrayList<>(); <- 주석해제 후 문제풀아

    public static void main(String[] args) {
        // 도서 등록, 대출/반납 테스트
    }
}