package com.ecpe205;

public class TestMachine {
public static void main (String[]args){
    GumballMachine gumballMachine = new GumballMachine();
    Person person = new Person(20);

    System.out.println( );
    System.out.println("Joaquinn's Gumball Machine");
    System.out.println( );
    System.out.println("1 gumball is worth 3 Coins");
    System.out.println( );

    person.insertCoin(gumballMachine, 6);
    person.insertCoin(gumballMachine, 5);
    person.insertCoin(gumballMachine, 3);
    person.insertCoin(gumballMachine, 4);
    person.insertCoin(gumballMachine, 3);




}

}
