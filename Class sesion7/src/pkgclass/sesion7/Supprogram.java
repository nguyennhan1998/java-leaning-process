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
public class Supprogram {
  
   
   public void nhapmang(int  array1[],int n){
       
       Scanner input=new Scanner(System.in);
      
       for(int i=0;i < n;i++){
           System.out.println("nhap vao so thu "+(i+1)+" : ");
           array1[i]=input.nextInt();  
       }
               
   }
  
  public void xuatMang(int array1[],int n){
       for(int i=0;i<n;i++){
           System.out.println(array1[i]+" , ");
       }
       
   }
    
   
    
    
    
}
