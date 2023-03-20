//package Super_150.Recursion;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Coin_Combination {
//    public static void main(String[] args) {
//
//        int[] coin = { 2, 3, 5 };
//        int amount = 10;
//        Combination(coin, amount, "",0);
//
//    }
//
//    public static void Combination(int[] coin, int amount, List<Integer> ll, int idx) {
//        if (amount == 0) {
////            System.out.println(ans);
//            ans.add(new ArrayList<>(ll));
//
//                return ;
//        }
//        for (int i = idx; i < coin.length; i++) {
//            if (amount >= coin[i]) {
//                ll.add(coin[i]);
//                Combination(coin, amount - coin[i],ll,i,ans);
//                ll.remove(ll.size()-1);
//            }
//        }
//
//    }
//}
