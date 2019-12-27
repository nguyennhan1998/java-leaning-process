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
public class TwoDimension {
    int marks[][];
    public void storeMarks(){
        marks=new int[4][2];
        System.out.println("Storing Mark. Please wait...");
        marks[0][0]=23;
        marks[0][1]=56;
        marks[1][0]=42;
        marks[1][1]=47;
        marks[2][0]=60;
        marks[2][1]=47;
        marks[3][0]=79;
        marks[3][1]=78;
        
    }
    public void displayMarks(){
        System.out.println("Marks are: ");
        System.out.println("Roll no.1: "+marks[0][0]+","+marks[0][1]);
        System.out.println("Roll no.2: "+marks[1][0]+" , "+marks[1][1]);
        System.out.println("Roll no.3: "+marks[2][0]+" , "+marks[2][1]);
        System.out.println("Roll no.4: "+marks[3][0]+" , "+marks[3][1]);
        
    }
   public void displayMark(){
       System.out.println("Marks are: ");
       for(int row=0;row<marks.length;row++){
           System.out.println("Rollno."+(row+1));
           for(int col=0;col<marks[row].length;col++){
               System.out.println(marks[row][col]);
           }
       }
   }
   public void totalMarks(){
       System.out.println("Total Marks are: ");
       for(int row=0;row <marks.length;row++){
           System.out.println("Roll no."+(row+1));
           int sum=0;
           for(int value:marks[row]){
               sum=sum+value;
           }
           System.out.println(sum);
       }
   }
    
   
   
   
   
   
   
   
}
