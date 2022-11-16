package Super_150.String;

public class Sub_string {
    public static void main(String[] args) {
        String s="hello";
        System.out.println(s.substring(3));
        SubString(s);

    }
    public static void SubString(String s){
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
}
