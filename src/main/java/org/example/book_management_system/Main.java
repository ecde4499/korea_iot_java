package org.example.book_management_system;

import org.example.book_management_system.model.Book;
import org.example.book_management_system.service.BookServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookServiceImpl bookService = new BookServiceImpl();

        while (true) {
            System.out.println("== 도서 관리 시스템 ==");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 ID로 조회");
            System.out.println("4. 도서 저자 수정");
            System.out.println("5. 도서 삭제");
            System.out.println("6. 도서 제목으로 검색");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: {
                    System.out.println("추가 도서 ID >> ");
                    String id = sc.nextLine();
                    System.out.println("추가 도서 제목 >> ");
                    String title = sc.nextLine();
                    System.out.println("추가 도서 저자 >> ");
                    String author = sc.nextLine();

                    bookService.addBook(new Book(id, title, author));
                    break;
                }
                case 2: {
                    bookService.showAllBook();
                    break;
                }
                case 3: {
                    System.out.println("검색할 책의 ID 입력 >> ");
                    String id = sc.nextLine();
                    bookService.showBookById(id);
                    break;
                }
                case 4: {
                    System.out.println("수정할 책의 ID 입력 >> ");
                    String id = sc.nextLine();
                    System.out.println("수정할 저자 입력 >> ");
                    String author = sc.nextLine();
                    bookService.updateAuthor(id, author);
                    break;
                }
                case 5: {
                    System.out.println("삭제할 책의 ID 입력 >> ");
                    String id = sc.nextLine();
                    bookService.deleteBook(id);
                    break;
                }
                case 6: {
                    System.out.println("검색할 책의 제목 입력 >> ");
                    String title = sc.nextLine();
                    bookService.showBookByTitle(title);
                    break;
                }
                default:

            }

            // sc.close();

        }
    }
}
