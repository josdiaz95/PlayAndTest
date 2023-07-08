package edu.wctc.romannumeral.test;
import org.junit.jupiter.api.Test;
import static edu.wctc.romannumerals.romanNumerals.intToRoman;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class romanNumeralsTest {

    @Test
    void one() {
        assertEquals("I", intToRoman(1));
    }
    @Test
    void two() {
        assertEquals("II", intToRoman(2));
    }


    @Test
    void four() {
        assertEquals("IV", intToRoman(4));
    }


    @Test
    void twentyTwentyThree() {
        assertEquals("MMXXIII", intToRoman(2023));
    }
}
