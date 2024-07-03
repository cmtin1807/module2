package module22.vehicle.service;

import module22.vehicle.model.Car;
import module22.vehicle.model.MotorBike;
import module22.vehicle.model.Truck;

import java.io.*;
import java.util.List;

public class ReadAndWrite {
    public static void loadFileTruck(File fileTruck, List<Truck> truckManager) throws IOException {
        truckManager.clear();
        BufferedReader readerFileTruck = new BufferedReader(new FileReader(fileTruck));
        String lineTruck;
        while ((lineTruck = readerFileTruck.readLine()) != null) {
            String[] dataTruck = lineTruck.split(",");
            truckManager.add(new Truck(dataTruck[0], dataTruck[1], Integer.parseInt(dataTruck[2]), dataTruck[3], Integer.parseInt(dataTruck[4])));
        }
    }

    public static void loadFileCar(File fileCar, List<Car> carManager) throws IOException {
        carManager.clear();
        BufferedReader readerFileCar = new BufferedReader(new FileReader(fileCar));
        String lineCar;
        while ((lineCar = readerFileCar.readLine()) != null) {
            String[] dataCar = lineCar.split(",");
            carManager.add(new Car(dataCar[0], dataCar[1], Integer.parseInt(dataCar[2]), dataCar[3], dataCar[4], Integer.parseInt(dataCar[5])));
        }
    }

    public static void loadFileMotorBike(File fileMotorBike, List<MotorBike> motorBikeManager) throws IOException {
        motorBikeManager.clear();
        BufferedReader readerFileMotorBike = new BufferedReader(new FileReader(fileMotorBike));
        String lineMotorBike;
        while ((lineMotorBike = readerFileMotorBike.readLine()) != null) {
            String[] dataMotorBike = lineMotorBike.split(",");
            motorBikeManager.add(new MotorBike(dataMotorBike[0], dataMotorBike[1], Integer.parseInt(dataMotorBike[2]), dataMotorBike[3], Integer.parseInt(dataMotorBike[4])));
        }
    }
    public static void writeFileTruck(File fileTruck, Truck truck) throws IOException {
        FileWriter writerTruck = new FileWriter(fileTruck, true);
        BufferedWriter bufferedWriterTruck = new BufferedWriter(writerTruck);
        String write = truck.getInforToFile();
        bufferedWriterTruck.write(write);
        bufferedWriterTruck.newLine();
        bufferedWriterTruck.close();
    }
    public static void writeFileCar(File fileCar, Car car) throws IOException {
        FileWriter writerCar = new FileWriter(fileCar, true);
        BufferedWriter bufferedWriterCar = new BufferedWriter(writerCar);
        String write = car.getInforToFile();
        bufferedWriterCar.write(write);
        bufferedWriterCar.newLine();
        bufferedWriterCar.close();
    }
    public static void writeFileMotorBike(File fileMotorBike, MotorBike motorBike) throws IOException {
        FileWriter writerMotorBike = new FileWriter(fileMotorBike, true);
        BufferedWriter bufferedWriterMotorBike = new BufferedWriter(writerMotorBike);
        String write = motorBike.getInforToFile();
        bufferedWriterMotorBike.write(write);
        bufferedWriterMotorBike.newLine();
        bufferedWriterMotorBike.close();
    }
}
