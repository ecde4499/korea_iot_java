package org.example.book_management_system.model;

import org.example.book_management_system.utill.DateUtil;

import java.time.LocalDateTime;

public class Book {
    private String id;
    private String title;
    private String author;
    private LocalDateTime createdAt;
    private String updatedAt;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.createdAt = LocalDateTime.now();
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public void setId(String id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) {
        this.author = author;
//        DateUtil.now();
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Author: " + author;
    }
}
