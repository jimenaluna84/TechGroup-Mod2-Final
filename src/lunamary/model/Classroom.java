package lunamary.model;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private List<Subject> subjectList;
    private List<Person> studentList;

    private int averageScholarshipGrade;
    private int averageExpelledGrade;
    private String name;


    public Classroom(List<Person> studentList, List<Subject> subjectList, String name) {
        this.studentList = studentList;
        this.subjectList = subjectList;
        this.name = name;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public List<Person> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Person> studentList) {
        this.studentList = studentList;
    }

    public int getAverageScholarshipGrade() {
        return averageScholarshipGrade;
    }

    public void setAverageScholarshipGrade(int averageScholarshipGrade) {
        this.averageScholarshipGrade = averageScholarshipGrade;
    }

    public int getAverageExpelledGrade() {
        return averageExpelledGrade;
    }

    public void setAverageExpelledGrade(int averageExpelledGrade) {
        this.averageExpelledGrade = averageExpelledGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
