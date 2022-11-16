package Super_150.Function;

public class Glabal_variable {
    static int var=100;  //global variable
    public static void main(String[] args) {
        System.out.println("HAY");
        int x=60;
        fun(x);
        System.out.println(var);
    }
    public static void fun(int x){
        int a = 90;
        System.out.println(x);
//        int var=50;  //Local variable
        var=150;
        System.out.println(var);
    }
}
