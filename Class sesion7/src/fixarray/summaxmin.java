/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fixarray;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class summaxmin {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] mark = markarray(5);
        check(mark);

    }

    public static int[] markarray(int size) {
        int[] values = new int[size];
        System.out.println("Enter " + size + " mark ");
        for (int i = 0; i < size; i++) {
            values[i] = input.nextInt();

        }
        return values;
    }

    public static void check(int[] array) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 40) {
                count1++;
            } else if (array[i] >= 40 && array[i] < 75) {
                count2++;
            } else if (array[i] >= 75) {
                count3++;
            }

        }
        System.out.println("so hoc sinh truot mon la : " + count1);
        System.out.println("hoc sinh trb is: " + count2);
        System.out.println("hoc sinh gioi la: " + count3);

    }

}
