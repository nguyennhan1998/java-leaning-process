/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass.sesion7;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ADf1 {
    public static void main(String[] args) {
        int[] arr1;
        arr1=new int[6];
        System.out.println("nhap so diem cua tung sinh vien");
        for (int i = 0; i < arr1.length; i++) {
            Scanner input = new Scanner(System.in);
            arr1[i]=input.nextInt();
            
        }
        int count1=0;
        int count2=0;
        int count3=0;
        for (int i=0;i<arr1.length;i++){
            if(arr1[i]<40){
                count1++;
            }else if(arr1[i]>=40&&arr1[i]<75){
                count2++;
            }
            else if(arr1[i]>=75){
                count3++;
            }
        }
        System.out.printf("so hoc sinh truot mon la : %d\n",count1);
        System.out.printf("so hoc sinh kha la :  %d\n",count2);
        System.out.printf("so hoc sinh gioi la: %d\n",count3);
    }
}
