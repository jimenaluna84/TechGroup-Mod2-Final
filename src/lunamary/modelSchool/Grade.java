package lunamary.modelSchool;

public class Grade {


    private int grade;
    private String description;

    public Grade(int grade, String description) {
        this.grade = grade;
        this.description = description;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
