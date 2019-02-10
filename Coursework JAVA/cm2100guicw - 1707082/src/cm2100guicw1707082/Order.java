package cm2100guicw1707082;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

/**
 * class encapsulating properties and methods of Order  
 * used in CM2100 GUI Coding Coursework
 * @author david
 * 
 *  /* Order.java, edited/created by Fabio Rondina 1707082
    *Coursework Part 1 - due 14 January 2019 
    * task 11 – added a formatted output to dispaly Order details on TextArea
 */
public class Order {
    
//    private final String customer;
    
    private String customer;
    private final int orderID;
    private static int nextOrderID = 0;
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

    /**
     * @param customer the customer to set
     */
    public void setCustomer(String customer) {
        this.customer = customer;
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
        
    /**
     * Edited version with basic parameter
     * @verision 1 
     * @author Fabio Rondina 1707082
     * @return String
     */
    @Override
    public String toString() {
        return customer + " Order Number = " + orderID + "Order=" + items;
    }
    
    /* Order.java, edited/created by Fabio Rondina 1707082
    *Coursework Part 111 – due 14 January 2019 */
     
    public String formattedString(){
        String str = "Customer name is : " + this.getCustomer() + "\n" ;
                str += "Order Number is : " + this.getOrderID() + "\n";
                for (MenuItem m : this.getItems()){
                    str += m.toString() + "\n";
                }
                str +="-------------------------------------------\n";
                str += "Total cost is : " + this.getOrderTotal()/100
                        + "." + this.getOrderTotal()%100 + " £ ";
        
        return str;
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
