/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diceVAR;

import java.util.Random;

/**
 *
 * @author Enrico
 */
public class DiceVariable {

    public static int randomNumber;

    public static int getRandomNumber() {
        Random rn = new Random();

        int diceRandom = rn.nextInt(6) + 1;
        randomNumber = diceRandom;
        return randomNumber;
    }

}
