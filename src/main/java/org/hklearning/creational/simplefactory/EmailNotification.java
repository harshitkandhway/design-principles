package org.hklearning.creational.simplefactory;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("User selected EMail notification mode");
    }
}
