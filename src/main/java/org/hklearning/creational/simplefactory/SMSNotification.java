package org.hklearning.creational.simplefactory;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("User selected SMS notification mode");
    }
}
