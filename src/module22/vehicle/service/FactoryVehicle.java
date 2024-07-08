package module22.vehicle.service;

import module22.vehicle.model.Car;
import module22.vehicle.model.MotorBike;
import module22.vehicle.model.Truck;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static module22.vehicle.service.CarManager.*;
import static module22.vehicle.service.MotorBikeManager.*;
import static module22.vehicle.service.TruckManager.*;
import static module22.vehicle.template.DisplayProgram.*;


public class FactoryVehicle {
    public static String linkFileTruck = "src/module22/vehicle/data/xeTai.csv";
    public static String linkFileCar = "src/module22/vehicle/data/oto.csv";
    public static String linkFileMotorBike = "src/module22/vehicle/data/xeMay.csv";
    public static List<Truck> truckManager = new ArrayList<>();
    public static List<Car> carManager = new ArrayList<>();
    public static List<MotorBike> motorBikeManager = new ArrayList<>();
    public static File fileTruck = new File(linkFileTruck);
    public static File fileCar = new File(linkFileCar);
    public static File fileMotorBike = new File(linkFileMotorBike);

    public static void functionAddVehicle(Scanner scanner) throws IOException {
        boolean addVehicle = true;
        while (addVehicle) {
            int choiceThem = getChoiceAddVehicle(scanner);
            switch (choiceThem) {
                case 1:
                    addVehicleTruck(scanner, truckManager, fileTruck);
                    break;
                case 2:
                    addVehicleCar(scanner, carManager, fileCar);
                    break;
                case 3:
                    addVehicleMotorBike(scanner, motorBikeManager, fileMotorBike);
                    break;
                case 4:
                    System.out.println("Đã thoát ra khỏi chương trình thêm phương tiện");
                    addVehicle = false;
                    break;
                default:
                    System.out.println("Chức năng bạn chọn không phù hợp. Vui lòng chọn lại");
            }
        }

    }


    public static void functionDisplayVehicle(Scanner scanner) throws IOException {
        boolean displayVehicle = true;
        while (displayVehicle) {
            int choiceDisplay = getChoiceDisplayVehicle(scanner);
            switch (choiceDisplay) {
                case 1:
                    displayTruck(fileTruck, truckManager);
                    break;
                case 2:
                    displayCar(fileCar, carManager);
                    break;
                case 3:
                    displayMotorBike(fileMotorBike, motorBikeManager);
                    break;
                case 4:
                    System.out.println("Đã thoát ra khỏi chương trình hiển thị phương tiện");
                    displayVehicle = false;
                    break;
                default:
                    System.out.println("Chức năng bạn chọn không phù hợp. Vui lòng chọn lại");

            }
        }
    }

    public static void functionRemoveVehicle(Scanner scanner, File fileTruck, List<Truck> truckManager, List<Car> carManager, File fileCar, List<MotorBike> motorBikeManager) throws IOException {
        boolean removeVehicle = true;
        while (removeVehicle) {
            int ChoiceRemove = getChoiceRemoveVehicle(scanner);
            switch (ChoiceRemove) {
                case 1:
                    removeVehicleTruck(scanner, fileTruck, truckManager);
                    break;
                case 2:
                    removeVehicleCar(scanner,  fileCar, carManager);
                    break;
                case 3:
                    removeVehicleMotorBike(scanner, fileMotorBike, motorBikeManager);
                    break;
                case 4:
                    System.out.println("Đã thoát ra khỏi chương trình xóa phương tiện");
                    removeVehicle = false;
                    break;
                default:
                    System.out.println("Chức năng bạn chọn không phù hợp. Vui lòng chọn lại");

            }
        }
    }




}
