package JavaQuestions.Pattern_Question;

import java.util.Scanner;

public class Pattern_8 {
    public static void butterfly_Pattern(int n) {
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            for (int j=1;j<=2*(n-1);j++) {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=n;i>=1;i--) {
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            for (int j=1;j<=2*(n-1);j++) {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }



    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        butterfly_Pattern(n);
//          System.out.println(invertedPattern(n));
    }
}
