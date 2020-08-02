package lunamary.services;

import lunamary.modelPerson.Device;
import lunamary.modelPerson.Director;
import lunamary.modelPerson.Person;
import lunamary.modelSchool.Classroom;


public class DeviceService {

    public DeviceService() {

    }

    public Device createDevice(String type, String identifier, Person ownerDevice) {
        Device device = new Device(type, identifier, ownerDevice);
        return device;
    }

    public void assignAverage(Classroom classroom, int averageScholarshipGrade, int minimumAverageApprobation) {
        classroom.setMinimumAverageApprobation(averageScholarshipGrade);
        classroom.setAverageScholarshipGrade(minimumAverageApprobation);

    }
}
