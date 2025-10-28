import java.util.*;
import java.util.function.Predicate;

class Notification {
    String type;
    String message;

    Notification(String type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return "[" + type + "] " + message;
    }
}

public class NotificationFilterDemo {
    public static void main(String[] args) {

        // Sample notifications
        List<Notification> alerts = Arrays.asList(
            new Notification("Critical", "High Heart Rate detected!"),
            new Notification("Info", "Your health report is ready."),
            new Notification("Reminder", "Doctor appointment at 5 PM."),
            new Notification("Critical", "Low Oxygen Level detected!"),
            new Notification("Info", "Weekly health summary available.")
        );

        System.out.println("=== All Notifications ===");
        alerts.forEach(System.out::println);

        // 🧠 Define Predicates (filters)
        Predicate<Notification> criticalOnly = n -> n.type.equalsIgnoreCase("Critical");
        Predicate<Notification> infoOnly = n -> n.type.equalsIgnoreCase("Info");
        Predicate<Notification> reminderOnly = n -> n.type.equalsIgnoreCase("Reminder");

        // 🩺 Example: Filter based on user preference (e.g., show only critical alerts)
        System.out.println("\n=== Showing Critical Alerts Only ===");
        alerts.stream()
              .filter(criticalOnly)
              .forEach(System.out::println);

        // Example 2: Show only Info alerts
        System.out.println("\n=== Showing Info Alerts Only ===");
        alerts.stream()
              .filter(infoOnly)
              .forEach(System.out::println);

        // Example 3:
