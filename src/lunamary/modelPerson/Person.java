package lunamary.modelPerson;

public abstract class Person {

    private String name;
    private String lastName;
    private int ci;


    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.ci = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastname) {
        this.lastName = lastname;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }


}
