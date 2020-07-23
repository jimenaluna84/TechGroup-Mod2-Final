package lunamary;

import lunamary.model.Grade;
import lunamary.model.Person;
import lunamary.services.GradeService;
import lunamary.services.IObserver;
import lunamary.services.NotificationService;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Person persona = new Person("Mary", "Luna", 34);
        String res = persona.getName();
        System.out.println(res);

        int mygrade= 50;
        Grade grade = new Grade();
        grade.setGrade(mygrade);



        List<IObserver> observers = new ArrayList<IObserver>();


        NotificationService notificationService = new NotificationService();
        GradeService gradeService = new GradeService();
        gradeService.joinObserver(notificationService);
        gradeService.validateGrade(mygrade);



    }


}
