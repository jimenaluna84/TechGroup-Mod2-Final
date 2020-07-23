package lunamary.services;

public class NotificationService implements IObserver {

    public NotificationService() {
    }

    @Override
    public void update() {
        System.out.print("NOTIFIYING!!!!!!!!!!!!!!!!!!");
    }
}
