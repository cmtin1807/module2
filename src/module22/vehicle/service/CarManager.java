package module22.vehicle.service;

import module22.vehicle.model.Car;
import module22.vehicle.model.Vehicle;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static module22.vehicle.service.CompanyManager.getCompany;
import static module22.vehicle.util.ReadAndWrite.*;

public class CarManager {
    public static void addVehicleCar(Scanner scanner, List<Car> carManager, File fileCar) throws IOException {
        System.out.println("Biển kiểm soát: ");
        String bienKiemSoat1 = scanner.nextLine();
        System.out.println("Tên hãng sản xuất ");
        String hangSanXuat1 = getCompany();
        System.out.println("Năm sản xuất");
        int namSanXuat1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Chủ sở hữu");
        String chuSoHuu1 = scanner.nextLine();
        System.out.println("Loại xe");
        String loaiXe = scanner.nextLine();
        System.out.println("Số ghế ngồi");
        int soGheNgoi = scanner.nextInt();
        Car car = new Car(bienKiemSoat1, hangSanXuat1, namSanXuat1, chuSoHuu1, loaiXe, soGheNgoi);
        carManager.add(car);
        System.out.println("Đã thêm thành công \n" + car);
        writeFileCarAddCar(fileCar, car);
        loadFileCar(fileCar, carManager);
    }
    public static void displayCar(File fileCar, List<Car> carManager) throws IOException {
        loadFileCar(fileCar, carManager);
        for (Vehicle car : carManager) {
            System.out.println(car);
        }
    }
    public static void removeVehicleCar(Scanner scanner,  File fileCar, List<Car> carManager) throws IOException {
        System.out.println("Enter chọn biển số xóa");
        String licensePlatesRemove = scanner.nextLine();
        boolean isLicensePlatesRemove = false;
        loadFileCar(fileCar, carManager);

        List<Car> carToKeep = new ArrayList<>();
        for (Car car : carManager) {
            if (!car.getLicensePlates().equals(licensePlatesRemove)) {
                carToKeep.add(car);
            } else {
                System.out.println("Xoa thanh cong " + car);
                isLicensePlatesRemove = true;
            }
        }
        carManager.clear();
        carManager.addAll(carToKeep);
        writeFileCar(fileCar, carManager);
        if (!isLicensePlatesRemove) {
            System.out.println("Biển số xe bạn nhập không hợp lệ");
        }
    }
}
