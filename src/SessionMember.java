package src;

public abstract class SessionMember {
    private String name;

    public SessionMember(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Abstract method to be overridden by subclasses
    public abstract void finishSession();
}
