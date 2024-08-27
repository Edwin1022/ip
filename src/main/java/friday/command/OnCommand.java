package friday.command;

import friday.util.Storage;
import friday.util.TaskList;
import friday.util.Ui;

import java.time.LocalDate;

public class OnCommand extends Command {
    private LocalDate date;

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
