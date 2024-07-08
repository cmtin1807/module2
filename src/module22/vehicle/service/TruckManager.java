package module22.vehicle.service;

import module22.vehicle.model.Truck;
import module22.vehicle.model.Vehicle;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static module22.vehicle.service.CompanyManager.getCompany;
import static module22.vehicle.util.ReadAndWrite.*;

public class TruckManager {
    public static void addVehicleTruck(Scanner scanner, List<Truck> truckManager, File fileTruck) throws IOException {
        System.out.println("Biển kiểm soát: ");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Tên hãng sản xuất ");
        String hangSanXuat = getCompany();
        System.out.println("Năm sản xuất");
        int namSanXuat = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Chủ sở hữu");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Tải trọng ");
        int taiTrong = scanner.nextInt();
        scanner.nextLine();
        Truck truck = new Truck(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, taiTrong);
        truckManager.add(truck);
        System.out.println("Đã thêm thành công \n" + truck);
        writeFileTruckAddTruck(fileTruck, truck);
        loadFileTruck(fileTruck, truckManager);
    }
    public static void displayTruck(File fileTruck, List<Truck> truckManager) throws IOException {
        loadFileTruck(fileTruck, truckManager);
        for (Vehicle truck : truckManager) {
            System.out.println(truck);
        }
    }
    public static void removeVehicleTruck(Scanner scanner, File fileTruck, List<Truck> truckManager) throws IOException {
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
        truckManager.clear();
        truckManager.addAll(trucksToKeep);
        writeFileTruck(fileTruck, truckManager);
        if (!isLicensePlatesRemove) {
            System.out.println("Biển số xe bạn nhập không hợp lệ");
        }
    }


}
