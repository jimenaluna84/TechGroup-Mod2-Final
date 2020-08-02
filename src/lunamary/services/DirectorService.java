package lunamary.services;

import lunamary.modelPerson.Director;
import lunamary.modelSchool.Classroom;

import java.util.List;


public class DirectorService {

    public DirectorService() {

    }

    public Director createDirector(String name, String lastname, int age) {
        Director director = new Director(name, lastname, age);
        return director;
    }

    public void assignAverage(Classroom classroom, int  averageScholarshipGrade, int minimumAverageApprobation) {
        classroom.setMinimumAverageApprobation(averageScholarshipGrade);
        classroom.setAverageScholarshipGrade(minimumAverageApprobation);

    }
}
