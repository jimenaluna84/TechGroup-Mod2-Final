package lunamary.services;

import lunamary.modelPerson.Student;
import lunamary.modelPerson.Teacher;
import lunamary.modelSchool.Subject;


public class TeacherService {

    public TeacherService() {

    }

    public Teacher createTeacher(String name, String lastname, int age) {
        Teacher teacher = new Teacher(name, lastname, age);
        return teacher;
    }


    public void assignAverageStudent(int grade, Student student, Subject subject, String year) {
    }


}
