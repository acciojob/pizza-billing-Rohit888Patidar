package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isCheeseAdded;
    private int addExtraCheesePrice;
    private int addExtraToppingPrice;
    private int addTakeAwayPrice;
    private boolean isToppingAdded;
    private boolean isTakeAwayAdded;




    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isCheeseAdded = false;
        this.isToppingAdded = false;
        this.isTakeAwayAdded = false;
        this.addExtraCheesePrice = 80;
        this.addTakeAwayPrice = 20;
        // your code goes here
        if(this.isVeg==true)
        {
            price = 300;
            this.addExtraToppingPrice = 70;
        }
        else {
            price = 400;
            this.addExtraToppingPrice = 120;
        }
        this.bill = "Base Price Of The Pizza: "+price+"\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(this.isCheeseAdded==false)
        {
            this.price += addExtraCheesePrice;
            isCheeseAdded = true;
        }


    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAdded==false)
        {
            price += addExtraToppingPrice;
            isToppingAdded = true;
        }


    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAwayAdded == false)
        {
            price += addTakeAwayPrice;
            isTakeAwayAdded = true;
        }


    }

    public String getBill(){
        // your code goes here
        bill += "Extra Cheese Added: "+addExtraCheesePrice+"\n"
            +"Extra Toppings Added: "+addExtraToppingPrice+"\n"
            +"Paperbag Added: "+addTakeAwayPrice+"\n" +
                "Total Price: "+price+"\n";
        return this.bill;
    }
}
