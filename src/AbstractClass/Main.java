package AbstractClass;

public class Main {
    public static void main(String[] args) {
        Dog dog =new Dog("Prince");
        dog.breathe();
        dog.eat();
       // bird is abstract so it cannot be instantiated
       // Bird bird = new Bird("parrot");
       // bird.eat();
       // bird.breathe();
        Parrot parrot = new Parrot(" Australian ringneck");
        parrot.breathe();
        parrot.fly();
        parrot.eat();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }

}
