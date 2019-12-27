/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racingcar;

import java.util.Scanner;

/*import java.util.Scanner;*/
/**
 *
 * @author Admin
 */
public class Racingcar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car a = new Car("car1");
        Car b = new Car("car2");
        Car c = new Car("car3");
        a.setSpeed((float) Math.random());
        b.setSpeed((float) Math.random());
        c.setSpeed((float) Math.random());
        if (a.getSpeed() > b.getSpeed()) {
            if (b.getSpeed() > c.getSpeed()) {

                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            } else {
                if (c.getSpeed() > a.getSpeed()) {

                    System.out.println(c);
                    System.out.println(a);
                    System.out.println(b);
                } else {

                    System.out.println(a);
                    System.out.println(c);
                    System.out.println(b);
                }
            }
        } else {
            if (a.getSpeed() > c.getSpeed()) {
                System.out.println(b);
                System.out.println(a);
                System.out.println(c);
            } else {
                if (a.getSpeed() > c.getSpeed()) {
                    System.out.println(c);
                    System.out.println(b);
                    System.out.println(a);
                } else {
                    System.out.println(b);
                    System.out.println(c);
                    System.out.println(a);
                }

            }

        }
        Account customer = new Account(0, "0", 5000, "nguyenvana");
        String d = customer.getId();
        int e = customer.getPassword();
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so tai khoan cua ban: ");
        String k = input.nextLine();
        System.out.println("nhap so mat khau cua ban: ");
        int f = input.nextInt();

        if (e == f && d.equals(k)) {
            System.out.printf("your account is: %s \n", customer.getId());
            System.out.printf("your ballance is: %d\n", customer.getBallance());
            System.out.println("so tien ban muon rut la: \n");
            int n = input.nextInt();
            System.out.printf("%d\n", customer.withdrawal(n));
            System.out.println("so tien ma ban muon nap la:\n ");
            int m = input.nextInt();
            System.out.printf("%d\n",customer.reposit(m));
            System.out.println("chon so tien ma ban muon chuyen khoan: ");
            int l = input.nextInt();
            System.out.printf("%d\n",customer.transfer(l));

        } else {
            System.out.println("mat khau hoac so tai khoan cua ban bi loi xin vui long nhap lai");
        }

    }

}
