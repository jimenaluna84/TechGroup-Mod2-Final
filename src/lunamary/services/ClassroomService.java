package lunamary.services;

import lunamary.modelSchool.Classroom;

public class ClassroomService {

    public ClassroomService() {
    }

    public Classroom crateClassroom(String id, String name) {
        Classroom classroom = new Classroom(id, name);
        return classroom;
    }

}
