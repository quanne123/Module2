public class Fan {
    private final int Slow = 1;
    private final int Medium = 2;
    private final int Fast = 3;
    private int speed = 1;

    private boolean on = false;
    private String color = "blue";
    private double radius = 5;

    public int getSlow() {
        return Slow;
    }

    public int getMedium() {
        return Medium;
    }

    public int getFast() {
        return Fast;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public Fan() {
    }

    public Fan(int speed, boolean on, String color, double radius) {
        this.speed = speed;
        this.on = on;
        this.color = color;
        this.radius = radius;
    }

    public String toString() {
        String state = "";
        if (this.isOn()) {
            state += ("Fan is on \n");
            state += ("Speed: " + this.speed + "\n");
        } else {
            state += ("Fan is off");
        }
        state += ("Color: " + this.color + "\n");
        state += ("Radius: " + this.radius + "\n");
        return state;
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(3,true,"yellow",10);
        Fan fan2 = new Fan(3,false,"blue",10);
    }
}


