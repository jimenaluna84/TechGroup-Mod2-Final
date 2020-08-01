package lunamary.services;

import lunamary.modelPerson.Director;
import lunamary.modelPerson.Teacher;
import lunamary.modelSchool.Classroom;
import lunamary.modelSchool.Subject;

import java.util.List;


public class SubjectService {

    public SubjectService() {
    }

    public Subject createSubject(String name) {
        Subject subject = new Subject(name);
        return subject;
    }

    public void setTeacher(Subject subject, Teacher teacher) {
        subject.setTeacher(teacher);

    }
}
