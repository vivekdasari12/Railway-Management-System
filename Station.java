package railwayManagementSystem;
import java.util.LinkedList;

public class Station {
    private String name;
    private LinkedList<Train> trains;

    public Station(String name) {
        this.name = name;
        this.trains = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Train> getTrains() {
        return trains;
    }

    public void addTrain(Train train) {
        trains.add(train);
    }

    @Override
    public String toString() {
        return "Station{name='" + name + "'}";
    }
}


