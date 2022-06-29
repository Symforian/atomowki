package com.example.demo.model;

import java.time.LocalDateTime;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "class_id", referencedColumnName = "id")
    private Long classId;
    @Column(nullable = false)
    private Long indexNumber;
    @Column(length = 50, nullable = false)
    private String name;
    @Column(length = 50, nullable = false)
    private String surname;
    @Column(length = 100, nullable = false)
    private String email;
    @Column(length = 10, nullable = false)
    private String passwordHash;
    @Column(length = 100, nullable = false)
    private String address;
    @Column(nullable = false)
    private Long nrLoginAttempts;

    public Student(String name, String surname, String email, String passwordHash, String address){
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.passwordHash = passwordHash;
        this.address = address;
        this.nrLoginAttempts = 0L;
    }

    public Long getId() {
        return id;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public Long getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(Long indexNumber) {
        this.indexNumber = indexNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getNrLoginAttempts() {
        return nrLoginAttempts;
    }

    public void setNrLoginAttempts(Long nrLoginAttempts) {
        this.nrLoginAttempts = nrLoginAttempts;
    }

}
