package Super_150.Recursion;

public class wrapper_demo {
    public static void main(String[] args) {
        Integer a=10;
        int a1=10;
        System.out.println(a);
        System.out.println(a1);
        a=a1;// primitive--> non prim AutoBoxing
        int b=-6;
        Integer b1=-9009;// Non primitive--> prim OnBoxing
        Integer c1=10;
        Integer c2=10;
        Integer c3=129;
        Integer c4=129;
        System.out.println(c1==c2);
        System.out.println(c3==c4);
    }
}
