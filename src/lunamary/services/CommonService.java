package lunamary.services;

import datastructures.circulardoublylinkedlist.MyCircularDoublyLinkedList;
import lunamary.modelPerson.Parent;
import lunamary.modelPerson.Student;
import lunamary.modelPerson.Teacher;
import lunamary.modelSchool.Classroom;
import lunamary.modelSchool.School;
import lunamary.modelSchool.Subject;

public class CommonService {


    public CommonService() {

    }

    public void print(String text) {
        System.out.print(text);
    }


    public static Classroom getClassroom(School school, String codeClassroom) {
        Classroom classroom = null;
        MyCircularDoublyLinkedList<Classroom> elements = school.getClassroomList();

        for (int i = 0; i < elements.size(); i++) {
            Classroom element = elements.get(i);
            if (element.getCode().equals(codeClassroom)) {
                classroom = element;
            }

        }
        return classroom;
    }

    public static Teacher getTeacher(School school, int ciTeacher) {
        Teacher teacher = null;
        MyCircularDoublyLinkedList<Teacher> elements = school.getTeacherList();
        for (int i = 0; i < elements.size(); i++) {
            Teacher element = elements.get(i);
            if (element.getCi() == (ciTeacher)) {
                teacher = element;
            }

        }
        return teacher;
    }

    public static Parent getParent(School school, int ciParent) {
        Parent parent = null;
        MyCircularDoublyLinkedList<Parent> elements = school.getParentList();
        for (int i = 0; i < elements.size(); i++) {
            Parent element = elements.get(i);
            if (element.getCi() == (ciParent)) {
                parent = element;
            }

        }
        return parent;
    }


    public static Student getStudent(Classroom classroom, int ciStudent) {
        Student student = null;
        MyCircularDoublyLinkedList<Student> elements = classroom.getStudentList();
        for (int i = 0; i < elements.size(); i++) {
            Student element = elements.get(i);
            if (element.getCi() == (ciStudent)) {
                student = element;
            }

        }
        return student;
    }

    public static Subject getSubject(Classroom classroom, String nameSubject) {
        Subject subject = null;
        MyCircularDoublyLinkedList<Subject> elements = classroom.getSubjectList();
        for (int i = 0; i < elements.size(); i++) {
            Subject element = elements.get(i);
            if (element.getName() == (nameSubject)) {
                subject = element;
            }

        }
        return subject;
    }

}