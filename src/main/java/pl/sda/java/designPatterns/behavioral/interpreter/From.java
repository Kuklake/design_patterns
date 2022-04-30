package pl.sda.java.designPatterns.behavioral.interpreter;

import java.util.List;

public class From implements Expression{

    private String table;
    private Where where;

    From(String table) {
        this.table = table;
    }

    From(String table, Where where) {
        this.table = table;
        this.where = where;
    }

    @Override
    public List<String> interpret(Context context) {
        context.setTable(table);
        return where == null ? context.search() : where.interpret(context);
    }
}
