package Super_150.Assignment_3;
import java.util.*;
public class Strings_Odd_Even_Character {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc =new Scanner(System.in);
        String s =  sc.next();
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                char d = (char)((int)s.charAt(i)+1);
                System.out.print(d);
            }
            else{
                char d = (char)((int)s.charAt(i)-1);
                System.out.print(d);

            }
        }
    }
}
