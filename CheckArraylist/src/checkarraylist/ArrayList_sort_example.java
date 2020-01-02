/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkarraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ArrayList_sort_example {
    public static void main(String[] args) {
        List<String> names= new ArrayList<>();
        names.add("lisa");
        names.add("jennifer");
        names.add("mark");
        names.add("david");
        System.out.println("name :"+names);
        //sort an array list using its sort() method you must pass a comparator to the arraylist.sort() method
//       names.sort(new Comparator<String>(){
//           @Override
//           public int Compare(String name1,String name2){
//               return name1.compareTo(name2);
//           }
//       });
//the above sort() method call can also be written simply using lambda expression
  names.sort((name1,name2)->name1.compareTo(name2));
  //following is an even more concise solution
  names.sort(Comparator.naturalOrder());
        System.out.println("Sorted names : "+names);
    
    
    }
}
