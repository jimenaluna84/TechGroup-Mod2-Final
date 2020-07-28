

package lunamary.model;

import java.util.Date;
import java.util.List;
import lunamary.model.*;

public class GradeStudent {
    private List<Grade> gradeList;
    private Student student;
    private Date year;

    public GradeStudent(List<Grade> gradeList, Student student, Date year) {
        this.gradeList = gradeList;
        this.student = student;
        this.year = year;
    }

    public List<Grade> getGradeList() {
        return gradeList;
    }

    public void setGradeList(List<Grade> gradeList) {
        this.gradeList = gradeList;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
