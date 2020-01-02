/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkarraylist;

import java.util.ArrayList;
import java.lang.String ;



/**
 *
 * @author Admin
 */
public class CheckArraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       ArrayList<String> animals= new ArrayList<String>();
       animals.add("tiger");
       animals.add("dog");
       animals.add("cat");
       animals.add("lion");
        System.out.println(animals);
        animals.add(2,"elephant");
        System.out.println(animals);
       
       
               
    }
    
}
