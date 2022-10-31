/* Cafe class extends the building class but has the ingredients and methods for 
making, selling, and restocking coffee*/
public class Cafe extends Building {
    String name;
    String address;
    int nfloors;
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    /*
     * Cafe constructor makes a cafe
     * @param String name is the name of the cafe
     * @param String address where the cafe is located
     * @param int nfloors how many floors 
     * @param int nCF how many ounces of coffee the cafe starts with
     * @param int nSP number of sugar packets that the cafe starts with
     * @param int nCr number of creams the cafe starts with
     * @param int nCu number of cups the cafe starts with
     */

    public Cafe(String name, String address, int nfloors, int nCF, int nSP, int nCr, int nCu) {
        super(name, address, nfloors);
        this.nCoffeeOunces = nCF;
        this.nSugarPackets = nSP;
        this.nCreams = nCr;
        this.nCups = nCu;

        System.out.println("You have built a cafe: ☕" + name);
    }

    /*
     * sellCoffee Changes the inventory as if the coffee has been sold
     * @param int size
     * @param int nSugarPackets
     * @param int nCreams
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;

        if (this.nCoffeeOunces <= 0) {
            restock(size, 0, 0, 0);
        }

        if(this.nSugarPackets <= 0) {
            restock(0, nSugarPackets, 0, 0);
        }

        if(this.nCreams <= 0) {
            restock(0, 0, nCreams, 0);
        }

        if(this.nCups<=0){
            restock(0, 0, 0, 1);

        }
    }

    /* Restock - a private method called when the store runs out of an item & replenishes
     * @param 
    */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
    }
    
    /* main method (for testing)
     * @param args the command line args ignored in this context
    */
    public static void main(String[] args) {
        /*The compass cafe to test the methods */
        Cafe myCafe = new Cafe("Compass Cafe", "IDK part 100000", 2, 25, 25, 25, 25);
        myCafe.sellCoffee(30, 10, 15);
        System.out.println(myCafe.nCoffeeOunces);

    }
    
}
