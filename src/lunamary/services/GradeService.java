package lunamary.services;
import lunamary.modelSchool.Grade;


public class GradeService {


    public Grade createGrade(int gradeStudent, String description) {
        Grade grade = new Grade(gradeStudent, description);
        return grade;
    }




}
