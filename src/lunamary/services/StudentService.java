package lunamary.services;

import lunamary.modelPerson.Director;
import lunamary.modelPerson.Student;
import lunamary.modelSchool.Classroom;


public class StudentService {

    public StudentService() {

    }

    public Student createStudent(String name, String lastname, int ci) {
        Student student = new Student(name, lastname, ci);
        return student;
    }


}
