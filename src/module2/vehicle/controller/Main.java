package module2.vehicle.controller;

import module2.vehicle.model.Car;
import module2.vehicle.model.MotorBike;
import module2.vehicle.model.Truck;
import module2.vehicle.model.Vehicle;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static String linkFileTruck = "src/molude2/vehicle/data/xeTai.csv";
    public static String linkFileCar = "src/molude2/vehicle/data/oto.csv";
    public static String linkFileMotorBike = "src/molude2/vehicle/data/xeMay.csv";

    public static void main(String[] args) throws IOException {
        List<Truck> truckManager = new ArrayList<>();
        List<Car> carManager = new ArrayList<>();
        List<MotorBike> motorBikeManager = new ArrayList<>();
        File fileTruck = new File(linkFileTruck);
        File fileCar = new File(linkFileCar);
        File fileMotorBike = new File(linkFileMotorBike);
        Scanner scanner = new Scanner(System.in);
        BufferedReader readerFileTruck = new BufferedReader(new FileReader(fileTruck));
        String lineTruck;
        while ((lineTruck = readerFileTruck.readLine()) != null) {
            String[] dataTruck = lineTruck.split(",");
            truckManager.add(new Truck(dataTruck[0], dataTruck[1], Integer.parseInt(dataTruck[2]), dataTruck[3], Integer.parseInt(dataTruck[4])));
        }
//        for (Truck truck : truckManager) {
//            System.out.println(truck);
//        }
        BufferedReader readerFileCar = new BufferedReader(new FileReader(fileCar));
        String lineCar;
        while ((lineCar = readerFileCar.readLine()) != null) {
            String[] dataCar = lineCar.split(",");
            carManager.add(new Car(dataCar[0], dataCar[1], Integer.parseInt(dataCar[2]), dataCar[3], dataCar[4], Integer.parseInt(dataCar[5])));
        }
//        for (Car car : carManager) {
//            System.out.println(car);
//        }
        BufferedReader readerFileMotorBike = new BufferedReader(new FileReader(fileMotorBike));
        String lineMotorBike;
        while ((lineMotorBike = readerFileMotorBike.readLine()) != null) {
            String[] dataMotorBike = lineMotorBike.split(",");
            motorBikeManager.add(new MotorBike(dataMotorBike[0], dataMotorBike[1], Integer.parseInt(dataMotorBike[2]), dataMotorBike[3], Integer.parseInt(dataMotorBike[4])));
        }
//        for (MotorBike motorBike : motorBikeManager) {
//            System.out.println(motorBike);
//        }

        while (true) {

            System.out.println("Chọn Chức Năng:");
            System.out.println("1. Thêm mới phương tiện");
            System.out.println("2. Hiện thị phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Thoát");
            System.out.println("Enter chức năng lựa chọn của bạn");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    boolean them = true;
                    while (them) {
                        System.out.println("1. Thêm xe tải");
                        System.out.println("2. Thêm ôtô");
                        System.out.println("3. Thêm  xe máy");
                        System.out.println("4. Thoát");
                        System.out.println("Enter chức năng lựa chọn của bạn");
                        int choiceThem = scanner.nextInt();
                        scanner.nextLine();
                        switch (choiceThem) {
                            case 1:
                                List<Vehicle> truckList = new ArrayList<>();
                                FileWriter writerTruck = new FileWriter(fileTruck, true);
                                BufferedWriter bufferedWriterTruck = new BufferedWriter(writerTruck);
                                System.out.println("Biển kiểm soát: ");
                                String bienKiemSoat = scanner.nextLine();
                                System.out.println("Tên hãng sản xuất ");
                                String hangSanXuat = scanner.nextLine();
                                System.out.println("Năm sản xuất");
                                int namSanXuat = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Chủ sở hữu");
                                String chuSoHuu = scanner.nextLine();
                                System.out.println("Tải trọng ");
                                int taiTrong = scanner.nextInt();
                                scanner.nextLine();

                                truckManager.add(new Truck(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, taiTrong));
                                String write = bienKiemSoat + "," + hangSanXuat + "," + namSanXuat + "," + chuSoHuu + "," + taiTrong;
                                bufferedWriterTruck.write(write);
                                bufferedWriterTruck.newLine();
                                bufferedWriterTruck.close();
                                break;
                            case 2:
                                FileWriter writerOto = new FileWriter(fileCar, true);
                                BufferedWriter bufferedWriterOto = new BufferedWriter(writerOto);
                                System.out.println("Biển kiểm soát: ");
                                String bienKiemSoat1 = scanner.nextLine();
                                System.out.println("Tên hãng sản xuất ");
                                String hangSanXuat1 = scanner.nextLine();
                                System.out.println("Năm sản xuất");
                                int namSanXuat1 = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Chủ sở hữu");
                                String chuSoHuu1 = scanner.nextLine();
                                System.out.println("Loại xe");
                                String loaiXe = scanner.nextLine();
                                System.out.println("Số ghế ngồi");
                                int soGheNgoi = scanner.nextInt();
                                carManager.add(new Car(bienKiemSoat1, hangSanXuat1, namSanXuat1, chuSoHuu1, loaiXe, soGheNgoi));
                                String writeDataOto = bienKiemSoat1 + "," + hangSanXuat1 + "," + namSanXuat1 + "," + chuSoHuu1 + "," + loaiXe + "," + soGheNgoi;
                                bufferedWriterOto.write(writeDataOto);
                                bufferedWriterOto.newLine();
                                bufferedWriterOto.close();
                                break;
                            case 3:
                                FileWriter writerMotorBike = new FileWriter(fileMotorBike, true);
                                BufferedWriter bufferedWriterMotorBike = new BufferedWriter(writerMotorBike);
                                System.out.println("Biển kiểm soát: ");
                                String bienKiemSoat2 = scanner.nextLine();
                                System.out.println("Tên hãng sản xuất ");
                                String hangSanXuat2 = scanner.nextLine();
                                System.out.println("Năm sản xuất");
                                int namSanXuat2 = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Chủ sở hữu");
                                String chuSoHuu2 = scanner.nextLine();
                                System.out.println("Tải trọng ");
                                int congSuat = scanner.nextInt();
                                scanner.nextLine();
                                motorBikeManager.add(new MotorBike(bienKiemSoat2, hangSanXuat2, namSanXuat2, chuSoHuu2, congSuat));
                                String write2 = bienKiemSoat2 + "," + hangSanXuat2 + "," + namSanXuat2 + "," + chuSoHuu2 + "," + congSuat;
                                bufferedWriterMotorBike.write(write2);
                                bufferedWriterMotorBike.newLine();
                                bufferedWriterMotorBike.close();
                                break;
                            case 4:
                                them = false;
                                break;
                            default:
                                System.out.println("Chức năng chọn không hợp lệ");
                        }

                    }
                    break;
                case 2:
                    boolean hienThi = true;
                    while (hienThi) {
                        System.out.println("1. Hiện thị xe tải");
                        System.out.println("2. Hiện thị ôtô");
                        System.out.println("3. Hiện thị xe máy");
                        System.out.println("4. Thoát");
                        System.out.println("Enter chức năng lựa chọn của bạn");
                        int choiceHienThi = scanner.nextInt();
                        scanner.nextLine();
                        switch (choiceHienThi) {
                            case 1:
                                for (Vehicle truck : truckManager) {
                                    System.out.println(truck);
                                }

                                break;
                            case 2:
                                for (Vehicle car : carManager) {
                                    System.out.println(car);
                                }
                                break;
                            case 3:
                                for (Vehicle motorBike : motorBikeManager) {
                                    System.out.println(motorBike);
                                }
                                break;
                            case 4:
                                hienThi = false;
                                break;
                            default:
                                System.out.println("Vui long nhap lai");


                        }

                    }
                    break;
                case 3:
                    System.out.println("Enter chọn biển số xóa");
                    String licensePlatesRemove = scanner.nextLine();
                    int dem = 0;

                    List<Truck> trucksToKeep = new ArrayList<>();
                    for (Truck truck : truckManager) {
                        if (!truck.getLicensePlates().equals(licensePlatesRemove)) {
                            trucksToKeep.add(truck); // Thêm vào danh sách tạm thời nếu không phải phần tử cần xóa
                        } else {
                            System.out.println("Xoa thanh cong " + truck);
                            dem++;
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
                            carToKeep.add(car); // Thêm vào danh sách tạm thời nếu không phải phần tử cần xóa
                        } else {
                            System.out.println("Xoa thanh cong " + car);
                            dem++;
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
                            motorBikeToKeep.add(motorBike); // Thêm vào danh sách tạm thời nếu không phải phần tử cần xóa
                        } else {
                            System.out.println("Xoa thanh cong " + motorBike);
                            dem++;
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
                    if (dem==0){
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
