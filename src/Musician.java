package src;

public class Musician extends SessionMember {
    private String instrument;
    private boolean available;
    private static int totalMusicians = 0;

    // Constructor
    public Musician(String name, String instrument) {
        super(name);
        this.instrument = instrument;
        this.available = true;
        totalMusicians++;
    }

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

    // Overloaded method to record with or without additional instructions
    public void record() {
        if (this.available) {
            System.out.println(getName() + " is recording with " + this.instrument + ".");
            this.available = false;
        } else {
            System.out.println(getName() + " is currently unavailable.");
        }
    }

    // Overloaded method to record with additional instruction
    public void record(String instruction) {
        if (this.available) {
            System.out.println(getName() + " is recording with " + this.instrument + ". Instruction: " + instruction);
            this.available = false;
        } else {
            System.out.println(getName() + " is currently unavailable.");
        }
    }

    @Override
    public void finishSession() {
        if (!this.available) {
            this.available = true;
            System.out.println(getName() + " has finished their recording session.");
        } else {
            System.out.println(getName() + " was already marked as available.");
        }
    }

    public static int getTotalMusicians() {
        return totalMusicians;
    }
}
