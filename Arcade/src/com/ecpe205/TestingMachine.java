package com.ecpe205;

public class TestingMachine {
    public static void main (String[]args){
        ArcadeMachine arcadeMachine = new ArcadeMachine();
        Person person = new Person(20);

        System.out.println( );
        System.out.println("Joaquinn's Arcade");
        System.out.println( );
        System.out.println("1 game is worth 3 Coins");
        System.out.println( );

        person.insertCoin(arcadeMachine, 5);
        person.insertCoin(arcadeMachine, 5);
        person.insertCoin(arcadeMachine, 3);
        person.insertCoin(arcadeMachine, 4);
        person.insertCoin(arcadeMachine, 3);
        person.insertCoin(arcadeMachine, 3);



    }

}
