package com.example.demo.model;

@Entity
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 30, nullable = false)
    private String profile;
    @Column(nullable = false)
    private Integer startYear;

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public Class(String profile, Integer startYear) {
        this.profile = profile;
        this.startYear = startYear;
    }


    public Long getId() {
        return id;
    }

}
