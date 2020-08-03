package lunamary.modelPerson;

public class Student extends AbstractPerson {


    private Parent parent;


    public Student(String name, String lastName, int age) {
        super(name, lastName, age);

    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

}
