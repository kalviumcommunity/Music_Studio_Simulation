package src;

public class Equipment {
    private String type;
    private boolean inUse;

    public Equipment(String type) {
        this.type = type;
        this.inUse = false;
    }

    public void assignToSession() {
        if (!this.inUse) {
            System.out.println(this.type + " is now assigned to a session.");
            this.inUse = true;
        } else {
            System.out.println(this.type + " is already in use.");
        }
    }

    public void finishSession() {
        this.inUse = false;
        System.out.println(this.type + " is now available after the session.");
    }
}
