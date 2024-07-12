package thi_module2;




import thi_module2.model.Phone;
import thi_module2.model.PhoneGenuine;
import thi_module2.model.PhoneHanded;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class PhoneManager {
    private static final String FILE_PATH = "D:\\codegym\\module2\\src\\thi_module2\\mobile.csv";
    List<Phone> phoneList;
    public PhoneManager() {
        phoneList = new ArrayList<Phone>();
    }
    public void addPhone() {
        Scanner scanner = new Scanner(System.in);
        try {
            int id = idLast() + 1;
            System.out.print("Nhập tên điện thoại ");
            String phoneName = scanner.nextLine();
            System.out.print("Nhập giá bán: ");
            double price = scanner.nextDouble();
            System.out.print("Nhâp số lượng: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập nhà sản xuất: ");
            String company = scanner.nextLine();
            System.out.print("Đây là loại điện thoại (Chính hãng/Xách tay): ");
            String isPhone = scanner.nextLine();
            if (isPhone.equalsIgnoreCase("Chính hãng")) {
                System.out.println("Nhập thời gian bảo hành");
                int timeWarranty = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Nhập phạm vi bảo hành: ");
                String scopeWarranty = scanner.nextLine();
                Phone newPhone = new PhoneGenuine(id,phoneName,price,quantity,company,timeWarranty,scopeWarranty);
                phoneList.add(newPhone);
            }
            else {
                System.out.println("Nhập quốc gia xách tay: ");
                String countryHanded = scanner.nextLine();
                System.out.println("Nhập trạng thái (đã sửa chửa, chưa sửa chửa)");
                String status = scanner.nextLine();
                Phone newPhone = new PhoneHanded(id,phoneName,price,quantity,company,countryHanded,status);
                phoneList.add(newPhone);
            }
            savePhone();
            System.out.println("Thêm điện thoại thành công");



        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    private void savePhone() {
        try (BufferedWriter bw = Files.newBufferedWriter(Paths.get(FILE_PATH))) {
            for (Phone phone : phoneList) {
                if (phone instanceof PhoneGenuine) {
                    PhoneGenuine regPhoneGenuine = (PhoneGenuine) phone;
                    bw.write(regPhoneGenuine.getInfoPhone()+ "\n");
                } else if (phone instanceof PhoneHanded) {
                    PhoneHanded regPhoneHanded = (PhoneHanded) phone;
                    bw.write(regPhoneHanded + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi lưu bệnh án: " + e.getMessage());
        }
    }
    public void deleteRecord() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập id cần xóa: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            Phone phoneToDelete = null;
            for (Phone phone : phoneList) {
                if (phone.getId()== id) {
                    phoneToDelete = phone;
                    break;
                }
            }

            if (phoneToDelete == null) {
                System.out.println("Không tìm thấy bệnh án.");
                return;
            }

            System.out.print("Bạn có chắc chắn muốn xóa bệnh án này? (có/không): ");
            String confirmation = scanner.nextLine();

            if (confirmation.equalsIgnoreCase("có")) {
                phoneList.remove(phoneToDelete);
                savePhone();
                System.out.println("Xóa điện thoại thành công.");
            } else {
                System.out.println("Hủy bỏ xóa điện thoại.");
            }

        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }



    public boolean isEmpty(){
        return phoneList.isEmpty();
    }
    public int idLast() {
        if (isEmpty()) {
            return 0;
        }
        return phoneList.get(phoneList.size() - 1).getId();

    }
    public void viewPhone() {
        for (Phone phone : phoneList) {
            System.out.println(phone);
        }
    }
//    private void loadPhone() {
//        try (BufferedReader br = Files.newBufferedReader(Paths.get(FILE_PATH))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                String[] values = line.split(",");
//                int ep =  (int)values[5]%1 == 0?;
//
//
//                }
//
//
//        } catch (Exception e) {
//            System.out.println("Lỗi : " + e.getMessage());
//        }
//    }

    public void searchPhone() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập id cần tìm: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            boolean idSearched = false;
            for (Phone phone : phoneList) {
                if (phone.getId() == id) {
                    System.out.println(phone);
                    idSearched = true;
                }
            }
            if (!idSearched) {
                System.out.println("Khong tim thay id can tim");
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    }
