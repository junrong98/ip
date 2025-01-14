package funbox.task;

/**
 * The ToDo class which inherits from Task.
 */
public class ToDo extends Task {

    /**
     * The constructor for ToDo class
     *
     * @param description The task sent by the users
     * @param type The type of task.
     */
    public ToDo(String description, String type) {
        super(description, type);
    }

    /**
     * Return a string representation.
     *
     * @return Return a string.
     */
    @Override
    public String toString() {
        return "[T]" + super.toString() + "\nTags: " + super.showTags();
    }
}
