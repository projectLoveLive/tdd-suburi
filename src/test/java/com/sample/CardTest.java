package com.sample;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CardTest{

    @Nested
    @DisplayName("スートとランク")
    class SuitAndRank {

        @Test
        void スートにスペードが設定されていること() {
            // setup
            Card card = new Card("♠", "3");

            // execution
            // なし

            // assertion
            Assertions.assertEquals("♠", card.getSuit());
        }

        @Test
        void スートにハートが設定されていること() {
            // setup
            Card card = new Card("♡", "3");

            // execution

            // assertion
            Assertions.assertEquals("♡", card.getSuit());

        }

        @Test
        void ランクに3が設定されていること() {
            // setup
            Card card = new Card("♠", "3");

            // assertion
            Assertions.assertEquals("3", card.getRank());
        }

        @Test
        void ランクにJが設定されていること() {
            // setup
            Card card = new Card("♠", "J");

            // assertion
            Assertions.assertEquals("J", card.getRank());

        }
    }
    
    @Nested
    @DisplayName("文字列表記")
    class NotationTests {
        @Test
        void スペードの3から文字列表記を取得() {
            // setup
            Card card = new Card("♠", "3");

            // assertion
            Assertions.assertEquals("3♠", card.getNotation());

        }

        @Test
        void ハートのJから文字列表記を取得() {
            // setup
            Card card = new Card("♡", "J");

            // assertion
            Assertions.assertEquals("J♡", card.getNotation());

        }
    }

}
