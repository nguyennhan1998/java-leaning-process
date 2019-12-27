/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racingcar;

import java.util.Scanner;

public class Account {

    private int password;

    public Account(int password, String id, int ballance, String name) {
        this.password = password;
        this.id = id;
        this.ballance = ballance;
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    private String id;

    public String getId() {
        return id;
    }
    private int ballance;

    public int getBallance() {
        return ballance;
    }

    public void setBallance(int ballance) {
        this.ballance = ballance;
    }

    public void setId(String id) {
        this.id = id;
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int withdrawal(int amount){
        if(amount>ballance){
           System.out.println("amount exceeded ballance");
            return ballance;
        }else{
            System.out.println("your ballance is: ");
            return ballance-amount;
        }
        
    }
    public int reposit(int amount){
        System.out.println("your ballance is : ");
        return ballance+amount;
    }
    public int transfer(int amount){
        if(amount<=ballance){
            System.out.println("your ballance after transfer is :");
            return ballance-amount;
        }else{
            System.out.println("amount exceeded ballance");
            System.out.println("your ballance is: ");
            return ballance;
        }
    }
    

}
