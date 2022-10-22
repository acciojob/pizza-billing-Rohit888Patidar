package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int addExtraCheesePrice;
    private int addExtraToppingPrice;
    private int takeAwayPrice;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg == true)
        {
            price = 300;
        }
        else {
            price = 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        addExtraCheesePrice += 80;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg==true)
        {
            addExtraToppingPrice += 70;
        }
        else {
            addExtraToppingPrice += 120;
        }

    }

    public void addTakeaway(){
        // your code goes here
         takeAwayPrice += 20;
    }

    public String getBill(){
        // your code goes here
        int total = price+addExtraCheesePrice+addExtraToppingPrice+takeAwayPrice;
        bill = "Base Price Of The Pizza: "+price+"\n"+"Extra Cheese Added: "+addExtraCheesePrice+"\n"
                + "Extra Toppings Added: "+addExtraToppingPrice+"\n"
                + "Paperbag Added: "+takeAwayPrice+"\n"
                + "Total Price: "+total;
        return this.bill;
    }
}
