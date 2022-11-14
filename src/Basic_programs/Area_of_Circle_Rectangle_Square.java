package Basic_programs;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Area_of_Circle_Rectangle_Square {
    public static void main(String[] args) {
        int rad,len,bre,side;
        System.out.println("enter radius");
        Scanner obj = new Scanner(System.in);
        rad=obj.nextInt();
        double area_of_c = 3.14*rad*rad;
        System.out.println("Areea of circle is ;"+area_of_c);

        System.out.println("enter len & bre of rectangle");
        len=obj.nextInt();
        bre=obj.nextInt();
        double area_of_r= len*bre;
        System.out.println("Area of rectangle is : "+area_of_r);

        System.out.println("enter side of square");
        side=obj.nextInt();
        double area_of_s= side*side;
        System.out.println("Area of square is : "+area_of_s);



    }
}
