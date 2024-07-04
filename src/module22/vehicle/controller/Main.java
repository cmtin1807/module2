package module22.vehicle.controller;

import java.io.*;
import java.util.Scanner;

import static module22.vehicle.service.FactoryVehicle.*;
import static module22.vehicle.service.IView.*;
import static module22.vehicle.service.ReadAndWrite.*;
import static module22.vehicle.service.VehicleManager.*;


public class Main {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        loadFileTruck(fileTruck, truckManager);
        loadFileCar(fileCar, carManager);
        loadFileMotorBike(fileMotorBike, motorBikeManager);
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case ADD_VEHICLE:
                    functionAddVehicle(scanner);
                    break;
                case SHOW_VEHICLE :
                    functionDisplayVehicle(scanner);
                    break;
                case REMOVE_VEHICLE:
                    functionRemoveVehicle(scanner, fileTruck, truckManager, carManager, fileCar, motorBikeManager);
                    break;
                case EXIT:
                    System.exit(0);
                default:
                    System.out.println("Vui long nhap lai");
            }
        }
    }




}
