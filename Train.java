package railwayManagementSystem;

import java.util.LinkedList;
import java.util.Queue;

public class Train {
    private String id;
    private String name;
    private Queue<String> schedule;

    public Train(String id, String name) {
        this.id = id;
        this.name = name;
        this.schedule = new LinkedList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Queue<String> getSchedule() {
        return schedule;
    }

    public void addStop(String stationName) {
        schedule.add(stationName);
    }

    @Override
    public String toString() {
        return "Train{id='" + id + "', name='" + name + "'}";
    }
}

