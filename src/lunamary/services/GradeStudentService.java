package lunamary.services;

import lunamary.modelPerson.Student;
import lunamary.modelPerson.Teacher;
import lunamary.modelSchool.Grade;
import lunamary.modelSchool.GradeStudent;
import lunamary.modelSchool.Subject;

import java.util.List;

public class GradeStudentService {


    public GradeStudent createGradeStudent(List<Grade> grades, Student student, String year, Subject subject, Teacher teacher) {
        GradeStudent gradeStudent = new GradeStudent(grades, student, year, subject, teacher);
        return gradeStudent;
    }
}
