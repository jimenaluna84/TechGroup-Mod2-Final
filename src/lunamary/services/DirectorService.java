package lunamary.services;

import lunamary.model.Classroom;
import lunamary.model.Person;

import java.util.List;


public class DirectorService {
    Person director;

    public DirectorService(Person director) {
        this.director = director;
    }

    public void assignAverage(List<Classroom> classroom, String year, Integer averageExpelled, Integer averagescholarship, String name) {
        for (Classroom var : classroom) {
            if (name.equals(var.getName())) {
                var.setAverageExpelledGrade(averageExpelled);
                var.setAverageScholarshipGrade(averagescholarship);
            }

        }


    }
}
