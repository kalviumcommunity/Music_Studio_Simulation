package src;

public abstract class SessionMember {
    private String name; // Private for encapsulation

    public SessionMember(String name) { // Constructor
        this.name = name;
    }

    // Public accessor for name
    public String getName() {
        return name;
    }

    // Public mutator for name
    public void setName(String name) {
        this.name = name;
    }

    // Abstract method to be implemented by subclasses
    public abstract void finishSession();
}
