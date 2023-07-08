package edu.wctc.yahtzee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Yahtzee {
    public static String rollDice( List<String> hand) {
        String answer = " ";

        //grouping numbers
        Map<String, Long> matches = hand.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        long val = 1;

        // how many 1's remain after grouping matching numbers by their identity?
        long count = Collections.frequency(matches.values(), val);


        System.out.println(hand);

        if (matches.size() == 1) {
            answer = "Yahtzee";
        } else if (matches.size() == 2 && count == 1) {
            answer = "Four of a kind";
        } else if (matches.size() == 3 && count == 2) {
            answer = "Three of a kind";
        } else if (matches.size() == 2) {
            answer = "Full house";
        } else if (matches.size() == 3 && count == 1) {
            answer = "Two pair";

        } else if (matches.size() == 4 && count == 3) {
            answer = "One pair";
        } else
            return "One of a kind";

        return answer;

    }
}
