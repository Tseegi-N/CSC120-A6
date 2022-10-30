/**
 * Building class (parent/base)
 * Assignment 6: Use What Your Parent (Class) Gave You
 * @author Tseegi Nyamdorj 
 * Collaborated with Tina Chang
 * Saves building name, address, and number of floors (Parent class for other classes)
 * @param address/name strings of the building, int number of floors  
 * @return parameters or informations of the building
 */
public class Building {
    /*Declaring parameters*/
    private String name = "<Name Unknown>";
    private String address = "<Address Unknown>";
    private int nFloors = 1;

    public Building(String name, String address, int nFloors) {
        /*Constructor */
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    public String getName() {
        /*Accessor for name */
        return this.name;
    }

    public String getAddress() {
        /*Accessor for address */
        return this.address;
    }

    public int getFloors() {
        /*Accessor for floor number */
        return this.nFloors;
    }

    public String toString() {
        /*Prints out parameters of the building in string */
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    public static void main(String[] args) {
        /*main method for (testing) */
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}