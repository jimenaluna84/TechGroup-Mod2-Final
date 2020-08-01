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

    public void assignAverage(List<Classroom> classroom, String year, Integer averageExpelled, Integer averagescholarship, String name) {
        for (Classroom var : classroom) {
            if (name.equals(var.getName())) {
                var.setMinimumAverageApprobation(averageExpelled);
                var.setAverageScholarshipGrade(averagescholarship);
            }

        }


    }
}
