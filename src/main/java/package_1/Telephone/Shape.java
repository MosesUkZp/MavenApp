package package_1.Telephone;

public abstract class Shape {

    private String color;

    public Shape() {

    }

    public abstract double calcArea();

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape color is " + color;
    }
}
