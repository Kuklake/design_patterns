package pl.sda.java.designPatterns.behavioral.memento;

public class Memento {

    private State state;

    public Memento(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "state=" + state +
                '}';
    }
}

