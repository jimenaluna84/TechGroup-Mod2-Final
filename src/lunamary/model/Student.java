package lunamary.model;

public class Student extends Person {
    public String getNotificationEmail() {
        return notificationEmail;
    }

    public void setNotificationEmail(String notificationEmail) {
        this.notificationEmail = notificationEmail;
    }

    String notificationEmail;


    public Student(String name, String lastName, int age) {
        super(name, lastName, age);
        notificationEmail = "Unknown";
    }

}
