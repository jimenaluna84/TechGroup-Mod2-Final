package lunamary.modelSchool;

import lunamary.services.SubjectObservable;

public class Grade extends SubjectObservable {
    private int grade;
    private String description;

    public Grade(int grade, String description) {
        super();
        this.grade = grade;
        this.description= description;

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
