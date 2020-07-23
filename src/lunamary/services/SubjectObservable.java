package lunamary.services;

public class SubjectObservable {

    public void notifyNow(int grade)  //alert that grade is updated
    {
        GradeService gradeService = new GradeService();
        gradeService.validateGrade(50);
    }

}
