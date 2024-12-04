package src;

public abstract class SessionMember {
    private String name;

    public SessionMember(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void finishSession();
}
