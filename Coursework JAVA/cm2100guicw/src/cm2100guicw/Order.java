package cm2100guicw;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

/**
 * class encapsulating properties and methods of Order  
 * used in CM2100 GUI Coding Coursework
 * @author david
 */
public class Order {
    
    private final String customer;
    private final int orderID;
    private static int nextOrderID = 1;
    private ArrayList<MenuItem> items;

    public Order(String name) {
        this.customer = name;
        this.orderID = nextOrderID++;
        items = new ArrayList<>();
    }

    public String getCustomer() {
        return customer;
    }

    public int getOrderID() {
        return orderID;
    }

    public static int getNextOrderID() {
        return nextOrderID;
    }
    
    public static void resetOrderNumber(){
        nextOrderID = 1;
    }
    
     /* A getNumberOfItemsInOrder method */
    public int getNumberItemsInOrder(){
        return items.size();
    }
    
    /* a method called getItems that will return the items ArrayList */  
    public ArrayList<MenuItem> getItems(){
        return items;
    }
    
    /* a method called addMenuItem that will add a MenuItem object (passed
     * as a parameter to the method) to the items ArrayList */
    public void addMenuItem(MenuItem item){
        items.add(item);
    }
    
    /* Include a method that calculates and returns an int equal to the
     * total price (in pence) of all the MenuItem items in the items list */
    public int getOrderTotal(){
        int total = 0;
        for(MenuItem m: items){
            total += m.price();
        }
        return total;
    }
        
    @Override
    public String toString() {
        return customer + " Order Number = " + "Order=" + items;
    }
    
    /* a method which will sort the items objects depending on their name */ 
    public void sortItemsByName(){
        Collections.sort(items);
    }
    
    /* a method which will sort the items objects depending on their price */ 
    public void sortItemsByPrice(){
        Collections.sort(items);
    }
    
    /* a method to save the details of the MenuItem items in comma separated 
     * text file to a File object that is passed to the method as a File parameter */
    /* Not needed in CM2100 GUI Coursework Requirements, replaced by Similar 
     * function in the Menu.java class */
//    public void saveToFile(File f){
//        try {
//            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
//            for (MenuItem m: items){
//                String line = "";
//                if (m instanceof Sandwich){
//                    line += "SANDWICH," 
//                            + m.getName() + "," 
//                            + m.getUnitCost() + "," 
//                            + ((Sandwich) m).getBreadType() + "," 
//                            + ((Sandwich) m).getFilling();
//                } else if (m instanceof Side){
//                    line += "SIDE,"  
//                            + m.getName() + "," 
//                            + m.getUnitCost() + "," 
//                            + ((Side) m).getSauce();
//                } else if (m instanceof Drink){
//                    line += "DRINK," 
//                            + m.getName() + "," 
//                            + m.getUnitCost() + "," 
//                            + ((Drink) m).hasAlcohol();
//                } 
//                bw.write(line);
//                bw.newLine();
//            }
//            bw.flush();
//            bw.close();
//        } catch (Exception ex) {}
//    }
    
}
