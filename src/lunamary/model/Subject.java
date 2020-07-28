package lunamary.model;

public class Subject {
    private String name;
    private Person teacher;

    public Subject(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public Subject(Person teacher, String name) {
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
