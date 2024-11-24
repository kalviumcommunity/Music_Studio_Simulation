package src;

public class Musician extends SessionMember {
    private String instrument; // Private for encapsulation
    private boolean available;
    private static int totalMusicians = 0; // Static variable

    // Constructor
    public Musician(String name, String instrument) {
        super(name); // Call to parent constructor
        this.instrument = instrument;
        this.available = true;
        totalMusicians++;
    }

    // Accessors and mutators
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
            System.out.println(getName() + " is recording with " + this.instrument);
            this.available = false;
        } else {
            System.out.println(getName() + " is currently unavailable.");
        }
    }

    // Overridden method from SessionMember
    @Override
    public void finishSession() {
        this.available = true;
        System.out.println(getName() + " has finished their recording session.");
    }

    // Static method
    public static int getTotalMusicians() {
        return totalMusicians;
    }
}
