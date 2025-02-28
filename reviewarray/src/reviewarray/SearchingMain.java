
package reviewarray;
import java.util.Arrays;
import Evelin.Larik;

public class SearchingMain {

    public static void main(String[] args) {
        int [] data = {5, 8, 26, 15, 11, 31};
        int key = 26;
        int hasil = Larik.squentialSearch(data, key);
        if (hasil==-1){
            System.out.println("Data tidak ditemukan");
        }else System.out.println("Data "+key+" ditemukan di index "+hasil);
        
        Arrays.sort(data);
        int hasilBinarySearch = Larik.binarySearch(data, key);
        if (hasilBinarySearch==-1)System.out.println("Data tidak ditemukan");
        else System.out.println("Data "+key+" ditemukan di index "+hasilBinarySearch);
        
        
        int hasilInterpolasiSearch = Larik.interpolasiSearch(data, key);
        if (hasilInterpolasiSearch==-1)System.out.println("Data tidak ditemukan");
        else System.out.println("Data "+key+" ditemukan di index "+hasilInterpolasiSearch);
    }
    
    //inter search binary langkah ke tiga di ganti saja
}
