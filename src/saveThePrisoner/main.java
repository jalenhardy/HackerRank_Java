package saveThePrisoner;

import java.util.Scanner;

public class main {

    static int result(int prisoners, int candy, int starting){
        int poisonedPrisoner;
        if (candy > prisoners) {
            int leftOver = candy % prisoners;
            poisonedPrisoner = (starting - 1) + leftOver;
            if (poisonedPrisoner == 0) {
                poisonedPrisoner = prisoners;
            }
        }
        else{
            poisonedPrisoner = (starting - 1) + candy;
        }
        if (poisonedPrisoner > prisoners){
            poisonedPrisoner = poisonedPrisoner - prisoners;
        }
        return poisonedPrisoner;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for(int i = 0; i < testCases; i++){
            int numPrisoners = scanner.nextInt();
            int numCandy = scanner.nextInt();
            int S = scanner.nextInt();
            System.out.println(result(numPrisoners, numCandy, S));

        }

    }

}
