package ss8.bai_tap.bai_tap_ve_nha_clean_code.model;

public class FactoryStaff extends Staff {
    protected String idFactory;
    protected String typeStaff;

    public FactoryStaff() {
    }

    public FactoryStaff(String idFactory, String typeStaff) {
        this.idFactory = idFactory;
        this.typeStaff = typeStaff;
    }

    public FactoryStaff(int id, String name, String phone, String position, String idFactory, String typeStaff) {
        super(id, name, phone, position);
        this.idFactory = idFactory;
        this.typeStaff = typeStaff;
    }

    public String getIdFactory() {
        return idFactory;
    }

    public void setIdFactory(String idFactory) {
        this.idFactory = idFactory;
    }

    public String getTypeStaff() {
        return typeStaff;
    }

    public void setTypeStaff(String typeStaff) {
        this.typeStaff = typeStaff;
    }

    @Override
    public String toString() {
        return "FactoryStaff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", position='" + position + '\'' +
                ", idFactory='" + idFactory + '\'' +
                ", TypeStaff='" + typeStaff + '\'' +
                '}';
    }
}
