import java.util.ArrayList;

/* The house class is a child of the building class with additional features 
 * of residents and if the house has a dining room. 
 */
public class House extends Building {
  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  /* House Constructor-makes a house and tells the user which house has been made
   * @param name of the house is a string
   * @param address string address of the house
   * @param nfloors an integer describing the number of floors of the house
   * @param hDR a boolean telling how many floors the house
   */

  public House(String name, String address, int nfloors, boolean hDR) {
    super(name, address, nfloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hDR;

    System.out.println("You have built" + name + "house🏠");
    for (int i = 0; i<residents.size(); i++) {
        System.out.println(residents.get(i));
    }
  }

  /*
   * An accessor for number of residents
   * @return the number of residents living in a house
   */
  public int getnResidents() {
    return this.residents.size();

  }

  /*
   * An accessor for whether the house has a dining room or not
   * @return true (has a dining room) or false (doesn't have a dining room)
   */
  public boolean getHDR() {
    return this.hasDiningRoom;
  }

  /*
   * Adds new name to the array list of 
   * @param String name of the new resident
   */
  public void moveIn(String name) {
    this.residents.add(name);
  }

  /*
   * Removes someone from the residents array
   * @param name of the person moving out
   * @return the name of the person who moved out
   */
  public String moveOut(String name) {
    this.residents.remove(name);
    return name + "moved out";
  }

  /* 
   * 
   */
  public boolean isResident(String person) {
    return this.residents.contains(person);
  }

  /* main method (for testing)
     * @param args the command line args ignored in this context
    */
  public static void main(String[] args) {
    /* House to test out house methods */
    new House("BOTQ", "1 Chapin Way", 4, false);
  }

}