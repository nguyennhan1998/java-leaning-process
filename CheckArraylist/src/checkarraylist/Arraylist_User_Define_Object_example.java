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
class user{
    private String name;
    private int age;
    public user(String name,int age){
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
    
}
public class Arraylist_User_Define_Object_example {
    public static void main(String[] args) {
        List<user> users= new ArrayList<>();
        users.add(new user("Rajeev",25));
        users.add(new user("john",34));
        users.add(new user("Steve",29));
        users.forEach(user->{
            System.out.println("name : "+user.getName()+", age : "+user.getAge()); 
        });
                
                
                
     }
}
