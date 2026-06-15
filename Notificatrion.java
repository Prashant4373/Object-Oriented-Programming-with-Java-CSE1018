public class Notificatrion {
    
}
class Notification {
    void send() {
        System.out.println("Sending notification");
    }
}
class Email extends Notification {
    @Override
    void send() {
        System.out.println("Sending Email");
    }
}
class SMS extends Notification {
    @Override
    void send() {
        System.out.println("Sending SMS");
    }
}
public class MessagingApp {
    public static void main(String[] args) {
        Notification n1 = new Email();
        Notification n2 = new SMS();
        n1.send();
        n2.send();
    }
}
