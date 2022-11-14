package JavaQuestions.Function_question;

public class check_prime {
    public static boolean isPrime(int n){
        if(n==2)
        {
            return true;
        }
        boolean isPrime=true;
        for(int i=2;i<=n-1;i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
            return true;
        }

    public static void main(String[] args) {
        System.out.println(isPrime(2));

    }
}
