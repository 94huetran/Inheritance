package Circle;

public class Appilication {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle = new Circle(3.5, "white", true);
        System.out.println(circle);
        System.out.println("Area this circle is: "+ circle.getArea());

        Cylinder cylinder = new Cylinder();
        cylinder = new Cylinder(3.5, "green", true, 7);
        System.out.println(cylinder);
        System.out.println("Area this cylender is: "+cylinder.getVolume());
    }

}
