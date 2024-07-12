package thi_module2.model;

import java.util.Date;

public class PhoneGenuine extends Phone {
    private int timeWarranty;
    private String scopeWarranty;

    public PhoneGenuine(int id, String namePhone, double price, int quantity, String company, int timeWarranty, String scopeWarranty) {
        super(id, namePhone, price, quantity, company);
        this.timeWarranty = timeWarranty;
        this.scopeWarranty = scopeWarranty;
    }

    public int getTimeWarranty() {
        return timeWarranty;
    }

    public void setTimeWarranty(int timeWarranty) {
        this.timeWarranty = timeWarranty;
    }

    public String getScopeWarranty() {
        return scopeWarranty;
    }

    public void setScopeWarranty(String scopeWarranty) {
        this.scopeWarranty = scopeWarranty;
    }
    public String getInfoPhone(){
        return super.getInfoPhone()+","+timeWarranty+","+scopeWarranty;
    }

    @Override
    public String toString() {
        return "PhoneGenuine{" +
                "id=" + id +
                ", namePhone='" + namePhone + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", company='" + company + '\'' +
                ", timeWarranty=" + timeWarranty +
                ", scopeWarranty='" + scopeWarranty + '\'' +
                '}';
    }
}
