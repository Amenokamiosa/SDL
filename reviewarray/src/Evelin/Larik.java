package Evelin;
public class Larik {
    public static void cetak(int[] x){
        for (int i = 0; i < x.length; i++) {
            if (i == x.length - 1)System.out.print(x[i]);
            else System.out.print(x[i]+", ");
        }
    }
}
