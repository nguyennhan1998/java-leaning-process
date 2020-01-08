/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flight;

/**
 *
 * @author Admin
 */
public class Flight {
    public static void main(String[] args) {
        MyFlight myFlight=new MyFlight(1, "vietName");
        myFlight.display();
        System.out.println("destination is : "+myFlight.getDestination());
        System.out.println("number is : "+myFlight.getNumber());
    }
}
