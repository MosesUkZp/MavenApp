package package_1;

public class Car {

    public int numberCar = 0;
    public static int numberOfCar = 0;


        public Car (){
            numberCar++;
            numberOfCar++;
            System.out.println("numberCar " +  numberCar);
            System.out.println("numberOfCar " + numberOfCar);
        }
}
