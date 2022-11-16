package Super_150.String;

public class Reversed_words_in_string {
    public static void main(String[] args) {
        String s=" the sky is blue";
      //  System.out.println(s.trim());//trim delete the spaces from start and end.
    reverseWords(s);
    }
    public static String reverseWords(String s){
        s=s.trim();
        String []arr=s.split("\s+");
        String ans="";
        for(int i=arr.length-1;i>=0;i--){
           ans=ans+arr[i]+" ";
        }
        return ans;
    }
}
