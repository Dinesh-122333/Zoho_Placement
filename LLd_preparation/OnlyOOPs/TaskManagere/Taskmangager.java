package LLd_preparation.OnlyOOPs.TaskManagere;

import java.util.*;

public class Taskmangager {
    private Map<Integer, Task> taskMap;
    private TreeMap<String, List<Task>> priortyMap;

    public Taskmangager(){
        this.taskMap = new HashMap<>();
        this.priortyMap = new TreeMap<>();
    }

//    Getter
    public Map<Integer, Task> getTaskMap() {
        return taskMap;
    }

    public TreeMap<String, List<Task>> getPriortyMap() {
        return priortyMap;
    }

    //    Setter
    public void setTaskMap(int id, Task t) {
        this.taskMap.putIfAbsent(id, t);
    }

    public void setPriortyMap(String priority, Task t) {
        this.priortyMap.putIfAbsent(priority, new ArrayList<>());
        this.priortyMap.get(priority).add(t);
    }
}
