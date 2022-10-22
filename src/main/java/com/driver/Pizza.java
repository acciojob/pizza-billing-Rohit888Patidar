package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int addExtraCheesePrice;
    private int addExtraToppingPrice;
    private int takeAwayPrice;
    private int total;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg == true)
        {
            price = 300;
            total = price;
        }
        else {
            price = 400;
            total = price;
        }
    }

    public int getPrice(){
        return this.total;
    }

    public void addExtraCheese(){
        // your code goes here
        addExtraCheesePrice += 80;
        total += addExtraCheesePrice;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg==true)
        {
            addExtraToppingPrice += 70;
            total += addExtraToppingPrice;
        }
        else {
            addExtraToppingPrice += 120;
            total += addExtraToppingPrice;
        }

    }

    public void addTakeaway(){
        // your code goes here
         takeAwayPrice += 20;
         total += takeAwayPrice;
    }

    public String getBill(){
        // your code goes here
        bill = "Base Price Of The Pizza: "+price+"\n"+"Extra Cheese Added: "+addExtraCheesePrice+"\n"
                + "Extra Toppings Added: "+addExtraToppingPrice+"\n"
                + "Paperbag Added: "+takeAwayPrice+"\n"
                + "Total Price: "+total+"\n";
        return this.bill;
    }
}
