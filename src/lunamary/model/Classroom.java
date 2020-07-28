package lunamary.model;

import java.rmi.StubNotFoundException;
import java.util.List;

public class Classroom {
    private List<Subject> subject;
    private List<Student> student;

    private int averageScholarshipGrade;
    private int averageExpelledGrade;
    private String name;

    public Classroom(List<Subject> subject, List<Student> student,
                     int averageExpelledGrade, int averageScholarshipGrade, String name) {
        this.subject = subject;
        this.student = student;
        this.averageExpelledGrade = averageExpelledGrade;
        this.averageScholarshipGrade = averageScholarshipGrade;
        this.name = name;

    }

    public List<Subject> getSubject() {
        return subject;
    }

    public void setSubject(List<Subject> subject) {
        this.subject = subject;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAverageScholarshipGrade() {
        return averageScholarshipGrade;
    }

    public int getAverageExpelledGrade() {
        return averageExpelledGrade;
    }
}
