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
public class classification_student {
    private static Scanner input= new Scanner(System.in);
    public static void main(String[] args) {
       int [] student =studentMark(7);
        checkstudent(student);
       
        
    }
    public static int[] studentMark(int size){
        int[] student=new int[size];
        System.out.println("Enter the mark of "+size+" students");
        for (int i = 0; i <size; i++) {
            student[i]=input.nextInt();
        }
        return student;
    }
    public static void checkstudent(int [] array){
        int count1=0;
        int count2=0;
        int count3=0;
        for(int i=0;i<array.length;i++){
           if(array[i]<40){
               count1++;
               
           }else if(array[i]>=40&&array[i]<75){
               count2++;
           }else if(array[i]>=75){
               count3++;
           }
                   
        }
        System.out.println("so hoc sinh truot mon la : "+count1);
        System.out.println("so hoc sinh kha la: "+count2);
        System.out.println("so hoc sinh gioi la: "+count3);
        
    }
}

