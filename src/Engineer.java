package src;

public class Engineer {
    private String name;
    private String role;  // "Sound Engineer" or "Mixing Engineer"
    private boolean available;

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
        } else {
            System.out.println(this.name + " is busy.");
        }
    }

    // Function to master a track
    public void masterTrack() {
        if (this.available) {
            System.out.println(this.name + " is mastering the track.");
            this.available = false;  // The engineer is busy while mastering
        } else {
            System.out.println(this.name + " is busy.");
        }
    }

    // Function to finish a session and make the engineer available again
    public void finishSession() {
        this.available = true;
        System.out.println(this.name + " has finished their task.");
    }

    // Getter for availability
    public boolean isAvailable() {
        return this.available;
    }
}