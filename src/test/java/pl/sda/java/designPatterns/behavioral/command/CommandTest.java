package pl.sda.java.designPatterns.behavioral.command;

import org.junit.jupiter.api.Test;
import pl.sda.java.designPatterns.behavioral.command.command.OpenTextFileCommand;
import pl.sda.java.designPatterns.behavioral.command.command.SaveTextFileCommand;
import pl.sda.java.designPatterns.behavioral.command.command.TextFileCommand;
import pl.sda.java.designPatterns.behavioral.command.invoker.TextFileCommandExecutor;
import pl.sda.java.designPatterns.behavioral.command.receiver.TextFile;

import static org.junit.jupiter.api.Assertions.*;

class CommandTest {

    private final String podanie = "podanie";

    @Test
    void shouldOpenTextFile() {
        TextFileCommand openTextFile = new OpenTextFileCommand(new TextFile(podanie));

        TextFileCommandExecutor executor = new TextFileCommandExecutor();

        String command = executor.executeCommand(openTextFile);
        assertEquals("opening file " + podanie, command );
    }

    @Test
    void shouldSaveTextFile() {
        TextFileCommand saveTextFileCommand = new SaveTextFileCommand(new TextFile(podanie));
        TextFileCommandExecutor executor = new TextFileCommandExecutor();

        String command = executor.executeCommand(saveTextFileCommand);

        assertEquals("saving file " + podanie, command);
    }
}