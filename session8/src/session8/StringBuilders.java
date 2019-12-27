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
public class StringBuilders {

  StringBuilder str=new StringBuilder("java");
  public void displayStrings(){
      System.out.println("Append String is "+str.append("7"));
      System.out.println("Inserted String is :"+str.insert(5, "se"));
      System.out.println("Deleted String is : "+str.delete(4, 7));
      System.out.println("Reverted String is :"+str.reverse());
  }
}
