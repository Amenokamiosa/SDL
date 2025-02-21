package rekrusif.modul02;

public class Nomer02 {

    public static void main(String[] args) {

        int x = paijo(3);
        System.out.println(x);
    }

    public static int paijo(int x) {
        if (x == 0) {
            return 0;
        }
        return 2 * paijo(x - 1) + x * x;
    }

}
