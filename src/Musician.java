package src;

public class Musician extends SessionMember {
    private String instrument;

    public Musician(String name, String instrument) {
        super(name);
        this.instrument = instrument;
    }

    @Override
    public void performSessionTask() {
        System.out.println(getName() + " is recording with " + instrument + ".");
    }
}
