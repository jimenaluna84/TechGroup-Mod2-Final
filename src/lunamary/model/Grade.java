package lunamary.model;

import lunamary.services.SubjectObservable;

public class Grade extends SubjectObservable {
    private int grade;
    private Subject subject;

    public Grade() {
        super();
        this.grade = grade;

    }

    public void setGrade(int grade) {
        this.grade = grade;
        super.notifyNow();


    }


}
