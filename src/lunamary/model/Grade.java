package lunamary.model;
import lunamary.service.*;
public class Grade extends SubjectObservable {
    private int grade;
    private Subject subject;

    public Grade(int grade) {
        super();
        this.grade = grade;

    }

    public void setGrade(int grade) {
        this.grade = grade;
        super.notifyNow(grade);
    }

    public int getGrade() {
        return grade;
    }
}
