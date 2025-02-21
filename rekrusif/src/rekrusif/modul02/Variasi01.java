package rekrusif.modul02;

public class Variasi01 {

    public static void main(String[] args) {
        count(3);
        System.out.println();
    }

    public static void count(int index) {
        System.out.print(index);
        if (index < 2) {
            count(index + 1);
        }
    }
}
