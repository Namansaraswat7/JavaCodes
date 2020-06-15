package InterfaceChallenges;

import java.util.ArrayList;
import java.util.Scanner;

public class MainIsavable {

    public static void main(String[] args) {
        Player tim = new Player("Tim",10,15);
        System.out.println(tim.toString());
        saveObject(tim);
        tim.setHitPoints(8);
        System.out.println(tim);
        tim.setWeapon("Stormbringer");
        saveObject(tim);
        //loadObject(tim);
        System.out.println(tim);

        ISavable werewolf = new Monster("Wearwolf",20,40);
        //If we are using Isavable interface as reference in case of warewolf and creating instance of implemented
        //class Monster than we can only access  implemented methods (in this case read() and write()) ,
        // we can't use methods present in Monster class like warewolf.getStrength() will throw an error
        // to use Monster class methods we need to use below process that is we need to do casting it to Monster class
        System.out.println("Strength = "+((Monster) werewolf).getStrength());
        System.out.println(werewolf);
        saveObject(werewolf);
    }
    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n"+
                "1 to enter a string\n"
        +"0 to quit");
        while (!quit){
            System.out.println("Choose an option: ");
            int choice = s.nextInt();
            s.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = s.nextLine();
                    values.add(index,stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
    public static void saveObject(ISavable objectToSave){
        for(int i=0;i<objectToSave.write().size();i++){
            System.out.println("saving"+objectToSave.write().get(i)+" to storage device");
        }
    }
    public static void loadObject(ISavable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }














}
