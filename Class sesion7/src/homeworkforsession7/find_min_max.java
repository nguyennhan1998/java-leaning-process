/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkforsession7;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class find_min_max {
    private static Scanner input= new Scanner (System.in);
    public static void main(String[] args) {
        int[] myNumber=getArray(5);
        System.out.println("the max of the array is : "+getMax(myNumber));
        System.out.println("the min of the array is : "+getMin(myNumber));
        
    }
    public  static int[] getArray(int size){
        int [] values= new int[size];
        System.out.println("Enter "+size+" Integer values");
        for (int i = 0; i < size; i++) {
            values[i]=input.nextInt();
            
        }
        return values;
    }
    public static int getMax(int [] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(max<array[i]){
                max=array[i];
            }
            
        }
        return max;
    }
    public static int getMin(int [] array){
        int min=array[0];
        for(int i=0;i<array.length;i++){
            if(min>array[i]){
                min=array[i];
            }
            
        }
        return min;
    }
}
