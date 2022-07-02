package com.example.demo.model;

import java.sql.Time;

@Entity
public class ScheduleSubject {
    @ManyToMany
    @JoinColumn(name = "subject_id", referencedColumnName = "id")
    private Long subjectId;
    @ManyToMany
    @JoinColumn(name = "schedule_id", referencedColumnName = "id")
    private Long scheduleId;
    @Column(nullable = false)
    private Time startTime;
    @Column(nullable = false)
    private Time endTime;

    public ScheduleSubject(Long subjectId, Long scheduleId, Time startTime, Time endTime) {
        this.subjectId = subjectId;
        this.scheduleId = scheduleId;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public Long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }
}
