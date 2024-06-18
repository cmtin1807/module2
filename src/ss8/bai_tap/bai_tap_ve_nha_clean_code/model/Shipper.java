package ss8.bai_tap.bai_tap_ve_nha_clean_code.model;

public class Shipper extends Staff{
    protected String typeOfVehicle;
    public Shipper() {}
    public Shipper(String typeOfVehicle) {}

    public Shipper(int id, String name, String phone, String position, String typeOfVehicle) {
        super(id, name, phone, position);
        this.typeOfVehicle = typeOfVehicle;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    @Override
    public String toString() {
        return "Shipper{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", position='" + position + '\'' +
                ", typeOfVehicle='" + typeOfVehicle + '\'' +
                '}';
    }
}
