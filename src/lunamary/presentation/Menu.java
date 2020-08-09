package lunamary.presentation;

import lunamary.services.SchoolService;

import java.util.Scanner;

public class Menu {

    SchoolService schoolService;
    Scanner scanner = new Scanner(System.in);
    String selectOption = "";

    public void menu() {
        boolean option = true;
        do {
            System.out.println("#################################################");
            System.out.println("Creation sequence for the school system:");
            System.out.println("#################################################");
            if (selectOption.contains("1") == false) {
                System.out.println("\t 1. Register New School");
            }
            if (selectOption.contains("2") == false) {
                System.out.println("\t 2. Assign Headmaster to the school");
            }
            if (selectOption.contains("3") == false) {
                System.out.println("\t 3. Register New Classroom ");
            } else {
                System.out.println("\t 3. Register New Classroom   (*)");
            }
            if (selectOption.contains("4") == false) {
                System.out.println("\t 4. Register Teacher");
            } else {
                System.out.println("\t 4.  Register Teacher  (*)");
            }
            ;
            if (selectOption.contains("6") == false) {
                System.out.println("\t 6. Director set Average by Course");
            } else {
                System.out.println("\t 6. Director set Average by Course  (*)");
            }
            ;
            if (selectOption.contains("7") == false) {
                System.out.println("\t 7. Register Student");
            } else {
                System.out.println("\t 7. Register Student   (*)");
            }
            ;
            System.out.println("\t 8. Teacher add Grade Student");
            System.out.println("\t 9. Teacher Import Grade");
            System.out.println("\t 10. Director generate General Report");
            System.out.println("\t 11. Director generate General Report");
            System.out.println("\t Para salir ingrese 's'. ");
            System.out.println("-------------------------------------------------");
            System.out.print("Seleccione una opcion: ");
            String selectOption = scanner.nextLine();
            System.out.println("#################################################\n");

            switch (selectOption.toLowerCase()) {
                case "1":
                    uiRegisterNewSchool();
                    option = false;
                    break;
                case "2":
                    uiRegisterHeadmasterSchool();
                    option = false;
                    break;
                case "3":
                    uiRegisterClassRoom();
                    option = false;
                    break;
                case "4":
                    uiRegisterTeacher();
                    option = false;
                    break;
                case "5":
                    uiRegisterSubject();
                    option = false;
                    break;
                case "s":
                    option = false;
                    break;
                default:
                    menu();
                    break;
            }
            if (selectOption.contains("5") == false) {
                System.out.println("\t 5. Register New Subject");
            } else {
                System.out.println("\t 5. Register New Subject   (*)");
            }
            ;
            // System.out.println("\t 6. Register Director
        } while (option);
    }

    public void uiRegisterNewSchool() {
        System.out.println("=================================================");
        System.out.println("1. Register New School");
        System.out.println("=================================================");
        System.out.print("\t Insert  name school: ");
        String nameSchool = scanner.nextLine();
        System.out.print("\t Insert the address school: ");
        String address = scanner.nextLine();
        System.out.println("=================================================\n");
        stepNewSchool(nameSchool, address);
        selectOption += selectOption + "1";
        menu();
    }

    public void stepNewSchoolAndSchool(String nameSchool, String address, String headmaster, String lastNameDirector, int ci) {
        schoolService = new SchoolService();
        schoolService.createSchool(nameSchool, address);
        schoolService.registerDirector(headmaster, lastNameDirector, ci);
    }

    public void stepNewSchool(String nameSchool, String address) {
        SchoolService schoolService = new SchoolService();
        schoolService.createSchool(nameSchool, address);
    }

    public void uiRegisterHeadmasterSchool() {
        System.out.println("=================================================");
        System.out.println(" 2. Assign Headmaster to the school ");
        System.out.println("=================================================");
        System.out.print("\t Insert  name Headmaster: ");
        String headmaster = scanner.nextLine();
        System.out.print("\t Insert the last name Headmaster: ");
        String lastName = scanner.nextLine();
        System.out.print("\t Insert the last CI Headmaster: ");
        int ci = scanner.nextInt();
//        stepAddHeadmaster(headmaster, lastName, ci);
        schoolService.registerDirector(headmaster, lastName, ci);
        System.out.println("================================================= \n");
        selectOption += selectOption + "2";
        menu();
    }

    public void stepAddHeadmaster(String headmaster, String lastNameDirector, int ci) {
        try {
            schoolService.registerDirector(headmaster, lastNameDirector, ci);

        } catch (Exception e) {
            //  System.out.println("Something went wrong.");
        }
    }

    public void uiRegisterClassRoom() {
        System.out.println("=================================================");
        System.out.println(" 3. Register New Classroom");
        System.out.println("=================================================");
        System.out.print("\t Insert the room acronym: ");
        String id = scanner.nextLine();
        System.out.print("\t Insert the room name: ");
        String name = scanner.nextLine();
        SchoolService.registerClassroom(id, name);
        System.out.println("================================================= \n");
        selectOption += selectOption + "3";
        menu();
    }

    public void uiRegisterTeacher() {
        System.out.println("=================================================");
        System.out.println("4. Register Teacher");
        System.out.println("=================================================");
        System.out.print("\t Insert the name Teacher: ");
        String nameTeacher = scanner.nextLine();
        System.out.print("\t Insert the class name: ");
        String nameClassroom = scanner.nextLine();
        System.out.print("\t Insert the Ci Teacher: ");
        String ciTeacher = scanner.nextLine();
        SchoolService.registerTeacher(nameTeacher, nameClassroom, Integer.parseInt(ciTeacher));
        System.out.println("================================================= \n");
        selectOption += selectOption + "4";
        menu();
    }

    public void uiRegisterSubject() {
        System.out.println("=================================================");
        System.out.println("5. Register Subject");
        System.out.println("=================================================");
        System.out.print("\t Insert the name Subject: ");
        String nameSubject = scanner.nextLine();
        System.out.print("\t Insert the code classroom: ");
        String codeClassroom = scanner.nextLine();
        System.out.print("\t Insert the Ci Teacher: ");
        String ciTeacher = scanner.nextLine();
        registerSubject(nameSubject, codeClassroom, Integer.parseInt(ciTeacher));
        System.out.println("================================================= \n");
        selectOption += selectOption + "5";
        menu();
    }

    public void registerSubject(String nameSubject, String codeClassroom, int ciTeacher) {
        try {
            SchoolService.registerSubject(nameSubject, codeClassroom, ciTeacher);
        } catch (Exception e) {

        }
    }


}
