package AndroidJavaBasics;

import java.util.ArrayList;

/*Created by Naman on 27/06/2020
* */
public class Player {
   private String handleName;
    private int lives;
    private int level;
    private  int score;
    private Weapon weapon;
    private ArrayList<Loot> inventory;

    public Player(){
        this("unknown player");
    }

    public Player(String handleName) {
        this(handleName,1);
    }

    public Player(String handleName,int startingLivel){
//        this.handleName = handleName;
//        this.lives=3;
//        this.level=1;
//        this.score=0;
        setHandleName(handleName);
        setLives(3);
        setLevel(startingLivel);
        setScore(0);
        setDefaultWeapon();
        inventory = new ArrayList<>();

    }

    public String getHandleName() {
        return handleName;
    }

    public int getLives() {
        return lives;
    }

    public int getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }

    public void setHandleName(String handleName) {
        if(handleName.length()<3)
            return;
        this.handleName = handleName;
        setDefaultWeapon();
    }
    private void setDefaultWeapon(){
        this.weapon=new Weapon("Sword",10,20);
    }

    public  void setNameAndLevel(String name,int level){
//        this.handleName=name;
//        this.level=level;
        setHandleName(name);
        setLevel(level);
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public ArrayList<Loot> getInventory() {
        return inventory;
    }

//    public void setInventory(ArrayList<Loot> inventory) {
//        this.inventory = inventory;
//    }
    public void pickUpLoot(Loot newLoot){
        inventory.add(newLoot);
    }
    public boolean dropLoot(Loot loot){
        if(this.inventory.contains(loot)) {
            inventory.remove(loot);
            return true;
        }
        return false;
    }

    public void showInventory(){
        for(Loot item : inventory)
        {
            System.out.println(item.getName());
        }
        System.out.println("============================");
    }
}
