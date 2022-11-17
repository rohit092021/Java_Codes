package Super_150.String;

public class String_VS_StringBuilder {
    public static void main(String[] args) {


    }


    public static void StringCom() {
        String s = "";
        for (int i = 0; i < 100000; i++) {
            s = s + i;
        }
        System.out.println(s);
    }

    public static void StringBuilderCom() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }
        System.out.println(sb);
    }
}