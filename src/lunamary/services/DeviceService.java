package lunamary.services;

import lunamary.model.modelPerson.Device;
import lunamary.model.modelPerson.AbstractPerson;
import lunamary.model.modelPerson.Parent;


public class DeviceService implements IObserver {
    private Device device;

    public DeviceService() {

    }

    public DeviceService(Device device) {
        this.device = device;
    }


    @Override
    public void sendNotification() {


    }

    public Device createDevice(String type, String identified) {
        Device device = new Device(type,identified);
        return device;

    }


}
