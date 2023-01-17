import java.util.*;

class Command {
    private String command;

    public Command(String command) {
        this.command = command;
    }

    public void operation() {
        System.out.println(command);
    }
}

class CommandQueue {
    private Queue<Command> queue;

    public CommandQueue() {
        queue = new LinkedList<Command>();
    }

    public void addCommand(Command command) {
        queue.add(command);
    }

    public Queue<Command> getQueue() {
        return queue;
    }
}

class CommandConsumer {
    public void consumeCommands(Queue<Command> queue) {
        while (!queue.isEmpty()) {
            Command command = queue.poll();
            command.operation();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        CommandQueue commandQueue = new CommandQueue();
        commandQueue.addCommand(new Command("Command 1"));
        commandQueue.addCommand(new Command("Command 2"));
        commandQueue.addCommand(new Command("Command 3"));
        commandQueue.addCommand(new Command("Command 4"));

        CommandConsumer commandConsumer = new CommandConsumer();
        commandConsumer.consumeCommands(commandQueue.getQueue());
    }
}

