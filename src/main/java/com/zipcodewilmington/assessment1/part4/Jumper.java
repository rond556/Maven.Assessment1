package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {

        Integer numberOfKJumps = 0;
        Integer numberOf1Jumps = 0;

        numberOfKJumps = k / j;
        numberOf1Jumps = k % j;

        return numberOf1Jumps + numberOfKJumps;
    }
}
