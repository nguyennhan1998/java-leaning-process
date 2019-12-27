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
public class Strings {
   String str="hello";
   Integer strLength=5;
   public void displayString(){
       System.out.println("String length is: "+str.length());
       System.out.println("character at index two is : "+str.charAt(2));
       System.out.println("Concatinated string is :"+str.concat("World"));
       System.out.println("String comparation is :"+str.compareTo("World"));
       System.out.println("Index of o 1 is: "+str.indexOf("o"));
       System.out.println("The last index of 1 is :"+str.lastIndexOf("1"));
       System.out.println("Replace the string is : "+str.replace('e','a'));
       System.out.println("SubString is: "+str.substring(2,5));
       System.out.println("Integer String is:"+strLength.toString());
       String str1="hello";
       System.out.println("Untrimmed string is : "+str1);
       System.out.println("Trimmed string is : "+str1.trim());
       
       
       
   }
   
}
