package ss8.bai_tap.bai_tap_ve_nha_clean_code.service;

import ss8.bai_tap.bai_tap_ve_nha_clean_code.model.FactoryStaff;
import ss8.bai_tap.bai_tap_ve_nha_clean_code.model.OfficeStaff;
import ss8.bai_tap.bai_tap_ve_nha_clean_code.model.Shipper;
import ss8.bai_tap.bai_tap_ve_nha_clean_code.model.Staff;

import java.util.Scanner;

public class StaffService implements IStaffService {
    protected Staff[]staffService;
    protected int limitOfListStaff;
    protected int sizeOfListStaff;
    public StaffService(int limitOfListStaff) {
        this.staffService = new Staff[limitOfListStaff];
        this.limitOfListStaff = limitOfListStaff;
        this.sizeOfListStaff = 0;
    }
    @Override
    public void addStaff(Staff staff) {
        if(isaCheckListFull()) {
            System.out.println("Danh sach da day");
            return;
        }
        updateSizeListAffterAdd();
        staffService[sizeOfListStaff] = staff;
        System.out.println("Nhan vien da được thêm vào: " + staff);
    }

    private boolean isaCheckListFull() {
        return sizeOfListStaff >= limitOfListStaff;
    }

    private int updateSizeListAffterAdd() {
        return sizeOfListStaff++;
    }

    @Override
    public void deleteStaff(int id) {
        if (haveIdCheck(id)) {
            int index = locationId(id);
            staffService[index] = null;
        }
        else
        {
            System.out.println("ID không hợp lệ");
        }
    }

    private boolean haveIdCheck(int id) {
        return locationId(id) != -1;
            }



    private int locationId(int id) {
        for (int i = 0; i < sizeOfListStaff; i++) {
            if (staffService[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }
    public void updateStaff(int id) {
        int index = locationId(id);
        if (index != -1) { // Thêm kiểm tra nếu index không hợp lệ
            if (staffService[index] instanceof OfficeStaff) {
                updateOfficeStaff(id, index);
            } else if (staffService[index] instanceof FactoryStaff) {
                updateFactoryStaff(id, index);
            } else if (staffService[index] instanceof Shipper) {
                updateShipper(id, index);
            }
        } else {
            System.out.println("ID không hợp lệ.");
        }
    }

    private void updateOfficeStaff(int id, int index) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Tên Nhân Viên: ");
        String name = scanner.next();
        scanner.nextLine(); // Đọc ký tự newline thừa
        System.out.println("Số Điện Thoại Nhân Viên: ");
        String phone = scanner.next();
        scanner.nextLine(); // Đọc ký tự newline thừa
        System.out.println("Chức Vụ Nhân Viên: ");
        String position = scanner.next();
        scanner.nextLine(); // Đọc ký tự newline thừa
        staffService[index] = new OfficeStaff(id, name, phone, position); // Giữ nguyên id
        System.out.println("Đã thay đổi thành công");
    }

    private void updateFactoryStaff(int id, int index) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Tên Nhân Viên: ");
        String name = scanner.next();
        scanner.nextLine(); // Đọc ký tự newline thừa
        System.out.println("Số Điện Thoại Nhân Viên: ");
        String phone = scanner.next();
        scanner.nextLine(); // Đọc ký tự newline thừa
        System.out.println("Chức Vụ Nhân Viên: ");
        String position = scanner.next();
        scanner.nextLine(); // Đọc ký tự newline thừa
        System.out.println("Nhập ID Xưởng: ");
        String idFactory = scanner.next();
        scanner.nextLine(); // Đọc ký tự newline thừa
        System.out.println("Nhập loại nhân Viên (Part-time/Full-time): ");
        String typeOfStaff = scanner.next();
        scanner.nextLine(); // Đọc ký tự newline thừa
        staffService[index] = new FactoryStaff(id, name, phone, position, idFactory, typeOfStaff); // Giữ nguyên id
        System.out.println("Đã thay đổi thành công");
    }

    private void updateShipper(int id, int index) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Tên Nhân Viên: ");
        String name = scanner.next();
        scanner.nextLine(); // Đọc ký tự newline thừa
        System.out.println("Số Điện Thoại Nhân Viên: ");
        String phone = scanner.next();
        scanner.nextLine(); // Đọc ký tự newline thừa
        System.out.println("Chức Vụ Nhân Viên: ");
        String position = scanner.next();
        scanner.nextLine(); // Đọc ký tự newline thừa
        System.out.println("Nhập loại phương tiện (Motor/Cars): ");
        String typeOfVehicle = scanner.next();
        scanner.nextLine(); // Đọc ký tự newline thừa
        staffService[index] = new Shipper(id, name, phone, position, typeOfVehicle); // Giữ nguyên id
        System.out.println("Đã thay đổi thành công");
    }

    @Override
    public void displayStaff() {
        if (sizeOfListStaff == 0) {
            System.out.println("Danh sách nhân viên hiện đang trống.");
        } else {
            int count = 0;
            System.out.println("Danh sách nhân viên:");
            for (int i = 0; i < sizeOfListStaff; i++) {
                if (staffService[i] != null) {
                    System.out.println(staffService[i].toString());
                    count++;
                }
            }
            System.out.println("Gồm " + count + " nhân viên.");
        }
    }

    public void displayOfficeStaff() {
        if (sizeOfListStaff == 0) {
            System.out.println("Danh sách nhân viên hiện đang trống.");
        } else {
            int count = 0;
            System.out.println("Danh sách nhân viên văn phòng:");
            for (int i = 0; i < sizeOfListStaff; i++) {
                if (staffService[i] != null && staffService[i] instanceof OfficeStaff) {
                    System.out.println(staffService[i].toString());
                    count++;
                }
            }
            System.out.println("Gồm " + count + " nhân viên.");
        }
    }

    public void displayFactoryStaff() {
        if (sizeOfListStaff == 0) {
            System.out.println("Danh sách nhân viên hiện đang trống.");
        } else {
            int count = 0;
            System.out.println("Danh sách nhân viên nhà máy:");
            for (int i = 0; i < sizeOfListStaff; i++) {
                if (staffService[i] != null && staffService[i] instanceof FactoryStaff) {
                    System.out.println(staffService[i].toString());
                    count++;
                }
            }
            System.out.println("Gồm " + count + " nhân viên.");
        }
    }

    public void displayShipper() {
        if (sizeOfListStaff == 0) {
            System.out.println("Danh sách nhân viên hiện đang trống.");
        } else {
            int count = 0;
            System.out.println("Danh sách nhân viên giao hàng:");
            for (int i = 0; i < sizeOfListStaff; i++) {
                if (staffService[i] != null && staffService[i] instanceof Shipper) {
                    System.out.println(staffService[i].toString());
                    count++;
                }
            }
            System.out.println("Gồm " + count + " nhân viên.");
        }
    }
}