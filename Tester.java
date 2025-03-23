package railwayManagementSystem;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        RailwaySystem system = new RailwaySystem(10, 5);
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Railway Management:");
            System.out.println("1. Add Station");
            System.out.println("2. Add Train");
            System.out.println("3. Schedule Train");
            System.out.println("4. List All Trains");
            System.out.println("5. List All Stations");
            System.out.println("6. Show Train Schedule");
            System.out.println("7. Sort Trains by Name");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    System.out.print("Enter station name: ");
                    String stationName = scanner.nextLine();
                    Station station = new Station(stationName);
                    system.addStation(station);
                    System.out.println("Station added sucessfully");
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.print("Enter train ID: ");
                    String trainId = scanner.nextLine();
                    System.out.print("Enter train name: ");
                    String trainName = scanner.nextLine();
                    Train train = new Train(trainId, trainName);
                    system.addTrain(train);
                    System.out.println("Train added sucessfully");
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.print("Enter train ID: ");
                    String scheduleTrainId = scanner.nextLine();
                    System.out.print("Enter station name: ");
                    String scheduleStationName = scanner.nextLine();
                    system.scheduleTrain(scheduleTrainId, scheduleStationName);
                    System.out.println("Train scheduled sucessfully");
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println("All Trains:");
                    system.listAllTrains();
                    System.out.println(" ");
                    break;
                case 5:
                    System.out.println("All Stations:");
                    system.listAllStations();
                    System.out.println(" ");
                    break;
                case 6:
                    System.out.print("Enter train ID to show schedule: ");
                    String showTrainId = scanner.nextLine();
                    system.showTrainSchedule(showTrainId);
                    System.out.println(" ");
                    break;
                case 7:
                    system.sortTrainsByName();
                    System.out.println("Trains after sorting:");
                    system.listAllTrains();
                    System.out.println(" ");
                    break;
                case 8:
                    exit = true;
                    System.out.println("Exited");
                    System.out.println(" ");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
