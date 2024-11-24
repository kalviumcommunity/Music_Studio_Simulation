package src;

public class Musician extends SessionMember {
    private String instrument;
    private boolean available;

    // Constructor
    public Musician(String name, String instrument) {
        super(name);
        this.instrument = instrument;
        this.available = true;
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

    // Overloaded record method
    public void record() {
        if (this.available) {
            System.out.println(getName() + " is recording with " + this.instrument + ".");
            this.available = false;
        } else {
            System.out.println(getName() + " is currently unavailable.");
        }
    }

    // Overloaded record method with instruction
    public void record(String instruction) {
        if (this.available) {
            System.out.println(getName() + " is recording with " + this.instrument + ". Instruction: " + instruction);
            this.available = false;
        } else {
            System.out.println(getName() + " is currently unavailable.");
        }
    }

    // Method to finish session (Overridden method)
    @Override
    public void finishSession() {
        if (!this.available) {
            this.available = true;
            System.out.println(getName() + " has finished their recording session.");
        } else {
            System.out.println(getName() + " was already marked as available.");
        }
    }
}
