package lunamary.modelPerson;

import java.util.List;

public class Student extends Person {
    private Parents parents;


    public Student(String name, String lastName, int age, List<Device> deviceList, Parents parents) {
        super(name, lastName, age, deviceList);
        this.parents = parents;

    }

}
