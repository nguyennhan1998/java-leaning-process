/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkarraylist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Find_an_element_in_ArrayList {
    public static void main(String[] args) {
        List<String> names= new ArrayList<>();
        names.add("john");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("maria");
        //check if an arraylist contain a given element
        System.out.println("Does Array contain \"bob\" ? : "+names.contains("Bob"));
        //find the index of the first accurence of an element in an arraylist
        System.out.println("Index of \"Steve\" is : "+names.indexOf("Steve"));
        System.out.println("Index of \"Mark\" is : "+names.indexOf("Mark"));
        //find the index of the last accurence of an element in an arraylist
        System.out.println("Index of \"john\" is : "+names.lastIndexOf("John"));
        System.out.println("Last of index \"bill\" is : "+names.lastIndexOf("Bill") );
        
    }
}
