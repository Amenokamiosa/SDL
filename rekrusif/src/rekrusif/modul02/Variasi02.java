package rekrusif.modul02;

public class Variasi02 {

    public static void main(String[] args) {
        count(0);
        System.out.println();
    }

    public static void count(int index) {
        if (index < 2) {
            count(index + 1);
        }
        System.out.print(index);
    }

}
