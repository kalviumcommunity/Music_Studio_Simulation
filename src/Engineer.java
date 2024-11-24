package src;

public class Engineer extends SessionMember {
    private String role;
    private boolean available;
    private static int totalSessions = 0;

    // Constructor
    public Engineer(String name, String role) {
        super(name);
        this.role = role;
        this.available = true;
    }

    // Overloaded method to mix track with or without a specific equipment type
    public void mixTrack() {
        if (this.available) {
            System.out.println(getName() + " is mixing the track.");
            this.available = false;
            totalSessions++;
        } else {
            System.out.println(getName() + " is busy.");
        }
    }

    // Overloaded method to mix track with specified equipment
    public void mixTrack(String equipmentType) {
        if (this.available) {
            System.out.println(getName() + " is mixing the track using " + equipmentType + ".");
            this.available = false;
            totalSessions++;
        } else {
            System.out.println(getName() + " is busy.");
        }
    }

    @Override
    public void finishSession() {
        this.available = true;
        System.out.println(getName() + " has finished their task.");
    }

    public static int getTotalSessions() {
        return totalSessions;
    }

    public static void showEngineerOverview() {
        System.out.println("Total Mixing Sessions Handled: " + totalSessions);
    }
}
