package pl.sda.java.designPatterns.behavioral.command.command;

import pl.sda.java.designPatterns.behavioral.command.receiver.TextFile;

public class OpenTextFileCommand implements TextFileCommand {

    private TextFile textFile;

    public OpenTextFileCommand(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.open();
    }
}
