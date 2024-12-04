package src;

// Responsible for tracking sessions (SRP)
public class SessionTracker {
    private static int totalSessions = 0;

    public static void incrementSessions() {
        totalSessions++;
    }

    public static void showStats() {
        System.out.println("Total Mixing Sessions Handled: " + totalSessions);
    }
}
