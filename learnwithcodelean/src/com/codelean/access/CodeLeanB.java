/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codelean.access;
import com.codelean.access.CodeLeanA;
/**
 *
 * @author Admin
 */
public class CodeLeanB {
    public static void main(String[] args) {
        new CodeLeanA().methodPublic();
        new CodeLeanA().methodProtected();
        new CodeLeanA().methodDefault();
    }
    public void methodPublic(){
        
    }
    protected void methodProtected(){
        
    }
     void methodDefault(){
        
    }
    private void methodPrivate(){
        
    }
}
