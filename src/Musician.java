package src;

public class Musician {
    private String name;
    private String instrument;
    private boolean available;

    // Constructor
    public Musician(String name, String instrument) {
        this.name = name;
        this.instrument = instrument;
        this.available = true; // Musicians are available by default
    }

    // Record function
    public void record() {
        if (this.available) {
            System.out.println(this.name + " is recording with " + this.instrument);
            this.available = false; // Once recording, the musician is no longer available
        } else {
            System.out.println(this.name + " is currently unavailable.");
        }
    }

    // Retake function
    public void retake() {
        if (!this.available) {
            System.out.println(this.name + " is doing a retake.");
        } else {
            System.out.println(this.name + " has no recordings to retake.");
        }
    }

    // Function to make the musician available again after a session
    public void finishSession() {
        this.available = true;
        System.out.println(this.name + " has finished their recording session.");
    }

    // Getter for availability
    public boolean isAvailable() {
        return this.available;
    }
}