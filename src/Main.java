package src;

public class Main {
    public static void main(String[] args) {
        // Creating session members and equipment
        Musician musician = new Musician("John", "Guitar");
        Engineer engineer = new Engineer("Lucas", "Sound Engineer");

        System.out.println("--- Session Tasks ---");
        musician.record();  // Musicians perform recording
        engineer.mixTrack();  // Engineers perform mixing
    }
}
