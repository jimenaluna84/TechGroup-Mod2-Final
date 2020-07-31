package lunamary;

import lunamary.modelPerson.Director;
import lunamary.modelPerson.Student;
import lunamary.modelPerson.Teacher;
import lunamary.modelSchool.*;
import lunamary.services.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Student student = new Student("Mary", "Luna", 34,);
        String res = student.getName();
        System.out.println("Student: " + res);
        Director director = new Director("director", "director", 56);
        String res1 = director.getName();
        System.out.println("Director: " + res1);
        Teacher teacher = new Teacher("director", "director", 56);
        String res2 = teacher.getName();
        System.out.println("Teacher: " + res2);

        Subject subject1 = new Subject(teacher, "Subject1");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student);

        List<Subject> subjectList = new ArrayList<>();
        subjectList.add(subject1);


        Classroom classroom = new Classroom(studentList, subjectList, "Classroom1");

        List<Classroom> classroomList = new ArrayList<>();
        classroomList.add(classroom);


        School school = new School("School1", classroomList, director);

        DirectorService directorService = new DirectorService(director);
        directorService.assignAverage(classroomList, "01-01-2020", 50, 100, "Classroom1");
        System.out.println(" aplazados: " + classroom.getAverageExpelledGrade());
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
