package reviewarray;
import java.util.Arrays;
import Evelin.Larik;
public class Sort {
    public static void main(String[] args) {
        //inisialisasi array 
        int [] data = {9,2,1,10,3};
        
        Larik.selectionSort(data);
        System.out.println("");
        Larik.cetak(data);
    }
    
}
