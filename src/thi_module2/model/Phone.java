package thi_module2.model;

abstract public class Phone {
    protected int id;
    protected String namePhone;
    protected double price;
    protected int quantity;
    protected String company;
    public Phone(int id, String namePhone, double price, int quantity, String company) {
        this.id = id;
        this.namePhone = namePhone;
        this.price = price;
        this.quantity = quantity;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamePhone() {
        return namePhone;
    }

    public void setNamePhone(String namePhone) {
        this.namePhone = namePhone;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    public String getInfoPhone(){
        return id+","+namePhone+","+price+","+quantity+","+company;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", namePhone='" + namePhone + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", company='" + company + '\'' +
                '}';
    }
}
