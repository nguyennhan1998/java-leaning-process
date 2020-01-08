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
public class MyFlight {
    
    private int number;

    public MyFlight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }
    public void display(){
        System.out.println("number is "+number);
        System.out.println("destination is "+destination);
    }

    /**
     * Get the value of number
     *
     * @return the value of number
     */
    public int getNumber() {
        return number;
    }

    /**
     * Set the value of number
     *
     * @param number new value of number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    private String destination;

    /**
     * Get the value of destination
     *
     * @return the value of destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Set the value of destination
     *
     * @param destination new value of destination
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

}
