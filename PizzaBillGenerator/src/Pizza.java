public class Pizza {

    private int price;

    private final boolean veg;

    private final int ExtraCheesePrice = 100;
    private final int ExtraToppingsPrice = 150;

    private int BackPackPrice = 20;

    private int BasePizzaPrice;

    private boolean IsExtraToppingsAdded = false;
    private boolean IsExtraCheeseAdded = false;
    private boolean IsOptedForTakeAway = false;


    public Pizza(boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        }else{
            this.price = 400;
        }
        BasePizzaPrice = this.price;

    }

    public void Addextracheese(){
        IsExtraCheeseAdded = true;
        //System.out.println("Extra cheese added");
        this.price += ExtraCheesePrice;
    }

    public void Addextratoppings(){
        IsExtraToppingsAdded = true;
        //System.out.println("Extra toppings added");
        this.price += ExtraToppingsPrice;
    }

    public void Takeaway(){
        IsOptedForTakeAway = true;
        //System.out.println("Take away added");
        this.price  += BackPackPrice;
    }

    public void getBill(){
        String bill = "";
        System.out.println("Pizza:: "+BasePizzaPrice);
        if(IsExtraCheeseAdded){
            bill += "Extra cheese added::"+ ExtraCheesePrice+ "\n";
        }
        if(IsExtraToppingsAdded){
            bill += "Extra toppings added::"+ ExtraToppingsPrice+ "\n";
        }
        if(IsOptedForTakeAway){
            bill += "Take Away::"+ BackPackPrice+ "\n";
        }
        bill += "Bill:"+this.price +"\n";
        System.out.println(bill);
    }

}
/**
 * Base pizza: 300
 * Toppings: 150
 * Cheese:100
 * Take away:20
 */
