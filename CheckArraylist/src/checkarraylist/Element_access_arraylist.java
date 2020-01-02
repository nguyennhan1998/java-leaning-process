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
public class Element_access_arraylist {
    public static void main(String[] args) {
        List<String> topCompanies= new ArrayList<>();
        System.out.println("is the top company empty ?"+topCompanies.isEmpty());
        topCompanies.add("google");
        topCompanies.add("apple");
        topCompanies.add("microsoft");
        topCompanies.add("amazon");
        topCompanies.add("facebook");
        System.out.println("is the top companies empty ?"+topCompanies.isEmpty());
        System.out.println("top "+topCompanies.size()+" best companies is ");
        System.out.println(topCompanies);
        String bestCompany= topCompanies.get(0);
        String secondBestCompany=topCompanies.get(1);
        String lastCompany=topCompanies.get(topCompanies.size()-1);
        System.out.println("best company is "+bestCompany);
        System.out.println("the second best company is "+secondBestCompany);
        System.out.println("the last company is : "+lastCompany);
        topCompanies.set(4,"warlMark");
        System.out.println("the top companies after modified is : "+topCompanies);
        
    }
}
