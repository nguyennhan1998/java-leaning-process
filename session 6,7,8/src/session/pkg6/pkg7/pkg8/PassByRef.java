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
class Circle {
    private double PI=3.14;
    public double getPI(){
        return PI;
    }
    public double calcArea(double rad){
        return (3.14*rad*rad);
    }
}
public class PassByRef {
    public void calcArea(Circle objPi, double rad){
        double area=objPi.getPI()*rad*rad;
        System.out.println("area of circle is : "+area);
        
    }
}
