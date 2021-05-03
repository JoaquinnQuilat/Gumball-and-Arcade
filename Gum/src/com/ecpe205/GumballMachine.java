package com.ecpe205;

public class GumballMachine implements Coinable, Dispensable{

    int gums;


    public GumballMachine(){

        this.gums = 5;

    }

    @Override

    public boolean insertCoin() {
        //TODO Auto-generated method stub
        //processing of coins

        if (this.gums > 0) {
        this.dispense();
        //return true if dispense is valid

            return true;
        }

        System.out.println("Return Coin");
        return false;
    }

    @Override

    public void dispense(){
        //TODO Auto-generated method stub

            this.gums--;
            if (this.gums != 0) {
                System.out.println("Gum dispensed.");

            }

    System.out.println( gums + " Gum left");
    }

    @Override

    public void reload(int count) {
        //TODO Auto-generated method stub
        //this.gums++;

        this.gums+= count;


    }


}
