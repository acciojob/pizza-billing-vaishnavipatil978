package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    protected boolean extraCheese = false;
    protected boolean extraTopping = false;
    protected boolean takeAway = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg==true){
            this.price = 300;
        }
        else this.price = 400;

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
            if(isVeg==true){
                price+=70;
            }
            else{
                price+=120;
            }
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

        if(extraCheese==true){
            bill+="Extra Cheese Added: 80 \n";
        }
        if(extraTopping==true){
            if(isVeg==true) {
                bill += "Extra Toppings Added: 70 \n";
            }
            else{
                bill+="Extra Toppings Added: 120 \n";
            }
        }

        if(takeAway==true){
            bill+="Paperbag Added: 20 \n";
        }

        bill+="Total Price: "+price;
        // your code goes here
        return bill;
    }
}
