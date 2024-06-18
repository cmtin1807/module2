package ss16.thuc_hanh.bai_tap_ve_nha.staff_mananger;

import ss16.thuc_hanh.bai_tap_ve_nha.staff.Staff;

public interface IManager {
    public void add(Staff staff);
    public void remove(int idRemove);
    public void updateStaff(int idUpdate);
    public void displayStaff();
}
