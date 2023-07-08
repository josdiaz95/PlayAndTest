package edu.wctc.yahtzee.test;
import edu.wctc.yahtzee.Yahtzee;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class YahtzeeTest {

 @Test
 void fiveOfAKind() {
     List<String> results = new ArrayList<>(Arrays.asList("2", "2", "2", "2", "2"));
     String result = Yahtzee.rollDice(results);
     assertEquals("Yahtzee", result);
 }
@Test
 void fourOfAKind(){
     List<String> results = new ArrayList<>(Arrays.asList("2","2","2","2","1"));
     String result = Yahtzee.rollDice(results);
     assertEquals("Four of a kind", result);
 }
 @Test
 void threeOfAKind(){
     List<String> results = new ArrayList<>(Arrays.asList("2","2","2","3","1"));
     String result = Yahtzee.rollDice(results);
     assertEquals("Three of a kind", result);
 } @Test
 void twoOfAPair(){
     List<String> results = new ArrayList<>(Arrays.asList("2","2","1","1","3"));
     String result = Yahtzee.rollDice(results);
     assertEquals("Two pair", result);
 }

    @Test
    void onePair(){
        List<String> results = new ArrayList<>(Arrays.asList("2","2","3","4","5"));
        String result = Yahtzee.rollDice(results);
        assertEquals("One pair", result);
    }
    @Test
    void oneOfAKind(){
        List<String> results = new ArrayList<>(Arrays.asList("1","2","3","4","5"));
        String result = Yahtzee.rollDice(results);
        assertEquals("One of a kind", result);
    }
@Test
 void fullHouse(){
     List<String> results = new ArrayList<>(Arrays.asList("2","2","2","5","5"));
     String result = Yahtzee.rollDice(results);
     assertEquals("Full house", result);
 }















}