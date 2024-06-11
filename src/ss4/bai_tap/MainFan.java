package ss4.bai_tap;

public class MainFan {
    public static void main(String[] args) {
        QuanLyFan quanLyFan = new QuanLyFan(10);
        Fan fan1 = new Fan(1000, true , 2d,"" );
        Fan fan2 = new Fan(2000, false, 3d, "blue");
        quanLyFan.themFan(fan1);
        quanLyFan.themFan(fan2);
        quanLyFan.hienThiQuanLyFan();

    }
}
class Fan {
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = 0;
        this.on = false;
        this.radius = 0.0;
        this.color = "blue";
    }
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        if (color != null && !color.isEmpty()) {
            this.color = color;
        } else {
            this.color = "blue";
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        if (on) {
            return "speed: " + speed + ", on: " + on + ", radius: " + radius + ", color: " + color;
        }
        else {
            return "radius: " + radius + ", color: " + color;
        }
    }
}
class QuanLyFan{
    private Fan[]quanLyFan;
    private int limit;
    private int size;
    public QuanLyFan(int limit) {
        this.quanLyFan = new Fan[limit];
        this.limit = limit;
        this.size = 0;
    }
    public void themFan(Fan fan){
        if (size < limit){
            quanLyFan[size] = fan;
            size++;
            System.out.println("Danh sach fan da duoc them vao");
        }
        else {
            System.out.println("Danh sach fan da day");
        }
    }
    public void hienThiQuanLyFan(){
        if (size == 0 ){
            System.out.println("Danh sach fan trong");
        }
        else {
            System.out.println("Danh sach fan: ");
            for(int i = 0; i < size; i++){
                System.out.println(quanLyFan[i].toString());
            }
        }
    }
}