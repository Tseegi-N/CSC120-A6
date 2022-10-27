import java.util.ArrayList;

/* This is a stub for the House class */
public class House extends Building {

  private ArrayList<String> residents; 
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDR) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDR;

    System.out.println("You have built a house: 🏠");
  }

  public void moveIn(String name){
    residents.add(name);
    System.out.println(name + " is now a resident");
  }

  public String moveOut(String name){
    if (residents.contains(name)){
      residents.remove(name);
      System.out.println(name + " has moved out from house");
      return (name);
    }
    System.out.println("No resident with that name exists in this house.");
    return("No resident with that name exists in this house.");
  }

  public boolean isResident(String person){
    if (residents.contains(person)){
      System.out.println(person + " is a resident");
      return true;
    }
    System.out.println(person + " is not a resident");
    return false;
  }

  public boolean hasDiningRoom(){
    if (hasDiningRoom == true){
      System.out.println("There's a dining hall at this house");
    }
    else{
      System.out.println("No dining hall at this house");
    }
    return hasDiningRoom;
  }
  public boolean nResidents(){
    if (residents.size() > 0){
      System.out.println("Number of residents: " + residents.size());
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
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