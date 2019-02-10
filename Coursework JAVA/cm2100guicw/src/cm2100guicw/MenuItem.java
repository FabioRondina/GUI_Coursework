package cm2100guicw;

import java.util.Comparator;

/**
 * class encapsulating properties and methods of Menu Items  
 * used in CM2100 GUI Coding Coursework
 * @author david
 */
public abstract class MenuItem implements Comparable<MenuItem>{
    
    private int unitCost;
    private String name;
    
    private String imageFileName;
    
    private static String imageFileDirectory = "src/images/";
    
    public MenuItem(String name, int cost) {
        this.name = name;
        this.unitCost = cost;
        this.imageFileName = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    
    
    public int getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(int d) {
        this.unitCost = d;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    public static String getImageFileDirectory() {
        return imageFileDirectory;
    }

    public static void setImageFileDirectory(String imageFileDirectory) {
        MenuItem.imageFileDirectory = imageFileDirectory;
    }
      
    @Override
    public String toString() {
        return  this.getName() 
                + ": Price: " + price() + "p";
    }
    
    public abstract int price();
    
    /* compareTo method comparing by MenuItem name to make class Comparable */
    @Override public int compareTo(MenuItem o) {
        return this.getName().compareTo(o.getName());
    }
    
    /* Comparator class for comparing MenuItem by unitCost */
    public static class UnitCostComparator implements Comparator<MenuItem>{
        public int compare(MenuItem m1, MenuItem m2) {
           return m1.getUnitCost() - m2.getUnitCost();
        }
    }
    
/* Comparator class for comparing MenuItem by price */    
    public static class PriceComparator implements Comparator<MenuItem>{
        public int compare(MenuItem m1, MenuItem m2) {
           return m1.price() - m2.price();
        }
    }
}
