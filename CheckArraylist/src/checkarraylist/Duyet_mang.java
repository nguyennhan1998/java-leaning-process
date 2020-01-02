/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkarraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Admin
 */
public class Duyet_mang {
    public static void main(String[] args) {
        List<String> tvShows= new ArrayList<>();
        tvShows.add("Breaking bad");
        tvShows.add("Game of throne");
        tvShows.add("Friends");
        tvShows.add("Prison break");
        System.out.println("\n==Interate using java forEach and lamda is ===");
        tvShows.forEach(tvShow ->{
            System.out.println(tvShow);
        });
        System.out.println("\n===Iterate using an Iterator()===");
        Iterator<String> tvShowIterator=tvShows.iterator();
        while (tvShowIterator.hasNext()){
           String tvShow=tvShowIterator.next();
            System.out.println(tvShow);
        };
        System.out.println("\n===Interator using a listIterator() to traverse in both direction===");
        tvShowIterator =tvShows.iterator();
        tvShowIterator.forEachRemaining(tvShow->{
            System.out.println(tvShow);
        });
        System.out.println("\n==iterate using a list iterator() to traverse in both direction");
        ListIterator<String> tvShowListIterator= tvShows.listIterator(tvShows.size());
        while (tvShowListIterator.hasPrevious()){
            String tvshow= tvShowListIterator.previous();
            System.out.println(tvshow);
        }
        System.out.println("\n===Iterate using simple for each loop");
        for (String tvShow:tvShows){
            System.out.println(tvShow);
        }
        System.out.println("\n==Iterate using for loop with index===");
        for(int i=0;i<tvShows.size();i++){
            System.out.println(tvShows.get(i));
        }
             
         }
}
