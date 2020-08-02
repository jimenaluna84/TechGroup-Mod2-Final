package lunamary.services;

import lunamary.modelPerson.Device;
import lunamary.modelPerson.Parent;
import lunamary.modelPerson.Student;

import java.util.LinkedList;


public class ParentService {

    public ParentService() {

    }

    public Parent createParent(String name, String lastname, int ci) {
        Device device = new Device("Celular", "738-58951");
        Device device1 = new Device("Email", "parent@gmail.com");
        LinkedList<Device> devices = new LinkedList<>();
        devices.add(device);
        devices.add(device1);
        Parent parent = new Parent(name, lastname, ci, devices);
        return parent;
    }


}
