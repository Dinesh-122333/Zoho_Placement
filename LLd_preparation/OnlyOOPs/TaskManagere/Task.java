package LLd_preparation.OnlyOOPs.TaskManagere;

public class Task {
    static private int tid = 101;
    private int id;
    private String taskName;
    private String description;
    private String dueDate;
    private String priority;

    public Task(String taskName, String description, String dueDate) {
        this.id = tid++;
        this.taskName = taskName;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = "Medium";
    }

//    getter
    public int getId() {
        return id;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }


    public String getPriority() {
        return priority;
    }

    //    setter
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
