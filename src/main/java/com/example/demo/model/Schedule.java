package com.example.demo.model;

@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "class_id", referencedColumnName = "id")
    private Long classId;
    @Column(nullable = false)
    private Integer year;
    @Column(nullable = false)
    private Integer semester;

    public Schedule(Long classId, Integer year, Integer semestr) {
        this.classId = classId;
        this.year = year;
        this.semester = semestr;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Long getId() {
        return id;
    }

}
