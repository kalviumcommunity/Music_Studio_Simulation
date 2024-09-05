public class Musician {
    private String name;
    private String instrument;

    public Musician(String name, String instrument) {
        // Correctly assign instance variables
        this.name = name;
        this.instrument = instrument;
    }

    public void record() {
        // Display which musician is recording
        System.out.println(name + " is recording with " + instrument);
    }
}
