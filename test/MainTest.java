package test;

import src.Musician;
import src.Engineer;
import src.Equipment;

public class MainTest {
    public static void main(String[] args) {
        // Test musician creation
        Musician musician = new Musician("Alice", "Violin");
        musician.record();
        musician.finishSession();

        // Test engineer
        Engineer engineer = new Engineer("Bob", "Mixing Engineer");
        engineer.mixTrack();
        engineer.finishSession();

        // Test equipment
        Equipment guitar = new Equipment("Guitar");
        guitar.checkStatus();
        guitar.assignToSession();
        guitar.finishSession();
    }
}