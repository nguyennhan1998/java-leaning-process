/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactlist;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {

    public static void main(String[] args) {

        ContactList contactList = new ContactList();
        contactList.addContact(new Contact("vanh", "1234"));
        contactList.addContact(new Contact("linh", "43763"));
        contactList.addContact(new Contact("huyen", "2647373"));
        contactList.addContact(new Contact("nhan", "73483834"));
        System.out.println("Starting phone...");
        //contactList.DisplayContact();
        //      contactList.updateContact(2,new Contact("nhan","0393910646"));
        //       contactList.DisplayContact();
        //    contactList.removeContact(2);
        // System.out.println(contactList.findContact("nhan"));
        System.out.println("Available actions: ");
        System.out.println("press");
        System.out.println("0   - to shutdown");
        System.out.println("1   - to print contact");
        System.out.println("2   - to add a new contact");
        System.out.println("3   - to update existing an existing contact");
        System.out.println("4   - to remove existing contact");
        System.out.println("5   - query if an existing contact exists");
        System.out.println("6   - to print available actions");
        Scanner input = new Scanner(System.in);
        int x;
        do {
            
            System.out.println("\nChoose your action: Enter 6 to show available actions");
            x = input.nextInt();
            String y;
            String z;
            out:
            input.nextLine();
            int index;
            switch (x) {
                case 0:
                    System.out.println("you have been canceled");
                    break;
                case 1:
                    contactList.DisplayContact();
                    System.out.println("enter the action");
                    break;
                case 2:
                    String a,
                     b;
                    System.out.println("name");
                    a = input.nextLine();
                    System.out.println("phone number: ");
                    b = input.nextLine();
                    contactList.addContact(new Contact(a, b));
                    System.out.println("the list after add is : ");
                    contactList.DisplayContact();
                    break;
                case 3:
                    System.out.println("the name that you want to add to the list is ");
                    y = input.nextLine();

                    System.out.println("phone number is : ");
                    z = input.nextLine();

                    System.out.println("the position that you want to add is :");
                    index = input.nextInt();
                    contactList.updateContact(index, new Contact(y, z));
                    break;

                case 4:
                    System.out.println("enter index remove: ");
                    int c = input.nextInt();
                    contactList.removeContact(c);
                    System.out.println("the list after remove is :");
                    contactList.DisplayContact();
                    break;
                case 5:
                    System.out.println("enter a String to find T.T");
                    String d = input.nextLine();
                    System.out.println(contactList.findContact(d));
                    break;
                case 6:
                    System.out.println("0   - to shutdown");
                    System.out.println("1   - to print contact");
                    System.out.println("2   - to add a new contact");
                    System.out.println("3   - to update existing an existing contact");
                    System.out.println("4   - to remove existing contact");
                    System.out.println("5   - query if an existing contact exists");
                    System.out.println("6   - to print available actions");
                    break;
            }
        } while (x != 0);

    }
}
