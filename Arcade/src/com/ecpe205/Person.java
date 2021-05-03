package com.ecpe205;

public class Person {
    private int coins;

    public Person(int coins){
        this.coins = coins;

    }

    //person inserting coin to a machine
    public void insertCoin(Coinable coinable, int i) {
        //inserted coin/s
        System.out.println(i + " Coin inserted");
        coins = coins - 3;

        if (i>=3){
            System.out.println("Your change is " + (i-3) + " coins.");
        }




        if (i<3){

            System.out.println("Insufficient coins");

        }

        if (!coinable.insertCoin()) {
            //coin returned
            coins = coins + 3;
            System.out.println("Coin refunded");
        }


        System.out.println("Coin count : " + coins);
    }
}
