//  Finish the following code so that it prints You have a fever if your temperature is above 100 and
//  otherwise prints You don't have a fever

package JavaQuestions;
import java.util.*;
public class Temperature_check {
    public static void main(String[] args) {
       double tem = 103.5;
       if(tem>=100)
       {
           System.out.println("Fever");
       }
       else
           System.out.println("Not fever");
//       String check_fever = (tem>=100)? "You have fever":"Not fever";
    }
}
