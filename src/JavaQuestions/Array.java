package JavaQuestions;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("enter size of array");
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();

        int arr[]=new int[size];
        System.out.println("enter elements");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("elements are");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
//        arr[3]=100;
//        System.out.print(arr[]);
    }
}
