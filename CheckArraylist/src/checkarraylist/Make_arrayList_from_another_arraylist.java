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
public class Make_arrayList_from_another_arraylist {
    public static void main(String[] args) {
        List<Integer> firstFivePrimeNumber= new ArrayList<Integer>();
        firstFivePrimeNumber.add(2);
        firstFivePrimeNumber.add(3);
        firstFivePrimeNumber.add(5);
        firstFivePrimeNumber.add(7);
        firstFivePrimeNumber.add(11);
        System.out.println("first five prime number: "+firstFivePrimeNumber);
        List<Integer> firstTenPrimeNumber= new ArrayList<Integer>(firstFivePrimeNumber);
        System.out.println("first ten prime number: "+firstTenPrimeNumber);
        List<Integer> nextFivePrimeNumber= new ArrayList<Integer>();
        nextFivePrimeNumber.add(13);
        nextFivePrimeNumber.add(17);
        nextFivePrimeNumber.add(19);
        nextFivePrimeNumber.add(23);
        nextFivePrimeNumber.add(27);
        firstTenPrimeNumber.addAll(nextFivePrimeNumber);
        System.out.println("first ten prime Number"+firstTenPrimeNumber);
    }
}
