package pl.sda.java.designPatterns.behavioral.mediator;

public class Spouse {
    private String name;
    private Role role;

    public Spouse(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public String sendMsg(String msg) {
        return Mediator.accommodate(this, msg);
    }
}
