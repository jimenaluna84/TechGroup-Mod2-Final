package lunamary.model;

import lunamary.services.SubjectObservable;

public class Grade extends SubjectObservable {
    private int grade;
    private Subject subject;

    public Grade(int grade) {
        super();
        this.grade = grade;

    }

    public Grade() {

    }

    public void setGrade(int grade) {
        this.grade = grade;
        super.notifyNow(grade);
    }

    public int getGrade() {
        return grade;
    }
}
