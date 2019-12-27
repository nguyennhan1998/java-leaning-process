/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Admin
 */
public class ArrayLists {
    ArrayList marks=new ArrayList();
    public void storeMarks(){
        System.out.println("Storing marks. Pleasing wait...");
        marks.add(67);
        marks.add(50);
        marks.add(45);
        marks.add(75);
    }
    public void displayMarks(){
        System.out.println("Mark are: ");
        System.out.println("Interating array list using for loop: ");
        for (int i=0;i<marks.size();i++){
            System.out.println(marks.get(i));
            
        }
        System.out.println("---------------");
        Iterator imarks =marks.iterator();
        System.out.println("Iterating array list using iterator: ");
        while (imarks.hasNext()){
            System.out.println(imarks.next());
            
        }
        System.out.println("---------------");
        
        Collections.sort(marks);
        System.out.println("Sorted list is: "+marks);
    }
}
