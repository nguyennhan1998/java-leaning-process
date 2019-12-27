/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session8;

/**
 *
 * @author Admin
 */
public class Wrappers {
    public void calcResult(int num1,int num2,String choise){
        switch(choise){
            case "+":System.out.println("Result after addition is : "+(num1+num2));
            break;
            case "-":System.out.println("Result after substraction is :"+(num1-num2));
            break;
            case "/": System.out.println("Result after devide is : "+(num1/num2));
            break;
            case "*":System.out.println("Result after multiplication is:"+(num1*num2));
        }
    }
}
