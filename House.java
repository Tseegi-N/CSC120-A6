import java.util.ArrayList;

/**
 * Extended class of Building where students live and dine in. 
 * @param attributes from inheritance AND 
 * whether the house has dining halls (boolean) and number of residents in the house (arrayList)
 * @return parameters or informations of the building
 */
public class House extends Building {
  /*Declaring parameters*/
  private ArrayList<String> residents; 
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDR) {
    /*Constructor */
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDR;

    System.out.println("You have built a house: 🏠");
  }

  /*Add student's name as a new resident when they move in */
  public void moveIn(String name){
    residents.add(name);
    System.out.println(name + " is now a resident");
  }

  /*Remove student's name when they move out */
  public String moveOut(String name){
    //Check if they are a resident
    if (residents.contains(name)){
      residents.remove(name);
      System.out.println(name + " has moved out from house");
      return (name);
    }
    System.out.println("No resident with that name exists in this house.");
    return("No resident with that name exists in this house.");
  }

  /*Check residents name list for test */
  public boolean isResident(String person){
    if (residents.contains(person)){
      System.out.println(person + " is a resident");
      return true;
    }
    System.out.println(person + " is not a resident");
    return false;
  }

  /*Whether there's a dining hall or no */
  public boolean hasDiningRoom(){
    if (hasDiningRoom == true){
      System.out.println("There's a dining hall at this house");
    }
    else{
      System.out.println("No dining hall at this house");
    }
    return hasDiningRoom;
  }

  /*If house has residents, print its number */
  public boolean nResidents(){
    if (residents.size() > 0){
      System.out.println("Number of residents: " + residents.size());
      return true;
    }
    System.out.println("No residents");
    return false;
  }

  public static void main(String[] args) {
    /*Main method (for testing) */
    House newHouse = new House("Capen", "10 Elm Street", 4, false);
    
    System.out.println(newHouse);
    newHouse.moveIn("Tseegi");
    newHouse.moveIn("Nyamdorj");
    newHouse.hasDiningRoom();
    newHouse.nResidents();
    newHouse.isResident("Nyamdorj");
    newHouse.moveOut("Nyamdorj");
    newHouse.isResident("Nyamdorj");
    newHouse.nResidents();
    
  }

}