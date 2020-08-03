package lunamary.services;

import lunamary.modelPerson.Person;

public class NotificationService {
    private final Person senderNotification;
    private final Person receiversNotification;

    public NotificationService(Person to, Person from) {
        this.senderNotification = from;
        this.receiversNotification = to;
    }


}
