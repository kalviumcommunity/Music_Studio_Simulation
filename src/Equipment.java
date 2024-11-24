package src;

public class Equipment {
    private String type;
    private boolean inUse;
    private boolean isFaulty;

    // Constructor
    public Equipment(String type) {
        this.type = type;
        this.inUse = false;
        this.isFaulty = false;
    }

    public void checkStatus() {
        if (this.isFaulty) {
            System.out.println(this.type + " is faulty and needs repair.");
        } else if (this.inUse) {
            System.out.println(this.type + " is currently in use.");
        } else {
            System.out.println(this.type + " is available for use.");
        }
    }

    public void assignToSession() {
        if (!this.inUse && !this.isFaulty) {
            System.out.println(this.type + " is now assigned to a session.");
            this.inUse = true;
        } else {
            System.out.println(this.type + " cannot be assigned.");
        }
    }

    public void finishSession() {
        this.inUse = false;
        System.out.println(this.type + " is now available after the session.");
    }
}
