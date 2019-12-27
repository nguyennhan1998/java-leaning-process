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
public class Employee {
    int empID;
    String empName;
    private String SSN;
    protected String empDesig;
    public Employee(int ID,String name){
        empID=ID;
        empName=name;
    }
    public String getSSN(){
        return SSN;
    }
    public void setSSN(String ssn){
        SSN=ssn;
    }
    public void setDesignation(String desig){
        empDesig=desig;
    }
    public void display(){
        System.out.println("Employee ID is "+empID);
        System.out.println("Employee name is :"+empName);
        System.out.println("Designation is : "+empDesig);
        System.out.println("SSN is "+SSN);
        
    }
}

