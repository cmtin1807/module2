package ss7.bai_tap_ve_nha.staff_mananger;

import ss7.bai_tap_ve_nha.staff.FactoryStaff;
import ss7.bai_tap_ve_nha.staff.OfficeStaff;
import ss7.bai_tap_ve_nha.staff.Shipper;
import ss7.bai_tap_ve_nha.staff.Staff;

import java.util.Scanner;

public class StaffManager implements IManager {
    protected Staff[] staffManager;  // Corrected variable name
    protected int limit;
    protected int size;

    public StaffManager(int limit) {
        this.staffManager = new Staff[limit];
        this.limit = limit;
        this.size = 0;
    }

    @Override
    public void add(Staff staff) {
        if (size < limit) {
            staffManager[size] = staff;
            size++;
            System.out.println("Thêm mới thành công nhân viên: " + staff);
        } else {
            System.out.println("Danh sách nhân viên đã đầy.");
        }
    }

    @Override
    public void remove(int idRemove) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (staffManager[i] != null && staffManager[i].getId() == idRemove) {
                found = true;
                staffManager[i] = null;
                System.out.println("Xóa thành công nhân viên có ID: " + idRemove);
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy nhân viên có ID: " + idRemove);
        }
    }

    @Override
    public void updateStaff(int idUpdate) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (staffManager[i] != null && staffManager[i].getId() == idUpdate) {
                found = true;
                Scanner sc = new Scanner(System.in);
                String name, phone, position;

                System.out.print("Tên nhân viên: ");
                name = sc.next();
                System.out.print("Điện thoại: ");
                phone = sc.next();
                System.out.print("Chức vụ: ");
                position = sc.next();

                if (staffManager[i] instanceof OfficeStaff) {
                    staffManager[i] = new OfficeStaff(idUpdate, name, phone, position);
                    System.out.println("Cập nhật thành công Office Staff.");
                } else if (staffManager[i] instanceof FactoryStaff) {
                    String idFactory, type;
                    System.out.print("ID nhà máy: ");
                    idFactory = sc.next();
                    System.out.print("Loại nhân viên: ");
                    type = sc.next();
                    staffManager[i] = new FactoryStaff(idUpdate, name, phone, position, idFactory, type);
                    System.out.println("Cập nhật thành công Factory Staff.");
                } else if (staffManager[i] instanceof Shipper) {
                    String typeVehicle;
                    System.out.print("Loại phương tiện: ");
                    typeVehicle = sc.next();
                    staffManager[i] = new Shipper(idUpdate, name, phone, position, typeVehicle);
                    System.out.println("Cập nhật thành công Shipper.");
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy nhân viên có ID: " + idUpdate);
        }
    }

    @Override
    public void displayStaff() {
        if (size == 0) {
            System.out.println("Danh sách nhân viên hiện đang trống.");
        } else {
            int count = 0;
            System.out.println("Danh sách nhân viên:");
            for (int i = 0; i < size; i++) {
                if (staffManager[i] != null) {
                    System.out.println(staffManager[i].toString());
                    count++;
                }
            }
            System.out.println("Gồm "+ count+" nhân viên.");
        }
    }
    public void displayOfficeStaff() {
        if (size == 0) {
            System.out.println("Danh sách nhân viên hiện đang trống.");
        } else {
            int count = 0;
            System.out.println("Danh sách nhân viên văn phòng:");
            for (int i = 0; i < size; i++) {
                if (staffManager[i] != null&&staffManager[i] instanceof OfficeStaff) {
                    System.out.println(staffManager[i].toString());
                    count++;
                }
            }
            System.out.println("Gồm "+ count+" nhân viên.");
        }
    }
    public void displayFactoryStaff() {
        if (size == 0) {
            System.out.println("Danh sách nhân viên hiện đang trống.");
        } else {
            int count = 0;
            System.out.println("Danh sách nhân viên nhà máy:");
            for (int i = 0; i < size; i++) {
                if (staffManager[i] != null&&staffManager[i] instanceof FactoryStaff) {
                    System.out.println(staffManager[i].toString());
                    count++;
                }
            }
            System.out.println("Gồm "+ count+" nhân viên.");
        }
    }
    public void displayShipper() {
        if (size == 0) {
            System.out.println("Danh sách nhân viên hiện đang trống.");
        } else {
            int count = 0;
            System.out.println("Danh sách nhân viên giao hàng:");
            for (int i = 0; i < size; i++) {
                if (staffManager[i] != null&&staffManager[i] instanceof Shipper) {
                    System.out.println(staffManager[i].toString());
                    count++;
                }
            }
            System.out.println("Gồm "+ count+" nhân viên.");
        }
    }
}
