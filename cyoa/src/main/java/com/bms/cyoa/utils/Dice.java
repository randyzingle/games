package com.bms.cyoa.utils;

import java.util.Arrays;
import java.util.Random;

public class Dice {
    
    public Random rand = new Random(System.currentTimeMillis());
    
    public int roll(int ndice, int nsides) {
    	if (ndice == 0 || nsides == 0) {
    		throw new ArithmeticException("invalid dice values");
    	}
        int total = 0;
        for (int i=0; i<ndice; i++) {
            int roll = rand.nextInt(nsides) + 1;
            total += roll;
        }
        return total;
    }
    
    /*
     * Roll totalNumDice and keep the best ndice results
     */
    public int stackedRoll(int totalNumDice, int ndice, int nsides) {
    	if (totalNumDice == 0 || ndice == 0 || nsides == 0 || totalNumDice-ndice < 0) {
    		throw new ArithmeticException("invalid dice values");
    	}
    	int[] rolls = new int[totalNumDice];
    	int total = 0;
    	for (int i=0; i<totalNumDice; i++) {
    		rolls[i] = rand.nextInt(nsides) + 1;
    	}
    	Arrays.sort(rolls);
    	for (int i=totalNumDice-1; i>=totalNumDice-ndice; i--) {
    		total += rolls[i];
    	}
    	return total;
    }

}
