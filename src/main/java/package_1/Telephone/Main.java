package package_1.Telephone;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

////        Apple apple = new Apple("Apple", "12321421321", 1223123);
////        System.out.println(apple.toString());
////
////        Monitor monitor = new Monitor("Samsung", "123213213", 123, 123, 123);
////        System.out.println(monitor.toString());
//
//
        Random random = new Random();
        Object[] device = new Object[10];
        for (int i = 0; i < device.length; i++) {
            Apple apple1 = new Apple("Samsung", String.valueOf(random.nextInt()), 123);
            device[i] = apple1;
        }
            for (int j = 5; j < device.length; j++) {
                Monitor monitor1 = new Monitor("LG", String.valueOf(random.nextInt()), 123, 123, 213);
                device[j] = monitor1;
                monitor1.setResolutionX(200);
                monitor1.getResolutionY(232);
            }
            System.out.println(Arrays.toString(device));

            for (int j = 0; j < device.length; j++) {
                String classNAme = device[j].getClass().getSimpleName();
                if (classNAme.equals("Apple")) {
                    System.out.println(((Apple) device[1]).getManufacturer());
                 }
                }


//            Shape shape = new Shape("RED");
//            System.out.println(shape.toString());
//            System.out.println(shape.calcArea());


//                Krug krug = new Krug("R");
//                krug.setRadius(2);
//                System.out.println(krug);
//                System.out.println(krug.Radius());


            }
        }

