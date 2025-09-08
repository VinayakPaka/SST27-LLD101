package com.example.notifications;

/**
 * Starter demo that uses only the existing Email notifier.
 * TODOs guide you to add decorators and compose them.
 */
public class Demo {
    public static void main(String[] args) {
        Notifier base = new EmailNotifier("user@example.com");

        // Baseline behavior (already works)
        base.notify("Baseline email only.");

        Notifier emailSms = new SmsDecorator(base, "+91-99999-11111");
        emailSms.notify("Email + SMS");

        Notifier emailWa = new WhatsAppDecorator(base, "user_wa");
        emailWa.notify("Email + WhatsApp");

        Notifier emailSlack = new SlackDecorator(base, "alerts");
        emailSlack.notify("Email + Slack");

        Notifier emailWaSlack = new SlackDecorator(new WhatsAppDecorator(base, "user_wa"), "deployments");
        emailWaSlack.notify("Email + WhatsApp + Slack");
    }
}
