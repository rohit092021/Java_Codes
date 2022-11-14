//package CLASSES_150.String;
//
//import java.util.Scanner;
//
//public class longest_good_Substring {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s = sc.next();
//        System.out.println(Good_Substring(s));
//
//    }
//    public static boolean Good_Substring(String s){
//int count=0;
//int res=0;
//for(int i=0;i<s.length(); i++){
//    if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u' ){
//        count++;
//    }
//    if(count>res)
//        res=count;
//    }
//else
//    count=0;
//    }
//    return res;
//}
