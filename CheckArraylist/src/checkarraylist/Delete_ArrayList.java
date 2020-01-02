/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkarraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


/**
 *
 * @author Admin
 */
public class Delete_ArrayList {
    public static void main(String[] args) {
        List<String> programmingLanguages= new ArrayList<>();
        programmingLanguages.add("c");
        programmingLanguages.add("c++");
        programmingLanguages.add("java");
        programmingLanguages.add("koltin");
        programmingLanguages.add("python");
        programmingLanguages.add("perl");
        programmingLanguages.add("ruby");
        System.out.println("the list of programming language is :"+ programmingLanguages);
        programmingLanguages.remove(5);
        System.out.println("the list of programming language after remove 5 is : "+programmingLanguages);
        programmingLanguages.remove("koltin");
        System.out.println("the list of programming language after remove koltin is : "+programmingLanguages);
        List<String> scriptLanguage= new ArrayList<>();
        scriptLanguage.add("python");
        scriptLanguage.add("ruby");
        scriptLanguage.add("perl");
        programmingLanguages.removeAll(scriptLanguage);
        System.out.println("the programming languager after remove script language colection is : "+programmingLanguages);
        programmingLanguages.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("c");
            }
        });
        
        System.out.println("the list of the programming language after delete the programming language started with c:"+programmingLanguages);
        programmingLanguages.clear();
        System.out.println("the list of the programming language afer clear all is : "+programmingLanguages);
        
        
        
        
        
        
        
        
    }
 
}
