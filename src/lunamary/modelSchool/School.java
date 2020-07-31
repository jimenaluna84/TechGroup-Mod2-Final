package lunamary.modelSchool;

import lunamary.modelPerson.Director;
import lunamary.modelPerson.Student;
import lunamary.modelPerson.Teacher;

import java.util.List;

public class School {
    private String name;
    private Director director;

    private List<Classroom> classroomList;
    private List<Student> studentList;
    private List<Teacher> teacherList;


    public School(String name, List<Classroom> classroomList, Director director) {
        this.name = name;
        this.classroomList = classroomList;
        this.director = director;
    }
}
