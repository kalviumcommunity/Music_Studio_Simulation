package src;

public class Equipment {
    private String type;

    public Equipment(String type) {
        this.type = type;
    }

    public void performSessionTask() {
        System.out.println(type + " is being used in the session.");
    }
}
