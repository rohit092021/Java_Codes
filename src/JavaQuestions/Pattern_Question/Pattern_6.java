package JavaQuestions.Pattern_Question;

import java.util.Scanner;

public class Pattern_6 {
    public static void floyddPattern(int n) {
        int count=10;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        floyddPattern(n);
//          System.out.println(invertedPattern(n));
    }
}
