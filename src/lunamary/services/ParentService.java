package lunamary.services;

import lunamary.modelPerson.Device;
import lunamary.modelPerson.Parent;
import lunamary.modelPerson.Student;

import java.util.LinkedList;


public class ParentService {

    public ParentService() {

    }

    public Parent createParent(String name, String lastname, int ci) {
        Parent parent = new Parent(name, lastname, ci);
        return parent;
    }


}
