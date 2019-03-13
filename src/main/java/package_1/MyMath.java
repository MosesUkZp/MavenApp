package package_1;

import java.util.Arrays;
import java.util.Scanner;

public class MyMath {


    public static int FindMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int FindMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double Radiys(int r) {

        double area = Math.PI * 2 * r;


        return area;
    }
    static void print (int h){
        int n = 2;
        int r = 3;

    }
}