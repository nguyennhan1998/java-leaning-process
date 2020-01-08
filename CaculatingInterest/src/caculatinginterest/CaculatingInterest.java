/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caculatinginterest;

/**
 *
 * @author Admin
 */
public class CaculatingInterest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BalanceAndrate person= new BalanceAndrate(1000,10);
       
        System.out.println("$"+ caculateInterest(person));
    }

    private static double caculateInterest(BalanceAndrate inte) {
         double interest;
        interest=inte.getBalance()*(inte.getRate()/1200);
        return interest;
    }

    

    
}
