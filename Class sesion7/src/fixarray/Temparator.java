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
public class Temparator {
    public static void main(String[] args) {
        Scanner console =new Scanner(System.in);
        System.out.println("how many day temparature ? ");
        int numDays =console.nextInt();
        //record temperatures amd find average
        int[] temps= new int[numDays];
        
        
        
        int sum=0;
        for (int i = 0; i < numDays; i++) {
        
            System.out.println("Day "+( i + 1)+"'s high temp: ");
            temps[i]=console.nextInt();
            sum+=temps[i];
            
        }
        double average=(double)sum/numDays;
        //count days above average 
        int above = 0;
        for (int i = 0; i < temps.length; i++) {
            if(temps[i]>average){
                above ++;
            }
            //report results
            System.out.println("");
            System.out.println("Average = "+average);
            System.out.println(above+" day above average");
        }
    }
}
