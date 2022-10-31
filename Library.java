import java.util.Hashtable;
import java.util.Iterator;
import java.util.Enumeration;

/* The library class is a child of the Building class */
public class Library extends Building {
    String name;
    String address;
    int nfloors;
    private Hashtable<String, Boolean> collection;

    /*
     * Constructor for Library
     * @param String name is the name of the library
     * @param String address is the location of the library
     * @param nfloors is the number of floors in the library
     */
    public Library(String name, String address, int nfloors) {
      super(name, address, nfloors);
      System.out.println("You have built a library: 📖");
      this.collection = new Hashtable<String, Boolean>();
    }

    /*
     * addTitle adds a book to the library's hashtable and makes it available to checkout
     * @param String title is the title and author of the book that is added
     */
    public void addTitle(String title) {
        this.collection.put(title, true);
    }

    /*
     * removeTitle removes the title from the shelves (removes the key and value from the library's hashtable)
     * @param String title - title and author of the book that is being deleted from the hashtable
     */
    public String removeTitle(String title) {
      this.collection.remove(title);
      return "We removed" + title;
    }

    /*
     * checkOut changes takes a title and changes the available boolean 
     * in the hashtable value from true to false as if the book has been checked out
     * @param String title the title of the book that is being "checked out"/whose value is changing in the hashtable
     */
    public void checkOut(String title) {
      this.collection.replace(title, false);
    }

    /*
     * returnBook takes a title and changes the available boolean 
     * in the hashtable value to true as if the book has been returned
     * @param String title the title of the book that is being "returned"/whose value is changing in the hashtable
     */
    public void returnBook(String title) {
      this.collection.replace(title, true);
    }

    /*
     * containsTitle takes title and tells if the library has the book
     * @param String title the title and author of the book
     * @return a true or false whether the book is in the library
     */
    public boolean containsTitle(String title) {
      return this.collection.contains(title);
    }

    /*
     * printCollection prints the entire collection 
     * by making the keys a Set and elements an enumeration 
     * that is iterated over 
     */
    public void printCollection() {
      Iterator<String> keys = this.collection.keySet().iterator();
      Enumeration<Boolean> values = this.collection.elements();

      while(keys.hasNext()) {
        System.out.print(keys.next());
        if (values.nextElement() == true) {
            System.out.println(" is in stock");
        } 
        else {
          System.out.println(" is not in stock");
        }
      }
      }

    
    /*
     * Main method for testing
     * @param args the command line args ignored in this context
     */
    public static void main(String[] args) {
      /*Neilson library created as myLibrary to test library methods */
      Library myLibrary = new Library("Neilson", "IDK Chapin way", 4);
      myLibrary.addTitle("Cat in the hat by Doctor Seuss");
      myLibrary.addTitle("Dog with a blog by Jenny Dust");
      myLibrary.checkOut("Cat in the hat by Doctor Seuss");
      myLibrary.printCollection();
    }
  
  }