package src;

public class Main {
    public static void main(String[] args) {
        // Create an array of musicians
        Musician[] musicians = {
            new Musician("John", "Guitar"),
            new Musician("Emily", "Piano"),
            new Musician("James", "Drums")
        };

        // Create an engineer
        Engineer soundEngineer = new Engineer("Lucas", "Sound Engineer");

        // Create equipment
        Equipment mic = new Equipment("Microphone");
        Equipment mixer = new Equipment("Mixer");

        // Simulate a recording session
        System.out.println("\n--- Recording Session Start ---");
        for (Musician musician : musicians) {
            musician.record();
        }

        // Equipment status
        System.out.println("\n--- Equipment Check ---");
        mic.assignToSession();
        mixer.assignToSession();

        // Mixing
        System.out.println("\n--- Mixing Session ---");
        soundEngineer.mixTrack();

        // Session completion
        System.out.println("\n--- Session Complete ---");
        for (Musician musician : musicians) {
            musician.finishSession();
        }

        mic.finishSession();
        mixer.finishSession();
        soundEngineer.finishSession();

        // Show session stats
        System.out.println("\n--- Engineer Overview ---");
        SessionTracker.showStats();
    }
}
