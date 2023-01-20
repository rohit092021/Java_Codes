package Super_150.Recursion;

public class length_of_string {
    public static void main(String[] args) {
        String s="rohit";
        System.out.println(Length(s));
    }
    public static int Length(String s){
        if(s.length()==0){
            return 0;
        }
        return Length(s.substring(1))+1;

    }
}
