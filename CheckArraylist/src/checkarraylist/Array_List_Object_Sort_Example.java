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
class Person{
    private String name;
    private Integer age;
    public Person(String name,Integer age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
   public String toString(){
       return "{"+
               "name=' "+name+ '\''+
               ", age "+age+
               '}';
   }
    
}
public class Array_List_Object_Sort_Example {
    public static void main(String[] args) {
        List<Person>people= new ArrayList<>();
            people.add(new Person("Sachin",47));
            people.add(new Person("Chris",34));
            people.add(new Person("Rajeev",25));
            people.add(new Person("David",31));
            System.out.println("Person List : "+people );
            //amoere concise way of writhing above sorting function 
            people.sort(Comparator.comparing(Person::getAge));
            System.out.println("Sorted person list by age : "+people);
            //you can also sort using collection.sort () method by passing the custom comparator
           people.sort(Comparator.comparing(Person::getName));
           System.out.println("Sorted person list by age : "+people);
           
    
    
    }
}
