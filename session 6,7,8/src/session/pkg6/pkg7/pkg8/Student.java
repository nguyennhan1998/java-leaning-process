/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session.pkg6.pkg7.pkg8;

/**
 *
 * @author Admin
 */
public class Student {
    int rollNo;
    String name;
    String address;
    float marks;
    public Student(){
        rollNo=0;
        name="";
        address="";
        marks=0;
    }
    public Student(int rNo,String sname){
        rollNo=rNo;
        name =sname;
        
    }
    public Student(int rNo,float score){
        rollNo=rNo;
        marks=score;
    }
    public Student(String sName,String addr){
        name =sName;
        address=addr;
    }
    public Student(int rNo,String sname,float score){
        rollNo=rNo;
        name=sname;
        marks=score;
    }
    public Student(String sname,int rNo,String addr){
        
        name=sname;
        rollNo=rNo;
        address=addr;
    }
    public void displayDetails(){
        System.out.println("Rollno :"+rollNo);
        System.out.println("Student name:"+name);
        System.out.println("Address "+address);
        System.out.println("Score "+marks);
        System.out.println("----------------");
    }
    
            
}
