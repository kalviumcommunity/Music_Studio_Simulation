package src;

public class Engineer {
    private String name;
    private String role; // "Sound Engineer" or "Mixing Engineer"
    private boolean available;

    // Static variable to track total mixing sessions
    private static int totalSessions = 0;

    // Constructor
    public Engineer(String name, String role) {
        this.name = name;
        this.role = role;
        this.available = true; // Engineers are available by default
    }

    // Accessor for name
    public String getName() {
        return name;
    }

    // Mutator for name
    public void setName(String name) {
        this.name = name;
    }

    // Accessor for role
    public String getRole() {
        return role;
    }

    // Mutator for role
    public void setRole(String role) {
        this.role = role;
    }

    // Accessor for availability
    public boolean isAvailable() {
        return available;
    }

    // Mutator for availability
    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Function to mix a track
    public void mixTrack() {
        if (this.available) {
            System.out.println(this.name + " is mixing the track.");
            this.available = false; // The engineer is busy while mixing
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

    // Static method to provide an overview of the engineer's work
    public static void showEngineerOverview() {
        System.out.println("Total Mixing Sessions Handled: " + getTotalSessions());
        System.out.println("Engineers ensure high-quality sound and track mixing.");
    }
}
