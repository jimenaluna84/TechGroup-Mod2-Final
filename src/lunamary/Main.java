package lunamary;

import lunamary.modelPerson.*;
import lunamary.modelSchool.*;
import lunamary.services.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Device device1 = new Device("Celular", "77559048");
        List<Device> deviceList = new ArrayList<>();
        deviceList.add(device1);

        Parent parent = new Parent("papa", "papa", 20, deviceList);

        Student student = new Student("Mary", "Luna", 34, deviceList, parent);
        String res = student.getName();
        System.out.println("Student: " + res);
        Director director = new Director("director", "director", 56, deviceList);
        String res1 = director.getName();
        System.out.println("Director: " + res1);
        Teacher teacher = new Teacher("director", "director", 56, deviceList);
        String res2 = teacher.getName();
        System.out.println("Teacher: " + res2);

        Subject subject1 = new Subject(teacher, "Materia1");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student);

        List<Subject> subjectList = new ArrayList<>();
        subjectList.add(subject1);


        Classroom classroom = new Classroom(subjectList, "Curso1A", studentList);

        List<Classroom> classroomList = new ArrayList<>();
        classroomList.add(classroom);


        School school = new School("Escueka1", classroomList, director);

        DirectorService directorService = new DirectorService(director);
        directorService.assignAverage(classroomList, "01-01-2020", 50, 100, "Classroom1");
        System.out.println(" aplazados: " + classroom.getMinimumAverageApprobation());
        System.out.println("Becado: " + classroom.getAverageScholarshipGrade());

        TeacherService teacherService = new TeacherService(teacher);
        teacherService.assignAverageStudent(40, student, subject1, "2020");

        int mygrade = 50;
        Grade grade = new Grade();
        grade.setGrade(mygrade);

        List<IObserver> observers = new ArrayList<>();


        NotificationService notificationService = new NotificationService();
        GradeService gradeService = new GradeService();
        gradeService.joinObserver(notificationService);
        gradeService.validateGrade(mygrade);


    }


}
