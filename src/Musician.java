package src;

public class Musician extends SessionMember implements RecordingTask {
    private String instrument;

    public Musician(String name, String instrument) {
        super(name);
        this.instrument = instrument;
    }

    @Override
    public void record() {
        System.out.println(getName() + " is recording with " + instrument + ".");
    }
}
