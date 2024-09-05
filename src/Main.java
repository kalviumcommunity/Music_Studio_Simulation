public class Main {
    public static void main(String[] args) {
        // Create objects for musicians, engineers, and equipment
        Musician musician1 = new Musician("John", "Guitar");
        Musician musician2 = new Musician("Emily", "Piano");
        
        Engineer soundEngineer = new Engineer("Lucas", "Sound Engineer");
        Equipment mic = new Equipment("Microphone");

        // Demonstrate basic actions by calling methods on the objects
        musician1.record();
        musician2.record();
        
        soundEngineer.mixTrack();
        
        mic.assignToSession();
    }
}
