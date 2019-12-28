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
public class Caculator {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntergers = initArray(5);
        //in ra cac gia tri trong myintergers
        for(int i=0;i<myIntergers.length;i++){
            System.out.println("Element "+i+" , type value was "
            +myIntergers[i]);
        }
        System.out.println("Average is "+getAverage(myIntergers));
        System.out.println("max of the array is: "+getMax(myIntergers));
        System.out.println("min of the array is: "+getMin(myIntergers));
        
    }

    /**
     * khoi tao mang
     *
     * @param size kich co mang
     * @return mang gia tri
     */
    public static int[] initArray(int size) {
        int[] values = new int[size];
        System.out.println("Enter " + size + " integer values.");
        for (int i = 0; i < size; i++) {
            values[i]=scanner.nextInt();
        }
        return values;
    }

    /**
     * tinh gia tri trung binh
     *
     * @param array mang can tinh gia tri
     * @return gia tri trung binh;
     */
    public static double getAverage(int[] array) {
        int sum=0;
       
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
            
        }
        
        return (double)sum/(double)array.length;
    }
    public static  int getMax(int[] array){
        int max=array[0];
        for(int i=1;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        return max;
    }
    public static int getMin(int[] array){
        int min=array[0];
        for(int i=1;i<array.length;i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        return min;
    }
}
