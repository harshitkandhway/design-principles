package org.hklearning.creational.factorymethod;

public class SMSNotificationCreator extends NotificationCreator{
    @Override
    public Notification getNotificationCreator() {
        return new SMSNotification();
    }
}
