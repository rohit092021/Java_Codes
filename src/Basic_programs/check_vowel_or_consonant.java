package Basic_programs;
import java.util.*;
public class check_vowel_or_consonant {
    public static void main(String[] args) {
        System.out.println("enter character");
        char a;
        Scanner obj = new Scanner(System.in);
        a=obj.next().charAt(0);
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
        {
            System.out.println("vowel");
        }
        else
            System.out.println("consonant");
    }
}
