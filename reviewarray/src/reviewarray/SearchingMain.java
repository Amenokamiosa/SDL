
package reviewarray;
import java.util.Arrays;
import Evelin.Larik;

public class SearchingMain {

    public static void main(String[] args) {
    //inisialisasi array 
        int [] data = {5, 8, 26, 15, 11, 31};
    //inisialisasi variabel key dengan data yang akan dicari
        int key = 8;
    //Menyimpan hasil pencarian algoritma squential Search pada variabel hasil
        int hasil = Larik.squentialSearch(data, key);
    //Memeriksa apakah hasil pencarian sama dengan -1 
        if (hasil==-1){
    //Jika ya maka mencetak "Data tidak ditemukan"
            System.out.println("Data tidak ditemukan");
    //Jika tidak maka mencetak data yang dicari dan juga hasil pencarian
        }else System.out.println("Data "+key+" ditemukan di index "+hasil);
    
    //Mengurutkan data dalam array    
        Arrays.sort(data);
    //Menyimpan hasil pencarian Algoritma Binary Search pada variabel hasilBinarySearch
        int hasilBinarySearch = Larik.binarySearch(data, key);
    //Memeriksa apakah hasil pencarian sama dengan -1, jika ya maka mencetak "Data tidak ditemukan"
        if (hasilBinarySearch==-1)System.out.println("Data tidak ditemukan");
    //Jika tidak maka mencetak data yang dicari dan juga hasil pencarian
        else System.out.println("Data "+key+" ditemukan di index "+hasilBinarySearch);
        
    //Menyimpan hasil pencarian Algoritma Binary Search pada variabel hasilBinarySearch        
        int hasilInterpolasiSearch = Larik.interpolasiSearch(data, key);
    //Memeriksa apakah hasil pencarian sama dengan -1, jika ya maka mencetak "Data tidak ditemukan"
        if (hasilInterpolasiSearch==-1)System.out.println("Data tidak ditemukan");
    //Jika tidak maka mencetak data yang dicari dan juga hasil pencarian
        else System.out.println("Data "+key+" ditemukan di index "+hasilInterpolasiSearch);
    }
    
    //inter search binary langkah ke tiga di ganti saja
}
