package com.company;

import java.util.Arrays;

public class ScoreCalculator {
    public static void calculate(int[] scoreSet1, int[] scoreSet2){
        int player1WinTally =0;
        int player2WinTally =0;
        int[] finalWinTally = new int[2];
        int rounds = scoreSet1.length;
        for (int currentRound = 0; currentRound < rounds; currentRound++) {
            if(scoreSet1[currentRound] > scoreSet2[currentRound]) {
                player1WinTally++;
            } else if (scoreSet1[currentRound] < scoreSet2[currentRound]) {
                player2WinTally++;
            }
        }
        if (player1WinTally > player2WinTally) {
            finalWinTally[0] = player2WinTally;
            finalWinTally[1] = player1WinTally;
        } else  {
            finalWinTally[0] = player1WinTally;
            finalWinTally[1] = player2WinTally;
        }
        System.out.println(Arrays.toString(finalWinTally));
    }
}
