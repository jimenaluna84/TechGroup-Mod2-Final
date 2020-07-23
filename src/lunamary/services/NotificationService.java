package lunamary.services;

public class NotificationService implements IObserver {

    public NotificationService() {
    }

    @Override
    public void update() {
        System.out.print("ENVIANDO EMAIL PORQUE ELA NOTA ES DE REPROBADO");
    }
}
