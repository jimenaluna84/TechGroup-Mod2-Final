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

}
