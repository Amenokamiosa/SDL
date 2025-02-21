package rekrusif.modul02;

public class Nomor03 {

    public static void main(String[] args) {
        
    }

    public static void upAndDown(int n) {
        System.out.print("\nLevel:" + n);
        if (n < 4) {
            upAndDown(n + 1);
        }
        System.out.print("\nLEVEL:" + n);
    }
}
