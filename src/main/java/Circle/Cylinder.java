package Circle;

public class Cylinder extends Circle {
    double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, boolean fill, double height) {
        super(radius, color, fill);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    @Override
    public void setRadius(double radius) {
        super.setRadius(radius);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public boolean isFill() {
        return super.isFill();
    }

    @Override
    public void setFill(boolean fill) {
        super.setFill(fill);
    }

    public double getVolume() {
        return Math.PI*getRadius()*getRadius()*height;
    }

    @Override
    public String toString() {
        return"A cylinder with radius "+getRadius()+" and height "+height+" , which a subclass of "+ super.toString();
    }
}
