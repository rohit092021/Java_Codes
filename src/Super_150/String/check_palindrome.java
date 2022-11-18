package Super_150.String;

import java.util.Scanner;

public class check_palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(IsPalindrome(s));


    }
    public static boolean IsPalindrome(String s){
        int len=s.length();
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i) !=s.charAt(len-1-i)){
                return false;
            }

        }
        return true;

    }
}
