/*
 *Parent class-building 
 */
public class Building {

    private String name = "<Name Unknown>";
    private String address = "<Address Unknown>";
    private int nFloors = 1;

    /*
     * Building constructor
     * @param name of the building
     * @param address of the building
     * @param nFloors the number of floors in the building
     */
    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    /*get Name Accessor for building name
     * @return the building name
    */
    public String getName() {
        return this.name;
    }

    /*
     * get Address accessor for building address
     * @return the building address
     */
    public String getAddress() {
        return this.address;
    }

    /*Accessor for floors
     * @return the number of floors in teh building
     */
    public int getFloors() {
        return this.nFloors;
    }

    /*
     * modifies the toString method and 
     * @return the string that tells the name, floors and location of the building in a sentence
     */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    /* main method (for testing)
     * @param args the command line args ignored in this context
    */
    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
        System.out.println(fordHall.getAddress());
        System.out.println(fordHall.getName());

    }

}