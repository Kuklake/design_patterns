package pl.sda.java.designPatterns.behavioral.memento;

public class Originator {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Memento save(){
        return new Memento(state);
    }

    public void restore(Memento memento) {
        state = memento.getState();
    }
}
