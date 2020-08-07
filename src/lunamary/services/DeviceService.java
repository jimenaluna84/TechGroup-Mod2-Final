package lunamary.services;

import lunamary.modelPerson.Device;
import lunamary.modelPerson.AbstractPerson;


public class DeviceService {
    private Device device;
    private AbstractPerson person;


    public DeviceService() {

    }

    public Device createDevice(String type, String identifier, AbstractPerson ownerDevice) {
        Device newDevice = new Device(type, identifier, ownerDevice);
        return newDevice;
    }


}
