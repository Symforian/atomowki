package com.example.demo.model;

import java.time.LocalDateTime;
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 15, nullable = false)
    private String isbn;
    @Column(length = 50, nullable = false)
    private String title;
    @Column(length = 30, nullable = false)
    private String author;
    @Column(length = 100, nullable = false)
    private String description;
    @Column(nullable = false)
    private LocalDateTime publishDate;

    public Book(String ISBN, String title, String author, String description, LocalDateTime publishDate) {
        this.isbn = ISBN;
        this.title = title;
        this.author = author;
        this.description = description;
        this.publishDate = publishDate;
    }

    public Long getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getPublishDate() {
        return publishDate;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPublishDate(LocalDateTime publishDate) {
        this.publishDate = publishDate;
    }
}
