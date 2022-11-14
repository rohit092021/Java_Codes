package JavaQuestions.Array_Question;
import java.util.*;
public class Creating_array {
    public static void main(String[] args) {
    int [] marks = new int [20];
    Scanner sc=new Scanner(System.in);
    marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[1]+5);
        System.out.println(marks.length);

    }
}
