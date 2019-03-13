package package_1.Telephone;

public class Krug extends Shape {

    private double Radius;
    private final double pi = Math.PI;

    @Override
    public double calcArea() {
        return 0;
    }

    public Krug(String color) {
        super(color);
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }




    public double Radius (){
        double result = pi * (Radius * Radius);
        return result;
    }
}
