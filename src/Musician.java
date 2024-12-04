package src;

public class Musician extends SessionMember {
    private String instrument;
    private boolean available;

    public Musician(String name, String instrument) {
        super(name);
        this.instrument = instrument;
        this.available = true;
    }

    public void record() {
        if (this.available) {
            System.out.println(getName() + " is recording with " + this.instrument + ".");
            this.available = false;
        } else {
            System.out.println(getName() + " is currently unavailable.");
        }
    }

    @Override
    public void finishSession() {
        this.available = true;
        System.out.println(getName() + " has finished their recording session.");
    }
}
