package ss7.bai_tap_ve_nha.staff;

public class OfficeStaff extends Staff{
    public OfficeStaff() {}
    public OfficeStaff(int id, String name, String phone, String position) {
        super(id, name, phone, position);
    }

    @Override
    public String toString() {
        return "OfficeStaff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
