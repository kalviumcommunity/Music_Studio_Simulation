package src;

public class Engineer {
    private String name;
    private String role;  // "Sound Engineer" or "Mixing Engineer"
    private boolean available;

    // Static variable to track total mixing sessions
    private static int totalSessions = 0;

    // Constructor
    public Engineer(String name, String role) {
        this.name = name;
        this.role = role;
        this.available = true;  // Engineers are available by default
    }

    // Function to mix a track
    public void mixTrack() {
        if (this.available) {
            System.out.println(this.name + " is mixing the track.");
            this.available = false;  // The engineer is busy while mixing
            totalSessions++; // Increment the session counter
        } else {
            System.out.println(this.name + " is busy.");
        }
    }

    // Function to finish a session and make the engineer available again
    public void finishSession() {
        this.available = true;
        System.out.println(this.name + " has finished their task.");
    }

    // Static method to get total mixing sessions
    public static int getTotalSessions() {
        return totalSessions;
    }
}
