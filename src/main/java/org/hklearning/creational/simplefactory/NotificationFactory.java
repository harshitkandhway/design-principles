package org.hklearning.creational.simplefactory;

public class NotificationFactory {
    public static Notification getNotificationMode(String mode){
        return switch (mode.toLowerCase()) {
            case "sms" -> new SMSNotification();
            case "email" -> new EmailNotification();
            case "push" -> new PushNotification();
            default -> throw new IllegalArgumentException("Invalid argument provided by user");
        };
    }
}
