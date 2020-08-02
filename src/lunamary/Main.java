package lunamary;

import lunamary.services.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean out = false;
        int opcion;
        while (!out) {
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
                        out = true;
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

        SchoolService.registerTeacher("Teacher", "English", 200);
        SchoolService.registerTeacher("Teacher", "Spanish", 201);
        SchoolService.registerTeacher("Teacher", "Germany", 202);

        SchoolService.registerSubject("English", "1A", 200);
        SchoolService.registerSubject("English", "2A", 200);
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

        schoolService.registerStudent("1A", "Carla", "Student1A", 500, "momCarla", "Torres", 400, "Celphone", "798512451", "Email", "mom1@gmail.com");
        schoolService.registerStudent("1A", "Carolina", "Student1A", 500, "momCarolina", "Torres", 400, "Celphone", "798512452", "Email", "mom2@gmail.com");
        schoolService.registerStudent("1A", "Carola", "Student1A", 500, "momCalora", "Torres", 400, "Celphone", "798512453", "Email", "mom3@gmail.com");

        schoolService.registerStudent("2A", "Mario", "Student2A", 500, "dadMario", "Torres", 400, "Celphone", "798512454", "Email", "mom4@gmail.com");
        schoolService.registerStudent("2A", "Mauricio", "Student2A", 500, "dadMauricio", "Torres", 400, "Celphone", "798512455", "Email", "mom5@gmail.com");
        schoolService.registerStudent("2A", "Miguel", "Student2A", 500, "dadaMiguel", "Torres", 400, "Celphone", "798512456", "Email", "mom6@gmail.com");

        schoolService.registerStudent("3A", "Teresa", "Student3A", 500, "momTeresa", "Torres", 400, "Celphone", "798512457", "Email", "mom7@gmail.com");
        schoolService.registerStudent("3A", "Tania", "Student3A", 500, "momMarcos", "Torres", 400, "Celphone", "798512458", "Email", "mom8@gmail.com");
        schoolService.registerStudent("3A", "Tono", "Student3A", 500, "momMarcos", "Torres", 400, "Celphone", "798512450", "Email", "mom9@gmail.com");


    }


}
