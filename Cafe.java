/* This is a stub for the Cafe class */
public class Cafe extends Building {
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    public Cafe(String name, String address, int nFloors, int coffee, int sugar, int cream, int cups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = coffee;
        this.nSugarPackets = sugar;
        this.nCreams = cream;
        this.nCups = cups;
        System.out.println("You have built a cafe: ☕");
    }

    public void sellCoffee(int size, int sugar, int creams){
        if (nCoffeeOunces < 1 || nCreams < 1 || nSugarPackets < 1 || nCups < 1){
            System.out.println("Please restock inventory!");
            restock(20, 10, 10, 5);
            System.out.println("Stocked inventory: " + nCoffeeOunces + " ounces of coffee, " +
            nSugarPackets + " sugar packets, " + nCreams + " splashes of cream, " + nCups + " cups");  
        }
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= sugar;
        this.nCreams -= creams;
        this.nCups -= 1;
        System.out.println("Inventory after sale: " + nCoffeeOunces + " ounces of coffee, " +
            nSugarPackets + " sugar packets, " + nCreams + " splashes of cream, " + nCups + " cups");  
    }

    private void restock(int nCoffee, int nSugar, int nCream, int nCup){
        this.nCoffeeOunces = nCoffee;
        this.nSugarPackets = nSugar;
        this.nCreams = nCream;
        this.nCups = nCup;
    }
    
    public static void main(String[] args) {
        Cafe Compass = new Cafe("Compass", "Smith College", 1, 5, 3, 2, 1);
        Compass.sellCoffee(2, 1, 1);
        Compass.sellCoffee(2, 1, 1);
    }
    
}
