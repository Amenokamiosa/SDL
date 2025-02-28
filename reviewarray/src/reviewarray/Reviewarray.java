package reviewarray;
public class Reviewarray {
    public static void main(String[] args) {
        int r[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        
        for (int i = 0; i < r.length; i++) {
            if (i == r.length - 1)System.out.print(r[i]);
            else System.out.print(r[i]+", ");
        }
    }
    
}
