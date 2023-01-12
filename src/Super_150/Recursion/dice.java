package Super_150.Recursion;

public class dice {
    public static void main(String[] args) {
        int n=4;
       PrintPath(0,n,"");

    }
    public static void PrintPath(int src, int des, String ans){
        if(src==des){
            System.out.println(ans);
            return;
        }
        if(src>des){
            return;
        }
        // Without loop
        /*    PrintPath(src+1, des , ans+1);
              PrintPath(src+2, des , ans+2);
              PrintPath(src+3, des , ans+3);
        */

        // With loop
        for(int dice=1;dice<=3;dice++){
            PrintPath(src+dice, des , ans+dice);
        }
    }
}
