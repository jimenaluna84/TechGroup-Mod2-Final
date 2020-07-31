package lunamary.modelSchool;

import lunamary.modelPerson.Director;

import java.util.List;

public class School {
    private String name;
    private Director director;

    private List<Classroom> classroomList;
    private List<GradeStudent> gradeStudentList;



    public School(String name, List<Classroom> classroomList, Director director) {
        this.name = name;
        this.classroomList = classroomList;
        this.director = director;
    }
}
