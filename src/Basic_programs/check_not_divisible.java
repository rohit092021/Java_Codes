package Basic_programs;

public class check_not_divisible {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=140;i++){
            if(i%2!=0 && i%5!=0 && i%7!=0 ){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
