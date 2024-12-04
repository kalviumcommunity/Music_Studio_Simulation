package src;

public class Engineer extends SessionMember {
    private String role;
    private boolean available;

    public Engineer(String name, String role) {
        super(name);
        this.role = role;
        this.available = true;
    }

    public void mixTrack() {
        if (this.available) {
            System.out.println(getName() + " is mixing the track.");
            this.available = false;
            SessionTracker.incrementSessions();
        } else {
            System.out.println(getName() + " is busy.");
        }
    }

    @Override
    public void finishSession() {
        this.available = true;
        System.out.println(getName() + " has finished their task.");
    }
}
