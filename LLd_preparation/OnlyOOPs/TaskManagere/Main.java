package LLd_preparation.OnlyOOPs.TaskManagere;


import java.util.*;

public class Main {
    static Scanner sc  = new Scanner(System.in);
    public static void main(String[] args) {
        boolean loop = true;

        Taskmangager taskmangager = new Taskmangager();
        while (loop){
            System.out.println(" 1. Enter the task\n 2. Display task");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    boolean tasks = true;
                    while (tasks) {
                        System.out.print("Enter your Choice (1 - enter task / 0 - end): ");
                        int userChoice = sc.nextInt();
                        sc.nextLine(); // Consume the newline after nextInt()

                        if (userChoice == 0) {
                            tasks = false;
                        } else if (userChoice == 1) {
                            System.out.println("Enter the Task Name: ");
                            String task = sc.nextLine();// Now correctly takes user input

                            System.out.println("Enter the Task description: ");
                            String taskDescription = sc.nextLine();

                            System.out.println("Enter the due date (yyyy-mm-dd): ");
                            String date = sc.nextLine();

                            System.out.println("Enter Priority (LOW/MEDIUM/HIGH): ");
                            String priority = sc.nextLine();

                            Task tasker = new Task(task, taskDescription, date);
                            if (!priority.isEmpty()){
                                tasker.setPriority(priority);
                            }

                            taskmangager.setTaskMap(tasker.getId(), tasker);
                            taskmangager.setPriortyMap(tasker.getPriority(), tasker);
                        }
                    }

                    break;

                case 2:
                    TreeMap<String, List<Task>> prioritytaskMap = taskmangager.getPriortyMap();
                    for (Map.Entry<String, List<Task>> pTask: prioritytaskMap.entrySet()){
                        System.out.println("------" + pTask.getKey() + "-------");
                        List<Task> taskList = pTask.getValue();
                        for (int i = 0; i < taskList.size(); i++){
                            System.out.print("Task id: " + taskList.get(i).getId() + " | " + "Task Name: " + taskList.get(i).getTaskName() + " | ");
                            System.out.print("Task Description: " + taskList.get(i).getDescription() + " | " + "Due Date: " + taskList.get(i).getDueDate());
                            System.out.print("Priority: " + taskList.get(i).getPriority() + " | ");
                            System.out.println();
                        }
                    }

//                    Map<Integer, Task> taskMap = taskmangager.getTaskMap();
//                    for (Map.Entry<Integer, Task> task: taskMap.entrySet()){
//                        System.out.print("Task id: " + task.getKey() + " | " + "Task Name: " + task.getValue().getTaskName() + " | ");
//                        System.out.print("Task Description: " + task.getValue().getDescription() + " | " + "Due Date: " + task.getValue().getDueDate());
//                        System.out.println();
//                    }
                    break;

                default:
                    System.out.println("the system ends");
                    break;
            }
        }
        sc.close();
    }
}
