package thi_module2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneManager phoneManager = new PhoneManager();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("    -----CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI-----   ");
            System.out.println("Chọn chức năng theo số (để tiếp tục):");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách điện thoại");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Thoát");
            System.out.println("Chọn chức năng:");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    phoneManager.addPhone();
                    break;
                    case 2:
                        phoneManager.deleteRecord();
                        break;
                        case 3:
                            phoneManager.viewPhone();
                            break;
                case 4:
                    phoneManager.searchPhone();
                    break;
                case 5 :
                    System.exit(0);

                default:
                    System.out.println("Vui lòng nhập lại");

            }
        }
    }
}
