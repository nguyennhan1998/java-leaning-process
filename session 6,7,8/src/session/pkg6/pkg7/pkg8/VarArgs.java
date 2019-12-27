/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session.pkg6.pkg7.pkg8;

/**
 *
 * @author Admin
 */
public class VarArgs {
   public void addNumber(int...num){
       int sum=0;
       for(int i:num){
           sum=sum+i;
       }
       System.out.println("Sum of number is "+sum);
   }
   
}
