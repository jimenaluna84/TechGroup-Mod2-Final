package lunamary.services;

import lunamary.modelPerson.*;
import lunamary.modelSchool.Classroom;
import lunamary.modelSchool.School;
import lunamary.modelSchool.Subject;
;

public class SchoolService {

    private static School school;
    private static Director director;


    public SchoolService() {

    }

    public void registerSchool(String name, String address) {
        school = new School(name, address);
    }

    public void registerDirector(String name, String lastname, int ci) {
        DirectorService directorService = new DirectorService();
        director = directorService.createDirector(name, lastname, ci);
        school.setDirector(director);

    }

    public static void registerClassroom(String id, String name) {
        ClassroomService classroomService = new ClassroomService();
        Classroom classroom = classroomService.crateClassroom(id, name);
        school.addClassroom(classroom);
    }

    public static void registerParent(String name, String lastName, int ci) {
        Parent parent = new Parent(name, lastName, ci);
        this.school.addParent(parent);

    }

    public static void registerDevice(String type, String identifier, String name, String lastname, int ci) {
        Parent parent = CommonService.getParent(school, ci);
        DeviceService deviceService = new DeviceService();
        Device device = deviceService.createDevice(type, identifier, parent);
        school.addDevice(device);
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

    public static void registerAverageClassroom(String codeClassroom, int averageScholarshipGrade, int minimumAverageApprobation) {
        Classroom classroom = CommonService.getClassroom(school, codeClassroom);
        DirectorService directorService = new DirectorService();
        directorService.assignAverage(classroom, averageScholarshipGrade, minimumAverageApprobation);

    }

    public static void registerStudent(String codeClassroom, String name, String lastName, int ci, String nameParent,
                                       String lastNameParent, int ciParent, String typeDevice1, String identifier1, String typeDevice2, String identifier2) {

        Classroom classroom = CommonService.getClassroom(school, codeClassroom);
        StudentService studentService = new StudentService();
        studentService.createStudent("Mary", "Luna", 300);
        ParentService.createParent(nameParent, lastNameParent, ciParent, typeDevice1, typeDevice1, typeDevice2, )



    }


}


