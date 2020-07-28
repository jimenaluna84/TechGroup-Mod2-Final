package lunamary.model;

import java.util.List;

public class School {
    private String name;
    private List<Classroom> classroomList;
    private Person director;

    public School(String name, List<Classroom> classroomList, Director director) {
        this.name = name;
        this.classroomList = classroomList;
        this.director = director;
    }
}
