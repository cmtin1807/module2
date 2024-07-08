package module22.vehicle.template;

import java.util.Scanner;

public class DisplayProgram {
    public static int displayMenu(Scanner scanner) {
        System.out.println("Chọn Chức Năng:");
        System.out.println("1. Thêm mới phương tiện");
        System.out.println("2. Hiển thị phương tiện");
        System.out.println("3. Xóa phương tiện");
        System.out.println("4. Thoát");
        System.out.println("Enter chức năng lựa chọn của bạn");
        int choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }
    public static int getChoiceAddVehicle(Scanner scanner) {
        System.out.println("1. Thêm xe tải");
        System.out.println("2. Thêm ôtô");
        System.out.println("3. Thêm  xe máy");
        System.out.println("4. Thoát");
        System.out.println("Enter chức năng lựa chọn của bạn");
        int choiceAdd = scanner.nextInt();
        scanner.nextLine();
        return choiceAdd;
    }
    public static int getChoiceDisplayVehicle(Scanner scanner) {
        System.out.println("1. Hiện thị xe tải");
        System.out.println("2. Hiện thị ôtô");
        System.out.println("3. Hiện thị xe máy");
        System.out.println("4. Thoát");
        System.out.println("Enter chức năng lựa chọn của bạn");
        int choiceDisplay = Integer.parseInt(scanner.nextLine());
        return choiceDisplay;
    }
    public static int getChoiceRemoveVehicle(Scanner scanner) {
        System.out.println("1. Xóa xe tải");
        System.out.println("2. Xóa ôtô");
        System.out.println("3. Xóa xe máy");
        System.out.println("4. Thoát");
        System.out.println("Enter chức năng lựa chọn của bạn");
        int choiceRemove = Integer.parseInt(scanner.nextLine());
        return choiceRemove;
    }
}
