package org.hklearning.creational.simplefactory;

public class NotificationManager {
    public static void main(String[] args) {
        Notification mode = NotificationFactory.getNotificationMode("SMS");
        mode.notifyUser();
    }
}
