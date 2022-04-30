package pl.sda.java.designPatterns.behavioral.interpreter;

import java.util.List;
import java.util.function.Predicate;

public class Where implements Expression {

    private Predicate<String> filter;

    Where(Predicate<String> filter) {
        this.filter = filter;
    }

    @Override
    public List<String> interpret(Context context) {
        context.setFilter(filter);
        return context.search();
    }
}
