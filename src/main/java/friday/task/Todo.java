package friday.task;

public class Todo extends Task {
    public Todo(String description) {
        this(description, false);
    }

    public Todo(String description, boolean isDone) {
        super(description, isDone);
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }

    @Override
    public String toFileFormat() {
        return "T | " + (super.getIsDone() ? "1" : "0") + " | " + super.getDescription();
    }
}