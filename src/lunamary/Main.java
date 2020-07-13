package lunamary;

import lunamary.model.Person;

public class Main {
    public static void main(String[] args) {
        Person persona = new Person("Mary", "Luna", 34);
        String res = persona.getName();
        System.out.println(res);

    }


}
