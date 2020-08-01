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
        SchoolService.registerClassrooms("1A", "Lower secondary education");
        SchoolService.registerClassrooms("2A", "Upper secondary education");
        SchoolService.registerClassrooms("3A", "Post-secondary non-tertiary education");
        SchoolService.registerTeacher("Profesor1A", "Girafales1A", 200);
        SchoolService.registerTeacher("Profesor2A", "Girafales2A", 201);
        SchoolService.registerTeacher("Profesor3A", "Girafales3A", 202);
        schoolService.registerSubject("Matematics", "1A", 200);


    }


}
