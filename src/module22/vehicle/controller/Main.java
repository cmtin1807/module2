package module22.vehicle.controller;

import module22.vehicle.model.Car;
import module22.vehicle.model.MotorBike;
import module22.vehicle.model.Truck;
import module22.vehicle.model.Vehicle;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static module22.vehicle.service.CompanyManager.getCompany;
import static module22.vehicle.service.ReadAndWrite.*;
import static module22.vehicle.service.VehicleManager.*;


public class Main {
    public static String linkFileTruck = "src/module22/vehicle/data/xeTai.csv";
    public static String linkFileCar = "src/module22/vehicle/data/oto.csv";
    public static String linkFileMotorBike = "src/module22/vehicle/data/xeMay.csv";

    public static void main(String[] args) throws IOException {
        List<Truck> truckManager = new ArrayList<>();
        List<Car> carManager = new ArrayList<>();
        List<MotorBike> motorBikeManager = new ArrayList<>();
        File fileTruck = new File(linkFileTruck);
        File fileCar = new File(linkFileCar);
        File fileMotorBike = new File(linkFileMotorBike);
        Scanner scanner = new Scanner(System.in);
        loadFileTruck(fileTruck, truckManager);
        loadFileCar(fileCar, carManager);
        loadFileMotorBike(fileMotorBike, motorBikeManager);

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    boolean addVehicle = true;
                    while (addVehicle) {
                        menuAddVehicle();
                        int choiceThem = scanner.nextInt();
                        scanner.nextLine();
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
                                addVehicle = false;
                                break;
                            default:
                                System.out.println("Chức năng chọn không hợp lệ");
                        }
                    }
                    break;
                case 2:
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
                                displayVehicle = false;
                                break;
                            default:
                                System.out.println("Vui long nhap lai");

                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter chọn biển số xóa");
                    String licensePlatesRemove = scanner.nextLine();
                    boolean isLicensePlatesRemove = false;
                    loadFileTruck(fileTruck, truckManager);
                    List<Truck> trucksToKeep = new ArrayList<>();
                    for (Truck truck : truckManager) {
                        if (!truck.getLicensePlates().equals(licensePlatesRemove)) {
                            trucksToKeep.add(truck);
                        } else {
                            System.out.println("Xoa thanh cong " + truck);
                            isLicensePlatesRemove = true;
                        }
                    }
                    truckManager = trucksToKeep;
                    try (BufferedWriter bufferedWriterTruck = new BufferedWriter(new FileWriter(fileTruck))) {
                        for (Truck truck : truckManager) {
                            bufferedWriterTruck.write(truck.getInforToFile());
                            bufferedWriterTruck.newLine();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                    List<Car> carToKeep = new ArrayList<>();
                    for (Car car : carManager) {
                        if (!car.getLicensePlates().equals(licensePlatesRemove)) {
                            carToKeep.add(car);
                        } else {
                            System.out.println("Xoa thanh cong " + car);
                            isLicensePlatesRemove = true;
                        }
                    }
                    carManager = carToKeep;
                    try (BufferedWriter bufferedWriterCar = new BufferedWriter(new FileWriter(fileCar))) {
                        for (Car car : carManager) {
                            bufferedWriterCar.write(car.getInforToFile());
                            bufferedWriterCar.newLine();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    List<MotorBike> motorBikeToKeep = new ArrayList<>();
                    for (MotorBike motorBike : motorBikeManager) {
                        if (!motorBike.getLicensePlates().equals(licensePlatesRemove)) {
                            motorBikeToKeep.add(motorBike);
                        } else {
                            System.out.println("Xoa thanh cong " + motorBike);
                            isLicensePlatesRemove = true;
                        }
                    }
                    motorBikeManager = motorBikeToKeep;
                    try (BufferedWriter bufferedWriterMotorBike = new BufferedWriter(new FileWriter(fileTruck))) {
                        for (MotorBike motorBike : motorBikeManager) {
                            bufferedWriterMotorBike.write(motorBike.getInforToFile());
                            bufferedWriterMotorBike.newLine();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if (!isLicensePlatesRemove){
                        System.out.println("Biển số xe bạn nhập không hợp lệ");
                    }

                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Vui long nhap lai");
            }


        }
    }















}
