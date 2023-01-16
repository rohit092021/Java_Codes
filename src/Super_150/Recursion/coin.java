package Super_150.Recursion;
public class coin {
    public static void main(String[] args) {
        int n=4;
        print(n,"");
        System.out.println(count);
    }
    static int count=0;
    public static void print(int n, String ans){
        if(n==0){
            System.out.println(ans+" ");
            count++;
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1) !='H'){
            print(n-1,ans+"H");
        }
        print(n-1,ans+"T");
    }
}
