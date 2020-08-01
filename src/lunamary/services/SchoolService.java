package lunamary.services;

import lunamary.modelPerson.Director;
import lunamary.modelPerson.Teacher;
import lunamary.modelSchool.Classroom;
import lunamary.modelSchool.School;
import lunamary.modelSchool.Subject;
;

public class SchoolService {

    private static School school;


    public SchoolService() {

    }

    public void registerSchool(String name, String address) {
        school = new School(name, address);
    }

    public void registerDirector(String name, String lastname, int ci) {
        DirectorService directorService = new DirectorService();
        Director director = directorService.createDirector(name, lastname, ci);
        school.setDirector(director);

    }

    public static void registerClassrooms(String id, String name) {
        ClassroomService classroomService = new ClassroomService();
        Classroom classroom = classroomService.crateClassroom(id, name);
        school.addClassroom(classroom);
    }

    public static void registerTeacher(String name, String lastname, int ci) {
        TeacherService teacherService = new TeacherService();
        Teacher teacher = teacherService.createTeacher(name, lastname, ci);
        school.addTeacher(teacher);

    }

    public static void registerSubject(String nameSubject, String codeClassroom, int ciTeacher) {
        SubjectService subjectService = new SubjectService();
        Subject subject = subjectService.createSubject(nameSubject);
        Classroom classroom = CommonService.getClassroom(school, codeClassroom);
        Teacher teacher = CommonService.getTeacher(school, ciTeacher);
        subjectService.setTeacher(subject, teacher);
        classroom.addSubject(subject);


    }


}


