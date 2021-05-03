package com.ecpe205;

public class ArcadeMachine implements Coinable, Dispensable{

    double games;


    public ArcadeMachine(){

        this.games = Double.POSITIVE_INFINITY;

    }

    @Override

    public boolean insertCoin() {
        //TODO Auto-generated method stub
        //processing of coins

        if (this.games > 0) {
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

        this.games--;

            System.out.println("Play game ---> Game over");

    }

    @Override

    public void reload(int count) {
        //TODO Auto-generated method stub
        //this.gums++;

        this.games+= count;


    }


}
