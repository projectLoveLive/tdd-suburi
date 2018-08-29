package com.sample;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CardTest{

    @Test
    void スートが設定した値であること(){
        // setup
        Card card = new Card("♠", "3");

        // execution
        // なし

        // assertion
        Assertions.assertEquals("♠", card.getSuit());
    }

}
