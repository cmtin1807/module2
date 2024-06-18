package ss8.bai_tap.bai_tap_ve_nha_clean_code.service;

import ss8.bai_tap.bai_tap_ve_nha_clean_code.model.FactoryStaff;
import ss8.bai_tap.bai_tap_ve_nha_clean_code.model.OfficeStaff;
import ss8.bai_tap.bai_tap_ve_nha_clean_code.model.Staff;
import ss8.bai_tap.bai_tap_ve_nha_clean_code.model.Shipper;
public class StaffService implements IStaffService {
    private Staff[] staffList;
    private int maxSize;
    private int currentSize;

    public StaffService(int maxSize) {
        this.maxSize = maxSize;
        this.staffList = new Staff[maxSize];
        this.currentSize = 0;
    }

    public boolean isListFull() {
        return currentSize >= maxSize;
    }

    @Override
    public void addStaff(Staff staff) {
        if (isListFull()) {
            System.out.println("Danh sách nhân viên đã đầy");
        } else {
            staffList[currentSize++] = staff;
            System.out.println("Đã thêm thành công nhân viên " + staff);
        }
    }

    public boolean isValidId(int id) {
        for (int i = 0; i < currentSize; i++) {
            if (staffList[i] != null && staffList[i].getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void deleteStaff(int id) {
        if (!isValidId(id)) {
            System.out.println("ID không hợp lệ");
            return;
        }

        for (int i = 0; i < currentSize; i++) {
            if (staffList[i] != null && staffList[i].getId() == id) {
                staffList[i] = null;
                System.out.println("Đã xóa thành công nhân viên có ID " + id);
                return;
            }
        }
    }

    @Override
    public void updateStaff(int id, Staff staff) {
        if (!isValidId(id)) {
            System.out.println("ID không hợp lệ");
            return;
        }

        for (int i = 0; i < currentSize; i++) {
            if (staffList[i] != null && staffList[i].getId() == id) {
                if (staff instanceof OfficeStaff && staffList[i] instanceof OfficeStaff) {
                    updateOfficeStaff((OfficeStaff) staffList[i], (OfficeStaff) staff);
                }
                if (staff instanceof FactoryStaff && staffList[i] instanceof FactoryStaff) {
                    updateFactoryStaff((FactoryStaff) staffList[i], (FactoryStaff) staff);
                }
                if (staff instanceof Shipper && staffList[i] instanceof Shipper) {
                    updateShipper((Shipper) staffList[i], (Shipper) staff);
                }
                System.out.println("Đã cập nhật thành công nhân viên có ID " + id);
                return;
            }
        }
    }

    private void updateOfficeStaff(OfficeStaff currentStaff, OfficeStaff newStaff) {
        currentStaff.setName(newStaff.getName());
        currentStaff.setPhone(newStaff.getPhone());
        currentStaff.setPosition(newStaff.getPosition());
    }

    private void updateFactoryStaff(FactoryStaff currentStaff, FactoryStaff newStaff) {
        currentStaff.setName(newStaff.getName());
        currentStaff.setPhone(newStaff.getPhone());
        currentStaff.setPosition(newStaff.getPosition());
        currentStaff.setIdFactory(newStaff.getIdFactory());
        currentStaff.setTypeStaff(newStaff.getTypeStaff());
    }

    private void updateShipper(Shipper currentStaff, Shipper newStaff) {
        currentStaff.setName(newStaff.getName());
        currentStaff.setPhone(newStaff.getPhone());
        currentStaff.setPosition(newStaff.getPosition());
        currentStaff.setTypeOfVehicle(newStaff.getTypeOfVehicle());
    }

    @Override
    public void displayStaff() {
        for (int i = 0; i < currentSize; i++) {
            if (staffList[i] != null) {
                System.out.println(staffList[i]);
            }
        }
    }
}
