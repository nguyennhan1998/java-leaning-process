/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racingcar;

/**
 *
 * @author Admin
 */
public class Car {
    
    public Car(float speed, String name) {
        this.speed = speed;
        this.name = name;
    }
    public Car(String name){
        this.name=name;
    }

    private float speed;

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int x = 10;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    private int y = 20;

    @Override
    public String toString() {
        return "car{" + "speed=" + speed + ", name=" + name + ", x=" + x + ", y=" + y + '}';
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
