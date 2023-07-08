package edu.wctc.yahtzee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<String> hand = new ArrayList<>();

        Random rand = new Random();
        String die1 = String.valueOf(1 + rand.nextInt(5));
        String die2 = String.valueOf(1 + rand.nextInt(5));
        String die3 = String.valueOf(1 + rand.nextInt(5));
        String die4 = String.valueOf(1 + rand.nextInt(5));
        String die5 = String.valueOf(1 + rand.nextInt(5));
        hand.add(die1);
        hand.add(die2);
        hand.add(die3);
        hand.add(die4);
        hand.add(die5);


        System.out.println(Yahtzee.rollDice(hand));



    }
}
