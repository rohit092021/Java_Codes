package JavaQuestions;
import java.util.*;
public class CostOfItem {
    public static void main(String[] args) {
        System.out.println("enter cost of pencil, pen, eraser respectively");
        Scanner sc = new Scanner(System.in);
        // without GST
        float pencil= sc.nextFloat();
        float pen= sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil+pen+eraser;
        System.out.println("BIll without GST is "+total);

        // WITH GST
        float GST = (total*18)/100;
        System.out.println("GST is "+GST);
        float without_GST = total+GST;
        System.out.println("WIth GST IS "+without_GST);
    }
}
