package lunamary;

import lunamary.modelPerson.*;
import lunamary.modelSchool.*;
import lunamary.services.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir) {
            System.out.println("1. Register New School");
            System.out.println("2. Register New Classroom");
            System.out.println("3. Register New Subject");
            System.out.println("4. Register Student");
            System.out.println("5. Register Director");
            System.out.println("6. Register Teacher");
            System.out.println("7. Director set Average by Course");
            System.out.println("8. Teacher add Grade Student");
            System.out.println("9. Teacher Import Grade");
            System.out.println("10. Director generate General Report");
            System.out.println("11. Director generate General Report");


            try {

                System.out.println("Write Option");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 12:
                        salir = true;
                        break;
                    default:
                        System.out.println("Tried again");
                }
            } catch (InputMismatchException e) {
                System.out.println("Should be enter number");
                sn.next();
            }
        }


        SchoolService schoolService = new SchoolService();
        schoolService.registerSchool("Edmundo Bojanowski", "Pacata Alta Zona Norte");
        schoolService.registerDirector("Carlos", "Torres", 100);

        SchoolService.registerClassroom("1A", "Bottom Junior");
        SchoolService.registerClassroom("2A", "2nd Junior");
        SchoolService.registerClassroom("3A", "3rd Junior");

        SchoolService.registerTeacher("Profesor", "English", 200);
        SchoolService.registerTeacher("Profesor", "Spanish", 201);
        SchoolService.registerTeacher("Profesor", "Germany", 202);

        schoolService.registerSubject("English", "1A", 200);
        schoolService.registerSubject("English", "2A", 200);
        schoolService.registerSubject("English", "3A", 200);

        schoolService.registerSubject("Spanish", "1A", 201);
        schoolService.registerSubject("Spanish", "2A", 201);
        schoolService.registerSubject("Spanish", "3A", 201);

        schoolService.registerSubject("Germany", "1A", 202);
        schoolService.registerSubject("Germany", "2A", 202);
        schoolService.registerSubject("Germany", "3A", 202);

        schoolService.registerAverageClassroom("1A", 100, 51);
        schoolService.registerAverageClassroom("2A", 100, 51);
        schoolService.registerAverageClassroom("3A", 100, 51);





    }


}
