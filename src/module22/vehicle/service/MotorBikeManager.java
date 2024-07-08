package module22.vehicle.service;

import module22.vehicle.model.MotorBike;
import module22.vehicle.model.Vehicle;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static module22.vehicle.service.CompanyManager.getCompany;
import static module22.vehicle.util.ReadAndWrite.*;

public class MotorBikeManager {
    public static void addVehicleMotorBike(Scanner scanner, List<MotorBike> motorBikeManager, File fileMotorBike) throws IOException {
        System.out.println("Biển kiểm soát: ");
        String bienKiemSoat2 = scanner.nextLine();
        System.out.println("Tên hãng sản xuất ");
        String hangSanXuat2 = getCompany();
        System.out.println("Năm sản xuất");
        int namSanXuat2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Chủ sở hữu");
        String chuSoHuu2 = scanner.nextLine();
        System.out.println("Tải trọng ");
        int congSuat = scanner.nextInt();
        scanner.nextLine();
        MotorBike motorBike = new MotorBike(bienKiemSoat2, hangSanXuat2, namSanXuat2, chuSoHuu2, congSuat);
        motorBikeManager.add(motorBike);
        System.out.println("Đã thêm thành công \n" + motorBike);
        writeFileMotorBikeAddMotorBike(fileMotorBike, motorBike);
        loadFileMotorBike(fileMotorBike, motorBikeManager);
    }
    public static void displayMotorBike(File fileMotorBike, List<MotorBike> motorBikeManager) throws IOException {
        loadFileMotorBike(fileMotorBike, motorBikeManager);
        for (Vehicle motorBike : motorBikeManager) {
            System.out.println(motorBike);
        }
    }
    public static void removeVehicleMotorBike(Scanner scanner, File fileMotorBike, List<MotorBike> motorBikeManager) throws IOException {
        System.out.println("Enter chọn biển số xóa");
        String licensePlatesRemove = scanner.nextLine();
        boolean isLicensePlatesRemove = false;
        loadFileMotorBike(fileMotorBike, motorBikeManager);
        List<MotorBike> motorBikeToKeep = new ArrayList<>();
        for (MotorBike motorBike : motorBikeManager) {
            if (!motorBike.getLicensePlates().equals(licensePlatesRemove)) {
                motorBikeToKeep.add(motorBike);
            } else {
                System.out.println("Xoa thanh cong " + motorBike);
                isLicensePlatesRemove = true;
            }
        }

        motorBikeManager.clear();
        motorBikeManager.addAll(motorBikeToKeep);
        writeFileMotorBike(fileMotorBike, motorBikeManager);
        if (!isLicensePlatesRemove) {
            System.out.println("Biển số xe bạn nhập không hợp lệ");
        }
    }

}
