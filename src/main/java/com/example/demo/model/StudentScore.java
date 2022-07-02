package com.example.demo.model;

import java.time.LocalDateTime;

@Entity
public class StudentScore {

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Integer studentId;
    @ManyToOne
    @JoinColumn(name = "subject_id", referencedColumnName = "id")
    private Integer subjectId;
    @ManyToOne
    @JoinColumn(name = "professor_id", referencedColumnName = "id")
    private Integer professorId;
    @Column(nullable = false)
    private Float score;
    @Column(nullable = false)
    private LocalDateTime date;

    public StudentScore(Integer studentId, Integer subjectId, Integer professorId, Float score, LocalDateTime date) {
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.professorId = professorId;
        this.score = score;
        this.date = date;
    }
    public Integer getStudentId() {
        return studentId;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getProfessorId() {
        return professorId;
    }

    public void setProfessorId(Integer professorId) {
        this.professorId = professorId;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

}
