package cm2100guicw;

/**
 * class encapsulating properties and methods of Drinks  
 * used in CM2100 GUI Coding Coursework
 * @author david
 */
public class Drink extends MenuItem{
    
    private boolean alcohol;

    public Drink(String name, int cost, boolean alcohol) {
        super(name, cost);
        this.alcohol = alcohol;
    }

    public boolean hasAlcohol() {
        return alcohol;
    }

    public void setAlcohol(boolean alcohol) {
        this.alcohol = alcohol;
    }


    @Override
    public String toString() {
        String str = super.toString();
        
        if(alcohol) str += " [Alcohol]";
        return str;
    }
    
    public int price(){
        if(alcohol){
            return this.getUnitCost() + 100;
        }
        else return this.getUnitCost();
    }
    
    public static void main(String[] args) {
        Drink d1 = new Drink("Cola", 50, false);
        System.out.println(d1);
        Drink d2 = new Drink("Beer", 250, true);
        System.out.println(d2);
    }
    
}
