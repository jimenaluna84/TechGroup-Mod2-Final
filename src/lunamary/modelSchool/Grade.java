package lunamary.modelSchool;

import lunamary.services.SubjectObservable;

public class Grade extends SubjectObservable {
    private int grade;
    private String description;

    public Grade(int grade, String description) {
        super();
        this.grade = grade;
        this.description = description;

    }
}
