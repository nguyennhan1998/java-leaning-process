/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactlist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ContactList {
    List<Contact> myContact= new ArrayList();

    public List<Contact> getMyContact() {
        return myContact;
    }

    public void setMyContact(List<Contact> myContact) {
        this.myContact = myContact;
    }
            
    public void addContact(Contact contact){
        myContact.add(contact);
    }
    public void DisplayContact(){
        myContact.forEach(contact->{
            System.out.println("Contact "+contact.getName()+ " "+ contact.getTel());
        });
    }
   public void updateContact(int index,Contact contact){
       myContact.set(index,contact);
       System.out.println("updated");
       System.out.println("stt "+(index+1)+ " "+ contact.getName()+" phone number :" +contact.getTel());
   }
   public void removeContact(int index){
       Contact contact = myContact.get(index);
        myContact.remove(index);
        System.out.println("Removed "+contact.getName());
   }
   public Contact getNamei(int index){
       return myContact.get(index);
       
   }
  public int findContact(String contactName){
      for (int i = 0; i < this.myContact.size(); i++) {
          Contact contact=this.myContact.get(i);
          if(contact.getName().equals(contactName)){
              System.out.print("your name exist in the list with the order: ");
              return i+1;
          }
      }
      return -1;
  }
 
}
