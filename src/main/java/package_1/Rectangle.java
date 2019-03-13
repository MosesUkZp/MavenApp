package package_1;

import package_1.Telephone.Shape;

public class Rectangle extends Shape {

    public float wigth;
    public float heigth;

    public Rectangle(float wigth, float heigth) {
        super();
        this.wigth = wigth;
        this.heigth = heigth;
    }

    public float calculateSquare() {
        print();
        return wigth * heigth;
    }

    public float calculatePerimeter() {
        print();
        return heigth * 2 + wigth * 2;
    }

    public void print() {
        System.out.println("Wigth is: " + wigth + "\n" + "Heigth is: " + heigth);
    }

    public void Plus() {
        print();
        wigth++;
        heigth++;
    }
    public void Plue232323s() {
        print();
        wigth++;
        heigth++;
    }


    @Override
    public double calcArea() {
        return 0;
    }
}

