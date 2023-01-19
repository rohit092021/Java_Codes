package Super_150.Recursion;

public class lexico_graphically_counting {
    public static void main(String[] args) {
        int n=1000;
        Printcount(0,n);
    }
    public static void Printcount(int curr,int n){
        if(curr>n){
            return;
        }
        System.out.println(curr);
        int i=0;
        if(curr==0){
         i=1;
        }
        for(; i<=9;i++){
            Printcount(curr*10+i,n);
        }
    }
}
