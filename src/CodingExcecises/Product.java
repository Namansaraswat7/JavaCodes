package CodingExcecises;

public class Product {
    String name;
    String location;
    int weight;
    String output;
    public Product(String name) {
        this.name = name; 
        this.location = "shelf";
        this.weight = 1;
        this.output = name +" (1Kg) can be found from the shelf";
    }
    public Product(String name, String location) {
        this.name = name;
        this.location = location;
        this.weight = 1;
        this.output = name + " (1Kg) can be found from the " + location;
    }
    public Product(String name, int weight) {
        this.name = name;
        this.location = "shelf";
        this.weight = weight;
        this.output = name + " ("+ weight + "Kg) can be found from the shelf" ;
    }
    @Override
    public String toString() {
        return output;
    }
}
