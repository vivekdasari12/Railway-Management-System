package railwayManagementSystem;

import java.util.*;

public class RailwaySystem {
    private Train[] trains;
    private Station[] stations;
    private Stack<Train> trainStack;
    private int trainCount;
    private int stationCount;

    public RailwaySystem(int maxTrains, int maxStations) {
        trains = new Train[maxTrains];
        stations = new Station[maxStations];
        trainStack = new Stack<>();
        trainCount = 0;
        stationCount = 0;
    }

    public void addTrain(Train train) {
        if (trainCount < trains.length) {
            trains[trainCount++] = train;
            trainStack.push(train);
        } else {
            System.out.println("Cannot add more trains");
        }
    }

    public void addStation(Station station) {
        if (stationCount < stations.length) {
            stations[stationCount++] = station;
        } else {
            System.out.println("Cannot add more stations");
        }
    }

    public void scheduleTrain(String trainId, String stationName) {
        Train train = searchTrainById(trainId);
        if (train != null) {
            train.addStop(stationName);
        } else {
            System.out.println("Train not found");
        }
    }

    public Train searchTrainById(String id) {
        for (Train train : trains) {
            if (train != null && train.getId().equals(id)) {
                return train;
            }
        }
        return null;
    }

    public void listAllTrains() {
        for (Train train : trains) {
            if (train != null) {
                System.out.println(train);
            }
        }
    }

    public void listAllStations() {
        for (Station station : stations) {
            if (station != null) {
                System.out.println(station);
            }
        }
    }

    public void showTrainSchedule(String trainId) {
        Train train = searchTrainById(trainId);
        if (train != null) {
            System.out.println("Schedule for train " + train.getName() + ": " + train.getSchedule());
        } else {
            System.out.println("Train not found");
        }
    }

    public void sortTrainsByName() {
        Arrays.sort(trains, 0, trainCount, Comparator.comparing(Train::getName));
        
    }
}
