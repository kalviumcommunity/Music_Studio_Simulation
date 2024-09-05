public class Engineer {
    private String name;
    private String role;

    public Engineer(String name, String role) {
        // Correctly assign instance variables
        this.name = name;
        this.role = role;
    }

    public void mixTrack() {
        // Display mixing message
        System.out.println(name + " is mixing the track.");
    }
}
