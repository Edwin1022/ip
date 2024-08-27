package friday.command;

import friday.util.Storage;
import friday.util.TaskList;
import friday.util.Ui;

import java.time.LocalDate;

/**
 * Represents a command to list tasks occurring on a specific date.
 * Inherits from the Command class and provides functionality to filter and display tasks based on a given date.
 */
public class OnCommand extends Command {
    private LocalDate date;

    /**
     * Constructs an OnCommand with the specified date.
     *
     * @param date The date for which tasks need to be listed.
     */
    public OnCommand(LocalDate date) {
        this.date = date;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        ui.showSpecificTasks(tasks, date);
    }

    @Override
    public boolean isExit() {
        return false;
    }
}