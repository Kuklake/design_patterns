package pl.sda.java.designPatterns.behavioral.iterator;

public class StringIterator implements Iterator<String> {

    private String[] names;
    private int index;

    public StringIterator(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        if (index < names.length) {
            return true;
        }
        return false;
    }

    @Override
    public String next() {
        if (this.hasNext()) {
            return names[index++];
        }
        return null;
    }
}