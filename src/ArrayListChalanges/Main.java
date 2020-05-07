package ArrayListChalanges;

import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);
    private static MobilePhone mobilePhone =new MobilePhone("0039 330 4404");
    public static void main(String args[]){
        //create a program that implements a simple mobile phone with the following capibilities.
        //Able to store , modify, remove, and query contact names.
        //you will want to create a separate class for contacts (name and phone number).
        //Create a masterclass (MobilePhone) that holds the Arraylist of contacts
        //The MobilePhone class has the functionality listed above.
        //Add a menu of options that are available
        //options : Quit,print list of contacts,add new contact, update existing contact,remove contact
        //add search/find contact
        //when adding or updating be sure to check if the contact already exist(use name)
        //Be sure not to expose the inner workings of the ArrayList to MobilePhones
        //eg. no ints, no.get(i) etc
        //MobilePhones should do everything with contact objects only.
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit)
        {
            System.out.println("\n Enter actions:  ");
            int action = s.nextInt();
            switch (action){
                case 0:
                    System.out.println("\nShutting down...");
                    quit=true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;

            }


        }




    }
    private static void addNewContact(){
        System.out.println("Enter new contact..");
        String name = s.next();
        System.out.println("Enter phone number...");
        String phone = s.next();
        Contact newContact = Contact.createContact(name,phone);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added:"+name+", phone="+phone);
        }
        else
        {
            System.out.println("can't add name already on file");
        }
    }
    private static void updateContact(){

        System.out.println("Enter existing contact name");
        String name = s.next();
        Contact existingContactRecord  = mobilePhone.queryContact(name);
        if(existingContactRecord==null){
            System.out.println("contact not found");
            return;
        }
        System.out.print("Enter new contact name:");
        String newName = s.next();
        System.out.println("Enter new contact phone number");
        String newNumber = s.next();
        Contact newContact = Contact.createContact(newName,newNumber);
        if(mobilePhone.updateContact(existingContactRecord,newContact)){
            System.out.println("successfully update record");

        }
        else
        {
            System.out.println("error updating record");
        }
    }
    private static void removeContact() {

        System.out.println("Enter existing contact name");
        String name = s.next();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("contact not found");
            return;
        }
        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Successfully deleted");
        }
        else
        {
            System.out.println("Error deleting contact...");
        }
    }

    private static void queryContact() {

        System.out.println("Enter existing contact name");
        String name = s.next();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("contact not found");
            return;
        }
        System.out.println("Name"+existingContactRecord.getName()+" phone number is"+ existingContactRecord.getPhoneNumber());

    }

    private static void startPhone(){
        System.out.println("starting phone ...");
    }
    private static void printActions(){
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n+" +
                "1 - to print contacts\n"+
                "2 - to add a new contact\n"+
                "3 - to update an existing contact\n"+
                "4 - to remove an existing contact\n"+
                "5 - query if an existing contact exists\n"+
                "6 - to print a list of available actions");
        System.out.println("choose your action:  ");








    }
}
