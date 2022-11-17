package Super_150.String;

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.length());
        sb.append('c');
        System.out.println(sb.capacity());
        StringBuilder sb1 = new StringBuilder();
        sb.append("Bye");
        System.out.println(sb);
        System.out.println(sb.length());
        sb.append("HellocBhelo1");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append('a');
        System.out.println(sb.capacity());
        System.out.println(sb );
        sb.insert(1, "ll");
        System.out.println(sb);
        String s = sb.toString();// Builder to String
        System.out.println(sb.reverse());
        System.out.println(sb.charAt(2));
        System.out.println(sb.substring(1,3));

    }
}
