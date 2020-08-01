package lunamary.services;

import datastructures.circulardoublylinkedlist.MyCircularDoublyLinkedList;
import lunamary.modelPerson.Person;
import lunamary.modelPerson.Teacher;
import lunamary.modelSchool.Classroom;
import lunamary.modelSchool.School;

public class CommonService {


    public CommonService() {

    }

    public void print(String text) {
        System.out.print(text);
    }


    public static Classroom getClassroom(School school, String codeClassroom) {
        Classroom classroom = null;
        MyCircularDoublyLinkedList<Classroom> elements = school.getClassroomList();

        String id = codeClassroom;
        for (int i = 0; i < elements.size(); i++) {
            Classroom element = elements.get(i);
            if (element.getCode().equals(id)) {
                classroom = element;
            }

        }
        return classroom;
    }

    public static Teacher getTeacher(School school, int ciTeacher) {
        Teacher teacher = null;
        MyCircularDoublyLinkedList<Teacher> elements = school.getTeacherList();
        int id = ciTeacher;
        for (int i = 0; i < elements.size(); i++) {
            Teacher element = elements.get(i);
            if (element.getCi() == (ciTeacher)) {
                teacher = element;
            }

        }
        return teacher;
    }

}