package com.driver;

public class Pizza {

    // given
    private int price;
    private Boolean isVeg;
    private String bill;

    // added later
    private int topping;
    protected boolean extraCheese = false;
    protected boolean extraTopping = false;
    protected boolean takeAway = false;
    protected boolean printed = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg==true){
            this.price = 300;
            this.topping=70;
        }
        else{
            this.price = 400;
            this.topping=120;
        }

        this.bill= "Base Price Of The Pizza: "+price+"\n";
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){

        if(extraCheese==false){
            extraCheese=true;
            price+=80;
        }
        // your code goes here
    }

    public void addExtraToppings(){

        if(extraTopping==false){
            extraTopping=true;
            price+=topping;
        }
        // your code goes here
    }

    public void addTakeaway(){

        if(takeAway==false){
            takeAway=true;
            price+=20;
        }

        // your code goes here
    }

    public String getBill(){

        if(printed==false){

            printed=true;

        if(extraCheese==true){
            bill+="Extra Cheese Added: 80\n";
        }
        if(extraTopping==true){
                bill += "Extra Toppings Added: "+topping+"\n";
        }

        if(takeAway==true){
            bill+="Paperbag Added: 20\n";
        }

        bill+="Total Price: "+price+"\n";

        }
        // your code goes here
        return bill;
    }
}
