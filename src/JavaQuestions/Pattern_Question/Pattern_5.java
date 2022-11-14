package JavaQuestions.Pattern_Question;

import java.util.Scanner;

public class Pattern_5 {
    public static void invertedPattern(int n) {
        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("1");
//            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
          invertedPattern(5);
//          System.out.println(invertedPattern(5));
    }
}