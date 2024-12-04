package src;

public class Main {
    public static void main(String[] args) {
        SessionMember[] members = {
            new Musician("John", "Guitar"),
            new Engineer("Lucas", "Sound Engineer")
        };

        Equipment mic = new Equipment("Microphone");

        System.out.println("--- Session Tasks ---");
        for (SessionMember member : members) {
            member.performSessionTask();
        }
        mic.performSessionTask();
    }
}
