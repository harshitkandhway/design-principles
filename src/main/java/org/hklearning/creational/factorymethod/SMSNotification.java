package org.hklearning.creational.factorymethod;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("User notified through SMS");
    }
}
