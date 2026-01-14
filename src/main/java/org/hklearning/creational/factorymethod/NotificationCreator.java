package org.hklearning.creational.factorymethod;

public abstract class NotificationCreator {
    public Notification getNotification(){
        Notification notification = getNotificationCreator();
        notification.notifyUser();
        return notification;
    }
    public abstract Notification getNotificationCreator();
}
