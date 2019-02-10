package cm2100guicw1707082;

/**
 * class encapsulating properties and methods of Sides  
 * used in CM2100 GUI Coding Coursework
 * @author david
 */
public class Side extends MenuItem{
    
    private String sauce;
    private static int SAUCECOST = 50;
    
    public Side(String name, int cost, String sauce) {
        super(name, cost);
        this.sauce = sauce;
    }
    
    public Side(String name, int cost) {
        super(name, cost);
        this.sauce = "no sauce";
    }

    public String getSauce() {
        return sauce;
    }

    /**
     * @return the SAUCECOST
     * Side.java, edited/created by Fabio Rondina 1707082
     *Coursework Part 16 – due 14 January 2019 
     */
    public static int getSAUCECOST() {
        return SAUCECOST;
    }

    public void setSauce(String s) {
        this.sauce = s;
    }
    
    @Override
    public int price() {
        if(sauce.equals("no sauce")) return this.getUnitCost();
        else return this.getUnitCost() + getSAUCECOST();
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += " with " + sauce;
        return str;
    }

    public static void main(String[] args) {
        Side s1 = new Side("Chips", 150);
        System.out.println(s1);
        Side s2 = new Side("Salad", 75, "mayo");
        System.out.println(s2);
    }
}
