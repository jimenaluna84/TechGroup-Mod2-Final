package lunamary.services;

import lunamary.modelPerson.Student;
import lunamary.modelPerson.Teacher;
import lunamary.modelSchool.Grade;
import lunamary.modelSchool.GradeStudent;
import lunamary.modelSchool.Subject;

import java.util.List;

public class TeacherService {

    public TeacherService() {

    }

    public Teacher createTeacher(String name, String lastName, int age) {
        Teacher teacher = new Teacher(name, lastName, age);
        return teacher;
    }


    public GradeStudent createGradeStudent(Teacher teacher, Student student, Subject subject, String year, List<Grade> grades) {
        GradeStudentService gradeStudentService = new GradeStudentService();
        GradeStudent gradeStudent = gradeStudentService.createGradeStudent(grades, student, year, subject, teacher);
        return gradeStudent;
    }


}
