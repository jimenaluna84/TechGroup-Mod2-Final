package lunamary.services;

import datastructures.arraylist.MyArrayList;
import datastructures.hashmap.MyHashMap;
import lunamary.ReadWriteData.AbstractFactory;
import lunamary.ReadWriteData.ReadWriteFile;
import lunamary.modelPerson.*;
import lunamary.modelSchool.*;
;import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class SchoolService {

    private static School school;
    private AbstractFactory factory;


    public SchoolService() {


    }

    public School createSchool(String name, String address) {
        school = new School(name, address);
        return school;
    }

    public void registerDirector(String name, String lastname, int ci) {
        DirectorService directorService = new DirectorService();
        Director director = directorService.createDirector(name, lastname, ci);
        school.setDirector(director);

    }

    public static void registerClassroom(String id, String name) {
        ClassroomService classroomService = new ClassroomService();
        Classroom classroom = classroomService.crateClassroom(id, name);
        school.addClassroom(classroom);
        System.out.println(classroom.getName().toString());

    }

    public static void registerParent(String name, String lastName, int ci) {
        ParentService parentService = new ParentService();
        Parent parent = parentService.createParent(name, lastName, ci);
        school.addParent(parent);

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
        System.out.println(subject.getName().toString());


    }

    public static void registerAverageClassroom(String codeClassroom, int averageScholarshipGrade, int minimumAverageApprobation) {
        Classroom classroom = CommonService.getClassroom(school, codeClassroom);
        DirectorService directorService = new DirectorService();
        directorService.assignAverage(classroom, averageScholarshipGrade, minimumAverageApprobation);

    }

    public static void registerStudent(String codeClassroom, String name, String lastName, int ci, String nameParent,
                                       String lastNameParent, int ciParent, String typeDevice1, String identifier1,
                                       String typeDevice2, String identifier2) {

        ParentService parentService = new ParentService();
        Parent parent = parentService.createParent(nameParent, lastNameParent, ciParent);

        DeviceService deviceService = new DeviceService();
        deviceService.createDevice(typeDevice1, identifier1, parent);
        deviceService.createDevice(typeDevice2, identifier2, parent);

        Classroom classroom = CommonService.getClassroom(school, codeClassroom);
        StudentService studentService = new StudentService();
        Student student = studentService.createStudent(name, lastName, ci);
        studentService.setParent(student, parent);
        ClassroomService classroomService = new ClassroomService();
        classroomService.setStudent(classroom, student);


    }

    public void assignGradeStudent(String codeClassroom, int ciTeacher, int grade1, String description1, int grade2, String description2, int ciStudent, String nameSubject, String year) {

        Classroom classroom = CommonService.getClassroom(school, codeClassroom);
        GradeService gradeService = new GradeService();
        Grade first_test = gradeService.createGrade(grade1, description1);
        Grade second_test = gradeService.createGrade(grade2, description2);
        List<Grade> grades = new ArrayList<>();
        grades.add(first_test);
        grades.add(second_test);
        Teacher teacher = CommonService.getTeacher(school, ciTeacher);
        Student student = CommonService.getStudent(classroom, ciStudent);
        Subject subject = CommonService.getSubject(classroom, nameSubject);
        TeacherService teacherService = new TeacherService();
        GradeStudent gradeStudent = teacherService.createGradeStudent(teacher, student, subject, year, grades);
        school.addGradeStudent(gradeStudent);
        System.out.println(school.getGradeStudentList().size());


    }

    public boolean importGradeFromFile(String pathFile) {
        boolean isImportSucess = false;
        MyArrayList<MyHashMap<String, String>> data = importDataFromFile(pathFile);

        if (!data.isEmpty()) {
            for (int i = 0; i < data.size(); i++) {
                MyHashMap<String, String> entry = data.get(i);

                int ciTeacher = Integer.parseInt(entry.get("ciTeacher"));
                String nameClassroom = entry.get("nameClassroom");
                String subject = entry.get("Subject");
                int ciStudent = Integer.parseInt(entry.get("ciStudent"));
                int gradeSemester1 = Integer.parseInt(entry.get("gradeSemester1"));
                int gradeSemester2 = Integer.parseInt(entry.get("gradeSemester2"));
                String gestion = entry.get("gestion");
                this.assignGradeStudent(nameClassroom, ciTeacher, gradeSemester1, "", gradeSemester2, "", ciStudent, subject, gestion);

            }
            isImportSucess = true;
        }
        return isImportSucess;

    }


    public MyArrayList<MyHashMap<String, String>> importDataFromFile(String path) {
        factory = new AbstractFactory();
        ReadWriteFile file = factory.createFile(path);
        if (file == null) {
            return null;
        } else {
            return file.readLines();
        }
    }

    public boolean exportDataToFile(String path, MyArrayList<MyHashMap<String, String>> values) {
        factory = new AbstractFactory();
        ReadWriteFile file = factory.createFile(path);
        if (file == null) {
            return false;
        } else {
            return file.writeEntries(values);
        }
    }


}


