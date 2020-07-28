package lunamary;

import lunamary.model.*;
import lunamary.services.GradeService;
import lunamary.services.IObserver;
import lunamary.services.NotificationService;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Person student = new Student("Mary", "Luna", 34);
        String res = student.getName();
        System.out.println("Student: " + res);
        Director director = new Director("director", "director", 56);
        String res1 = director.getName();
        System.out.println("Director: " + res1);
        Person teacher = new Teacher("director", "director", 56);
        String res2 = teacher.getName();
        System.out.println("Teacher: " + res2);

        Subject subject1 = new Subject(teacher, "Subject1");

        List<Person> studentList = new ArrayList<>();
        studentList.add(student);

        List<Subject> subjectList = new ArrayList<>();
        subjectList.add(subject1);


        Classroom classroom = new Classroom(studentList, subjectList, "Classroom1");

        List<Classroom> classroomList = new ArrayList<>();
        classroomList.add(classroom);


        School school = new School("School1", classroomList, director);


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
