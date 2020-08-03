package lunamary.services;

import lunamary.modelPerson.AbstractPerson;

public class NotificationService {
    private final AbstractPerson senderNotification;
    private final AbstractPerson receiversNotification;

    public NotificationService(AbstractPerson to, AbstractPerson from) {
        this.senderNotification = from;
        this.receiversNotification = to;
    }


}
