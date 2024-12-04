package test;

import src.Musician;
import src.Engineer;
import src.Equipment;
import src.SessionTracker;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("--- Testing Musician Functionality ---");
        Musician musician = new Musician("Alice", "Violin");
        musician.record();
        musician.finishSession();

        System.out.println("\n--- Testing Engineer Functionality ---");
        Engineer engineer = new Engineer("Bob", "Mixing Engineer");
        engineer.mixTrack();
        engineer.finishSession();

        System.out.println("\n--- Testing Equipment Functionality ---");
        Equipment guitar = new Equipment("Guitar");
        guitar.performSessionTask();
        guitar.finishSession();

        System.out.println("\n--- Testing Session Tracker ---");
        SessionTracker.showStats();
    }
}
