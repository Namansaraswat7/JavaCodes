package ArrayListChalanges;

import java.util.ArrayList;

public class MobilePhone {

    private  String muNumber;
    private ArrayList<Contact> mycontacts;

    public MobilePhone(String muNumber)
    {
        this.muNumber= muNumber;
        this.mycontacts= new ArrayList<Contact>();
    }
    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName())>=0){
            System.out.println("contact is already on file");
            return false;
        }
        mycontacts.add(contact);
        return true;
    }
    public boolean updateContact(Contact oldContact,Contact newContact){
        int foundPosition=findContact(oldContact);
        if(foundPosition<0)
        {
            System.out.println(oldContact.getName()+" was not found");
            return false;
        }
        else if(findContact(newContact.getName())!=-1){
            System.out.println("contact with name " + newContact.getName()+" already exists. update was not successful");
            return false;
        }
        this.mycontacts.set(foundPosition,newContact);
        System.out.println(oldContact.getName()+" was replaced with "+ newContact.getName());
        return true;
    }
    private int findContact(Contact contact){

        return this.mycontacts.indexOf(contact);

    }
    private int findContact(String  contactName){
        for(int i=0;i<this.mycontacts.size();i++)
        {
            Contact contact = this.mycontacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
     return -1;
    }
    public String qureyContact(Contact contact){
        if(findContact(contact)>0){
            return contact.getName();
        }
        return null;
    }
    public  boolean removeContact(Contact contact){

        int foundPosition = findContact(contact);
        if(foundPosition<0){
            System.out.println(contact.getName()+", was not found");
            return false;
        }
        this.mycontacts.remove(foundPosition);
        System.out.println(contact.getName()+", was deleted");
        return  true;
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if(position>=0){
            return this.mycontacts.get(position);
        }
        return null;

    }
    public void printContacts(){
        System.out.println("contacts List");
        for(int i=0;i<this.mycontacts.size();i++)
        {
            System.out.println((i+1)+"."+
                    this.mycontacts.get(i).getName()+"-->"+
                    this.mycontacts.get(i).getPhoneNumber());
        }
    }

}
