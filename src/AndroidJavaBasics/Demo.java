package AndroidJavaBasics;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {
        Player nam = new Player("Naman",8);

        Loot redPotion = new Loot("RedPotion",LootType.POTION,7);

        nam.pickUpLoot(redPotion);

        nam.pickUpLoot(new Loot("+3 chest armor",LootType.ARMOR,80));

        nam.pickUpLoot(new Loot("Ring of protection +2",LootType.RING,40));

      //  ArrayList<Loot> allItems = nam.getInventory();

       nam.showInventory();

       //Loot bluePotion = new Loot("Blue Potion",LootType.POTION,9);

       boolean wasDeleted = nam.dropLoot(redPotion);

        System.out.println(wasDeleted);

        nam.showInventory();

        Enemy enemy = new Enemy("test enemy",10,3);
        enemy.showInfo();
        enemy.takeDamage(3);
        enemy.showInfo();
        enemy.takeDamage(11);
        enemy.showInfo();

        Vampyre vlad = new Vampyre("Vlad");
        vlad.showInfo();
        vlad.takeDamage(8);




    }
}
