package org.example.book_management_system.service;

import org.example.book_management_system.exception.BookNotFoundException;
import org.example.book_management_system.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {
    List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void showAllBook() {
        if(books.isEmpty()) {
            System.out.println("등록된 책이 없습니다.");
        } else {
            for (Book book: books) {
                System.out.println(book);
            }
        }
    }

    @Override
    public void showBookById(String id) {
        for (Book book: books) {
            if(book.getId().equals(id)) {
                System.out.println("ID: " + book.getId() + ", Title: " + book.getTitle() +
                        ", Author: " + book.getAuthor());
            }
        }
    }

    @Override
    public void updateAuthor(String id, String author) {
        for (Book book: books) {
            if(book.getId().equals(id)) {
                book.setAuthor(author);
            }
        }
        System.out.println("수정 완료");
    }

    @Override
    public void deleteBook(String id) {
        for (Book book: books) {
            if(book.getId().equals(id)) {
                books.remove(book);
            }
        }
        System.out.println("삭제 완료");
    }

    @Override
    public void showBookByTitle(String title) {
        for (Book book: books) {
            if(book.getTitle().equals(title)) {
                System.out.println("ID: " + book.getId() + ", Title: " + book.getTitle() +
                        ", Author: " + book.getAuthor());
            }
        }
    }
}
