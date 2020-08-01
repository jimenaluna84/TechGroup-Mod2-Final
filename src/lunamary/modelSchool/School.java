package lunamary.modelSchool;

import datastructures.circulardoublylinkedlist.MyCircularDoublyLinkedList;
import lunamary.modelPerson.Director;
import lunamary.modelPerson.Teacher;

import java.util.ArrayList;
import java.util.List;

public class School {

    private String name;
    private String address;
    private Director director;

    private MyCircularDoublyLinkedList<Teacher> teacherList;
    private MyCircularDoublyLinkedList<Classroom> classroomList;


    private MyCircularDoublyLinkedList<GradeStudent> gradeStudentList;


    public School(String name, String address) {
        this.name = name;
        this.address = address;
        this.teacherList = new MyCircularDoublyLinkedList<>();
        this.classroomList = new MyCircularDoublyLinkedList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public MyCircularDoublyLinkedList<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(MyCircularDoublyLinkedList<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public MyCircularDoublyLinkedList<Classroom> getClassroomList() {
        return classroomList;
    }

    public void setClassroomList(MyCircularDoublyLinkedList<Classroom> classroomList) {
        this.classroomList = classroomList;
    }


    public void addTeacher(Teacher teacher) {
        this.teacherList.add(teacher);
    }

    public void addClassroom(Classroom classroom) {
        this.classroomList.add(classroom);
    }


}
