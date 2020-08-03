package lunamary.services;

import lunamary.modelPerson.Device;
import lunamary.modelPerson.AbstractPerson;


public class DeviceService implements IObserver {

    public DeviceService() {

    }

    public Device createDevice(String type, String identifier, AbstractPerson ownerDevice) {
        Device device = new Device(type, identifier, ownerDevice);
        return device;
    }


    @Override
    public void sendNotification() {
//        System.out.println("***********Notification******* " + "\n"
//                + "Device receiver: " + receiversNotification.getDeviceList().get(0).getType() + " " + receiversNotification.getDeviceList().get(0).getIdentifier() + "\n"
//                + "Dear Mis/ Mister " + receiversNotification.getName() + " " + receiversNotification.getName() + "\n"
//                + "This notification is to notify that your son / daugter  has been accomplishing the expectations required.\n"
//                + "I would like to get a meeting to discuss about it." + "\n"
//                + "Best Regards \n"
//                + senderNotification.getName() + senderNotification.getLastname());


    }
}
