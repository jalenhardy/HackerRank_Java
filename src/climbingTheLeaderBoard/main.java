package climbingTheLeaderBoard;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    static int [] buildRanks(int [] scores){
        int [] rawScores = scores.clone();

        int [] ranks = new int[rawScores.length];
        int rank = 1;
        int score;

        for (int i = 0; i < rawScores.length; i++){
            score = rawScores[i];
            if (i > 0 && score != rawScores[i-1]){
                rank++;
            }
            ranks[i] = rank;

        }
       return ranks;
    }
    static int findRank(int score, int [] rawScores, int [] ranks){
        int i;
        int x = 0;
        int [] scores = rawScores.clone();
        Arrays.sort(scores);
        i = Arrays.binarySearch(scores, score);
        return ranks[scores.length - i-1];
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int scores [] = new int [n + 1];
        for (int i = 0; i < n; i++){
            scores[i] = scanner.nextInt();
        }
        int levels = scanner.nextInt();
        int [] ranks = new int[n + 1];

        while (levels > 0){
            int score = scanner.nextInt();
            scores[n] = score;
            ranks = buildRanks(scores);
            System.out.println(findRank(score, scores, ranks));
            levels--;

        }

    }
}
