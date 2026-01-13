package org.hklearning.creational.simplefactory;

public class PushNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("User selected push notification mode");
    }
}
