package ss4.bai_tap.fan;

public class Fan {
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