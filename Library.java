import java.util.Hashtable;

/* This is a stub for the Library class */
public class Library extends Building{

  private Hashtable<String, Boolean> collection;
  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);

    this.collection = new Hashtable<>();

    System.out.println("You have built a library: 📖");
  }

  public void addTitle(String title){
    collection.put(title, true);
    System.out.println(title + " is added to the library");
  }
  public String removeTitle(String title){
    collection.remove(title);
    System.out.println(title + " is removed from the library");
    return (title);
  }

  public void checkOut(String title){
    collection.replace(title, true, false);
    System.out.println(title + " is checked out from the library");
  }
  public void Return(String title){
    collection.replace(title, false, true);
    System.out.println(title + " is returned to the library");
  }

  public boolean containsTitle(String title){
    if (collection.containsKey(title)){
      System.out.println(title + " is in the library collection");
      return true;
    }
    System.out.println(title + " is not in the library collection");
    return false;
  }
  public boolean isAvailable(String title){
    if (collection.containsKey(title)){
      if (collection.get(title) == true){
        System.out.println(title + " is readily available");
        return true;
      }
      System.out.println(title + " is not readily available");
      return false;
    }

    throw new RuntimeException(title + " doesn't exist in the library. Check Collection!");
  } 
  public void printCollection(){
    System.out.println(collection.toString());
  } 
  
  public static void main(String[] args) {
    Library Neilson = new Library("Neilson", "10 Elm Street", 5);
    Neilson.addTitle("Brave New World by Aldous Huxley");
    Neilson.addTitle("Maybe the Moon by Armistead Maupin");
    Neilson.checkOut("Maybe the Moon by Armistead Maupin");
    Neilson.containsTitle("Maybe the Moon by Armistead Maupin");
    Neilson.isAvailable("Maybe the Moon by Armistead Maupin");
    Neilson.printCollection();
  }
  
}