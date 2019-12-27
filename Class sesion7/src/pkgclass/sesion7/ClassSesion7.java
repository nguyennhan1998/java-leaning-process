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
public class ClassSesion7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int[] array1;
      
       Scanner input=new Scanner(System.in);
        System.out.println("so ngay ma ban muon nhap la: ");
        int n=input.nextInt();
         array1=new int[n];
         for(int i=0;i<n;i++){
             System.out.printf("nhap vao phan thu thu %d : ",i);
             array1[i]=input.nextInt();
         }
         for(int i=0;i<n;i++){
             System.out.printf("nhiet do cua ngay thu %d la : ",i );
             System.out.println(array1[i]);
         }
         int sum=0;
         for(int i=0;i<n;i++){
             sum+=array1[i];
         }
         float arv;
         arv=sum/(float)n;
         System.out.printf("nhiet do trung binh cua %d ngay da nhap la: %f ",n,arv);
         System.out.println("ngay co nhiet do lon hon nhiet do trung binh la: ");
         for(int i=0;i<n;i++){
             if(array1[i]>arv){
                 System.out.println(array1[i]+" , ");
             }
         }
         int[] arr2=new int[1000];
         Supprogram obj1=new Supprogram();
         int m;
         m=input.nextInt();       
         obj1.nhapmang(arr2, m);
         obj1.xuatMang(arr2,m);
                 
                 
                 
                 
    }
  
   
    
}
