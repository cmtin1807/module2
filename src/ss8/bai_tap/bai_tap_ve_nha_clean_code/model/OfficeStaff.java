package ss8.bai_tap.bai_tap_ve_nha_clean_code.model;

public class OfficeStaff extends Staff {
    public OfficeStaff() {
    }

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

