public class Equipment {
    private String type;

    public Equipment(String type) {
        // Correctly assign instance variables
        this.type = type;
    }

    public void assignToSession() {
        // Display equipment assignment
        System.out.println(type + " is now assigned to a session.");
    }
}
