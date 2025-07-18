package org.example.book_management_system.service;

import org.example.book_management_system.model.Book;

import java.util.List;

public interface BookService {
    void addBook(Book book);
    void showAllBook();
    void showBookById(String id);
    void updateAuthor(String id, String author);
    void deleteBook(String id);
    void showBookByTitle(String title);
}
