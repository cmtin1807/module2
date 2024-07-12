package thi_module2.model;

public class PhoneHanded extends Phone {
    private String countryHanded;
    private String status;

    public PhoneHanded(int id, String namePhone, double price, int quantity, String company, String countryHanded, String status) {
        super(id, namePhone, price, quantity, company);
        this.countryHanded = countryHanded;
        this.status = status;
    }

    public String getCountryHanded() {
        return countryHanded;
    }

    public void setCountryHanded(String countryHanded) {
        this.countryHanded = countryHanded;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getInfoPhone(){
        return super.getInfoPhone()+","+countryHanded+","+status;
    }

    @Override
    public String toString() {
        return "PhoneHanded{" +
                "id=" + id +
                ", namePhone='" + namePhone + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", company='" + company + '\'' +
                ", countryHanded='" + countryHanded + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
