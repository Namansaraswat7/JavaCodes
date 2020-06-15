package LinkedListChallenges;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListdemo {
    public static void main(String[] args) {
        LinkedList<String> placeToVisit = new LinkedList<String>();
        addInOrder(placeToVisit,"Bangalore");
        addInOrder(placeToVisit,"Chennai");
        addInOrder(placeToVisit,"Agra");
        addInOrder(placeToVisit,"Noida");
        addInOrder(placeToVisit,"Ghazaibad");
        addInOrder(placeToVisit,"Delhi");

        printList(placeToVisit);
        addInOrder(placeToVisit,"Pune");
        addInOrder(placeToVisit,"Mumbai");
        printList(placeToVisit);
        visit(placeToVisit);
    }
    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i =linkedList.iterator();
        while (i.hasNext())
        {
            System.out.println("Now visiting ..."+i.next());
        }
        System.out.println("*******************");

    }

    private static boolean addInOrder(LinkedList<String> linkedList,String newCity){
        //Normal iterator don't allow us to go back but ListIterator gives us this functionality and that's why it is useful
        ListIterator<String> stringListIterator =linkedList.listIterator();
        while (stringListIterator.hasNext())
        {
            int comparison = stringListIterator.next().compareTo(newCity);//here we already move to next city
            if(comparison==0){
                //equal,do not add
                System.out.println(newCity+" is already included ");
                return false;
            }
            else if(comparison>0)
            {
                //newCity should appear before this one
                //Bangalore--agra
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return  true;
            }
            else if(comparison>0){
                //move on next city
            }

        }
        stringListIterator.add(newCity);
        return true;
    }
    private static void  visit(LinkedList<String> cities){
        Scanner s = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator= cities.listIterator();
        if(cities.isEmpty()){
            System.out.println("no cities in the itenerary");
            return;
        }
        else {
            System.out.println("Now Visiting"+ listIterator.next());
            printMenu();

        }
        while (!quit){
            int action =s.nextInt();
            s.nextLine();
            switch (action){
                case 0:
                    System.out.println("holiday vacations over");
                    quit =true;
                    break;
                case 1:
                    if(listIterator.hasNext())
                    {
                        System.out.println("Now Visiting "+listIterator.next());
                    }
                    else {
                        System.out.println("reached at the end of list");
                    }
                    break;
                case 2:
                    if(listIterator.hasPrevious()){
                        System.out.println("Now previous "+listIterator.previous());
                    }
                    else {
                        System.out.println("we are at the start of the list");
                    }
                    break;
                case 3:
                    printMenu();
                    break;

            }

        }
    }
    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 ---to quit:\n"+
                "1 --- go to next city\n"+
                "2 --- go to previous city"+
                "3 --- print menu options again"
                );
    }


}
