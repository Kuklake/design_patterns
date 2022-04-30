package pl.sda.java.designPatterns.behavioral.interpreter;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InterpreterTest {

    private Context context = new Context();

    @Test
    void shouldSelectAllNames() {
        Expression query = new Select("name", new From("Najlepsi"));
        List<String> result = query.interpret(context);
        assertEquals("[Nela, Zofia, Stanisław, Antoni]", result.toString());
    }

    @Test
    void shouldSelectNamesEndingWithA() {
        Expression query = new Select(
                "name",
                new From("Najlepsi", new Where(name -> name.toLowerCase().endsWith("a")))
        );
        List<String> result = query.interpret(context);
        assertTrue(result.contains("Nela"));
        assertTrue(result.contains("Zofia"));
        assertFalse(result.contains("Antoni"));
        assertFalse(result.contains("Stanisław"));
    }

    @Test
    void shouldFindAll() {
        Expression query = new Select("*", new From("Najlepsi"));
        List<String> result = query.interpret(context);
        assertEquals("[Nela Kuklake, Zofia Mądra, Stanisław Bogaty, Antoni Utalentowany]", result.toString());
    }
}