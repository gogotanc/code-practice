import java.util.*;

public class Bogo {
    
    public static Random random = new Random();
    public static int num = 0;

    public static void main(String[] args) {
        int[] a = {3,5,7,2,8,4};
        bogoSort(a);
        pritArray(a);
        System.out.println("排序的次数为：" + num);
    }

    public static void bogoSort(int[] n) {
        while(!inOrder(n)){
            pritArray(n);
            shuffle(n);
            num++;
        }
    }

    public static void shuffle(int[] n) {
        for (int i = 0; i < n.length; i++) {
            int swapPosition = random.nextInt(i + 1);
            int temp = n[i];
            n[i] = n[swapPosition];
            n[swapPosition] = temp;
        }
    }

    public static boolean inOrder(int[] n) {
        for (int i = 0; i < n.length-1; i++) {
            if (n[i] > n[i+1]) return false;
        }
        return true;
    }

    public static void pritArray(int[] n) {
        for(int a=0; a<n.length; a++) {
            if(a == n.length-1)
            {
                System.out.print(n[a] + ".");
                break;
            }    
            System.out.print(n[a] + ",");
        }
        System.out.println();
    }

}