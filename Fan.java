public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public int getSLOW(){
        return this.SLOW;
    }
    public int getMEDIUM(){
        return this.MEDIUM;
    }

    public int getFAST(){
        return this.FAST;
    }
    public int getSpeed(){
        return this.speed;
    }
    public boolean getOn(){
        return this.on;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        if (getOn()){
            return "Speed = " + getSpeed() +"; Color = " + getColor() + "; Radius = " + getRadius() + " -> fan is on";
        }else {
            return "Speed = " + getSpeed() +"; Color = " + getColor() + "; Radius = " + getRadius() + " -> fan is off";
        }
    }
}
