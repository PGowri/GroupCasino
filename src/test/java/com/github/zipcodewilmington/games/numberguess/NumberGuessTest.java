package com.github.zipcodewilmington.games.numberguess;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.games.numberguess.NumberGuessGame;
import com.github.zipcodewilmington.casino.games.numberguess.NumberGuessPlayer;
import org.junit.Assert;
import org.junit.Test;

public class NumberGuessTest {

    @Test
    public void testToss() {
        int numberOfDice = 2;
        NumberGuessGame numberGuessGame = new NumberGuessGame();
        Integer[] actual = numberGuessGame.toss();
        Assert.assertEquals(2, actual.length);
        Assert.assertTrue(actual[0]>=1 && actual[0]<=6);
        Assert.assertTrue(actual[1]>=1 && actual[1]<=6);
    }

    @Test
    public void testSum() {
        NumberGuessGame numberGuessGame = new NumberGuessGame();
        Integer[] num1 = {3,5};
        Assert.assertEquals(8,numberGuessGame.sum(num1));
    }

    @Test
    public void testAddPlayer(){
        NumberGuessGame numberGuessGame = new NumberGuessGame();
        CasinoAccount casinoAccount = new CasinoAccount("User Name", "Password");
        NumberGuessPlayer numberGuessPlayer = new NumberGuessPlayer(casinoAccount);
        Assert.assertTrue(numberGuessGame.add(numberGuessPlayer));

    }
    @Test
    public void testQuit(){
        NumberGuessGame numberGuessGame = new NumberGuessGame();
        Assert.assertFalse(numberGuessGame.quit());
    }
    @Test
    public void testRemove(){
        NumberGuessGame numberGuessGame = new NumberGuessGame();
        CasinoAccount casinoAccount = new CasinoAccount("User Name", "Password");
        NumberGuessPlayer numberGuessPlayer = new NumberGuessPlayer(casinoAccount);
        Assert.assertFalse(numberGuessGame.remove(numberGuessPlayer));
    }
}

