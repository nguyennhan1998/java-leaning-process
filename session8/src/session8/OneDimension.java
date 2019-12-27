/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session8;

/**
 *
 * @author Admin
 */
public class OneDimension {
    int marks[];
    public void storeMarks(){
        marks=new int[4];
        System.out.println("Storing Marks . Please wait...");
        marks[0]=65;
        marks[1]=47;
        marks[2]=76;
        marks[3]=50;
        
    }
    public void displayMarks(){
        System.out.println("Marks are: ");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        
    }
     public void displayMark(){
       System.out.println("marks are: ");
       for(int count=0;count<marks.length;count++){
           System.out.println(marks[count]);
       }
   }
     public void displayMark2(){
         System.out.println("marks are: ");
         for(int value:marks){
             System.out.println(value);
         }
     }
}
