package org.hklearning.creational.factorymethod;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("User notified through Email");
    }
}
