package friday.command;

import java.io.IOException;

import friday.task.Task;
import friday.util.Storage;
import friday.util.TaskList;
import friday.util.Ui;

/**
 * Represents a command to mark a task as not done.
 * Inherits from the Command class and provides functionality to update the status of a task to not done.
 */
public class UnmarkCommand extends Command {
    private int index;

    /**
     * Constructs an UnmarkCommand with the specified task index.
     *
     * @param index The index of the task to be marked as not done.
     */
    public UnmarkCommand(int index) {
        this.index = index;
    }

    @Override
    public String execute(TaskList tasks, Ui ui, Storage storage) {
        Task task = tasks.unmarkTaskAsDone(index);
        if (task != null) {
            try {
                storage.save(tasks.getTasks());
            } catch (IOException e) {
                ui.showError("An error occurred while saving the task.");
            }
            return ui.showUnmarkedTask(task);
        } else {
            return ui.showError("Task not found.");
        }
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
