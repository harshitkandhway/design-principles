package org.hklearning.creational.factorymethod;

public class PushNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("User notified through Push Notification");
    }
}
