class MessagingApp {
    // Text only
    public void displayMessage(String text) {
        System.out.println("Message: " + text);
    }

    // Text + username
    public void displayMessage(String text, String username) {
        System.out.println(username + ": " + text);
    }

    // Text + username + timestamp
    public void displayMessage(String text, String username, String timestamp) {
        System.out.println("[" + timestamp + "] " + username + ": " + text);
    }

    public static void main(String[] args) {
        MessagingApp m = new MessagingApp();
        m.displayMessage("Hello!");
        m.displayMessage("Hello!", "Prashant");
        m.displayMessage("Hello!", "Prashant", "14-06-2026 16:00");
    }
}
