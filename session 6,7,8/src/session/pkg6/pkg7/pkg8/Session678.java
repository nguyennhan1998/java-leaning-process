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
public class Session678 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caculator objCalc=new Caculator();
        objCalc.add(3, 2);
        objCalc.sub(3, 2);
        objCalc.mul(3, 2);
        objCalc.div(3, 2);
        int num1=10;
        PassByValue obj=new PassByValue();
        obj.setVal(num1);
        System.out.println("value of num1 after envoking setVal is: "+num1);
        PassByRef p1=new PassByRef();
        p1.calcArea(new Circle(), 2);
        VarArgs obj1=new VarArgs();
        obj1.addNumber(10,20,30,40);
        Employee objEmp1 = new Employee(1200,"Roger Stevens");
        objEmp1.empDesig="Manager";
        objEmp1.setSSN("38484-74837-23646");
        objEmp1.display();
        MathdClass objMath=new MathdClass();
                
       objMath.add(3.4f,2);
       objMath.add(4,5);
       objMath.add(6,7,8);
       Student objStud1=new Student("David",302,"Washington Street");
       objStud1.displayDetails();
       Student objStud2=new Student(103,46);
       objStud2.displayDetails();
       Student objStud3=new Student(104,"Roger",50);
       objStud3.displayDetails();
        
        
        
    }
    
}
