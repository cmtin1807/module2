package ss8.bai_tap.bai_tap_ve_nha_clean_code.service;

import ss8.bai_tap.bai_tap_ve_nha_clean_code.model.Staff;

public interface IStaffService {
    void addStaff(Staff staff);
    void deleteStaff(int id);
    void updateStaff(int id);
    void displayStaff();
}
