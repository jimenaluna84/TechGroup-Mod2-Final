package lunamary.modelPerson;

import java.util.List;

public class Person {

    private String name;
    private String lastname;
    private int ci;
    private List<Device> deviceList;


    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastname = lastName;
        this.ci = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public List<Device> getDeviceList() {
        return deviceList;
    }

    public void setDeviceList(List<Device> deviceList) {
        this.deviceList = deviceList;
    }

}
