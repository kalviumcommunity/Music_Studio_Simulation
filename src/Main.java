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

        // Create some equipment
        Equipment mic = new Equipment("Microphone");
        Equipment mixer = new Equipment("Mixer");

        // Simulate a recording session
        System.out.println("\n--- Recording Session Start ---");
        for (Musician musician : musicians) {
            musician.record();
        }

        // Check equipment status and assign them to sessions
        System.out.println("\n--- Equipment Check ---");
        mic.checkStatus();
        mixer.checkStatus();
        
        mic.assignToSession();
        mixer.assignToSession();

        // Engineer mixing the track
        System.out.println("\n--- Mixing Session ---");
        soundEngineer.mixTrack();

        // Complete the session
        System.out.println("\n--- Session Complete ---");
        for (Musician musician : musicians) {
            musician.finishSession();
        }

        mic.finishSession();
        mixer.finishSession();
        soundEngineer.finishSession();
    }
}