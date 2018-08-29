package com.sample;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CardTest{

    @Test
    void スートにスペードが設定されていること(){
        // setup
        Card card = new Card("♠", "3");

        // execution
        // なし

        // assertion
        Assertions.assertEquals("♠", card.getSuit());
    }
    @Test
    void スートにハートが設定されていること(){
        // setup
        Card card = new Card("♡", "3");

        // execution

        // assertion
        Assertions.assertEquals("♡", card.getSuit());

    }
    @Test
    void ランクに3が設定されていること(){
        // setup
        Card card = new Card("♠", "3");

        // assertion
        Assertions.assertEquals("3", card.getRank());
    }
    @Test
    void ランクにJが設定されていること(){
        // setup
        Card card = new Card("♠", "J");

        // assertion
        Assertions.assertEquals("J",card.getRank());

    }
    @Test
    void スペードの3から文字列表記を取得(){
        // setup
        Card card = new Card("♠", "3");

        // assetion
        Assertions.assertEquals("3♠", card.getNotation());

    }

}
