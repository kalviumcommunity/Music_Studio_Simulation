package src;

public class Musician extends SessionMember {
    private String instrument; // Specific to musicians
    private boolean available;
    private static int totalMusicians = 0; // Static variable for tracking musicians

    // Constructor
    public Musician(String name, String instrument) {
        super(name); // Call to parent constructor
        this.instrument = instrument;
        this.available = true;
        totalMusicians++;
    }

    // Accessor methods
    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Record method
    public void record() {
        if (this.available) {
            System.out.println(getName() + " is recording with " + this.instrument + ".");
            this.available = false;
        } else {
            System.out.println(getName() + " is currently unavailable.");
        }
    }

    // Overridden method from SessionMember
    @Override
    public void finishSession() {
        if (!this.available) {
            this.available = true;
            System.out.println(getName() + " has finished their recording session.");
        } else {
            System.out.println(getName() + " was already marked as available.");
        }
    }

    // Static method to track total musicians
    public static int getTotalMusicians() {
        return totalMusicians;
    }
}
