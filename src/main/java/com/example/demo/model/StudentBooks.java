package com.example.demo.model;

import java.time.LocalDateTime;

@Entity
public class StudentBooks {

    public LocalDateTime getDateBorrowing() {
        return dateBorrowing;
    }

    public void setDateBorrowing(LocalDateTime dateBorrowing) {
        this.dateBorrowing = dateBorrowing;
    }

    public LocalDateTime getDateReturn() {
        return dateReturn;
    }

    public void setDateReturn(LocalDateTime dateReturn) {
        this.dateReturn = dateReturn;
    }

    public String getStatusBorrowing() {
        return statusBorrowing;
    }

    public void setStatusBorrowing(String statusBorrowing) {
        this.statusBorrowing = statusBorrowing;
    }

    @ManyToMany
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Integer studentId;
    @ManyToMany
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    private Integer bookId;
    @Column(nullable = false)
    private LocalDateTime dateBorrowing;
    @Column
    private LocalDateTime dateReturn;
    @Column(length = 100)
    private String statusBorrowing;

    public StudentBooks(Integer studentId, Integer bookId, LocalDateTime dateBorrowing) {
        this.studentId = studentId;
        this.bookId = bookId;
        this.dateBorrowing = dateBorrowing;
    }
}
