package src;

public class Engineer extends SessionMember implements MixingTask {
    private String role;

    public Engineer(String name, String role) {
        super(name);
        this.role = role;
    }

    @Override
    public void mixTrack() {
        System.out.println(getName() + " is mixing the track as a " + role + ".");
    }
}
