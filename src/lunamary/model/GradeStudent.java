

package lunamary.model;

import java.util.Date;
import java.util.List;

public class GradeStudent {
    private List<Grade> gradeList;
    private Student student;
    private Date year;

    public GradeStudent(List<Grade> gradeList, Student student, Date year) {
        this.gradeList = gradeList;
        this.student = student;
        this.year = year;
    }


}
