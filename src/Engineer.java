package src;

public class Engineer extends SessionMember {
    private String role; // Protected for subclass access
    private boolean available;
    private static int totalSessions = 0; // Static variable

    // Constructor
    public Engineer(String name, String role) {
        super(name); // Call to parent constructor
        this.role = role;
        this.available = true;
    }

    // Accessors and mutators
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Mix track method
    public void mixTrack() {
        if (this.available) {
            System.out.println(getName() + " is mixing the track.");
            this.available = false;
            totalSessions++;
        } else {
            System.out.println(getName() + " is busy.");
        }
    }

    // Overridden method from SessionMember
    @Override
    public void finishSession() {
        this.available = true;
        System.out.println(getName() + " has finished their task.");
    }

    // Static methods
    public static int getTotalSessions() {
        return totalSessions;
    }

    public static void showEngineerOverview() {
        System.out.println("Total Mixing Sessions Handled: " + totalSessions);
    }
}
