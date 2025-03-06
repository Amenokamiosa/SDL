package Evelin;
import java.util.Arrays;
public class Larik {
    public static void cetak(int[] x){
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
    
    //Algoritma sequential search
    //Algoritma ini digunakan untuk mencari data dengan metode sequential search.
    //Masukan berupa kumpulan data dalam larik dan data yang dicari.
    //Keluaran akan menghasilkan indek data yang ditemukan atau mengembalikan nilai -1 kalau tidak ditemukan.
    //Langkah 0	: Baca data ke dalam larik
    //Langkah 1	: Baca data yang dicari ke dalam variabel kunci
    public static int squentialSearch(int[]larik, int kunci)
    {
    //Langkah 2	: Untuk counter = 0 sampai N-1 lakukan langkah 3
        for (int counter = 0; counter <= larik.length - 1; counter++) {
    //Langkah 3	: Test apakah kunci == larik[counter]
            if (kunci==larik[counter]){
    //Jika ya, kembalikan nilai counter
                return counter;
            }
    //Langkah 4	: Kembalikan nilai -1 untuk menunjukan data tidak ditemukan.
        }
        return -1;
    }
    
    //Algoritma binary search
    //Algoritma ini digunakan untuk mencari data dengan metode binary search.
    //Masukan berupa kumpulan data dalam larik yang sudah dalam keadaan urut serta data yang dicari.
    //Keluaran akan menghasilkan indek data yang ditemukan atau mengembalikan nilai -1 kalau tidak ditemukan. 




 

    //Langkah 5:Harus ditentukan apakah pencarian selanjutnya akan dilakukan di larik bagian kiri atau di bagian kanan. Test larik[indekTengah] > X, 
    //Jika ya pencarian selanjutnya dilakukan di larik bagian kiri,  buat indekAkhir=indekTengah-1. 
    //Jika tidak pencarian selanjutnya dilakukan pada larik bagian kanan, buat indekAwal=indekTengah+1.
    //Langkah 6: Kembalikan nilai -1 untuk menunjukkan data tidak ditemukan.
    
    //Langkah 0: Baca data ke dalam larik dalam keadaan urut, indekAwal diisi indek data pertama dan indekAkhir diisi indek data terakhir 
    //Langkah 1: Baca data yang dicari ke dalam variabel kunci
public static int binarySearch (int[] larik, int kunci){
    int indexAwal = 0;
    int indexAkhir = larik.length-1;
    int indexTengah;

    //Langkah 2: Selama (indekAwal <= indekAkhir) lakukan langkah: 3, 4, 5    
    while(indexAwal<=indexAkhir){
    //Langkah 3: Carilah elemen tengah. Elemen tengah adalah elemen dengan indekTengah = (indekAwal+indekAkhir) /2.
    //(Elemen tengah, larik[indekTengah], membagi larik menjadi dua bagian, yaitu bagian kiri larik[indekAwal .. indekTengah-1] dan bagian kanan larik[indekTengah+1 .. indekAkhir]).
        indexTengah=(indexAwal+indexAkhir)/2;
    //Langkah 4:Test apakah larik[indekTengah] = X. 
    //Jika ya, pencarian dihentikan sebab X sudah ditemukan dan kembalikan nilai indekTengah.    
        if (larik[indexTengah]==kunci)return indexTengah;
    //Jika tidak, lanjutkan  ke langkah 5.
        else if(larik[indexTengah]>kunci)indexAkhir=indexTengah-1;
        else indexAwal=indexTengah+1;
    }
    return -1;
}

    //Algoritma binary search
    //Algoritma ini digunakan untuk mencari data dengan metode binary search.
    //Masukan berupa kumpulan data dalam larik yang sudah dalam keadaan urut serta data yang dicari.
    //Keluaran akan menghasilkan indek data yang ditemukan atau mengembalikan nilai -1 kalau tidak ditemukan. 
    //Langkah 0: Baca data ke dalam larik dalam keadaan urut, indekAwal diisi indek data pertama dan indekAkhir diisi indek data terakhir 
    //Langkah 1: Baca data yang dicari ke dalam variabel kunci
    //Langkah 2: Selama (indekAwal <= indekAkhir) lakukan langkah: 3, 4, 5 
    //Langkah 3: Carilah elemen tengah. Elemen tengah adalah elemen dengan mid = low + ((toFind - sortedArray[low]) * (high - low)) /
    //(sortedArray[high] - sortedArray[low]); 
    //(Elemen tengah, larik[indekTengah], membagi larik menjadi dua bagian, yaitu bagian kiri larik[indekAwal .. indekTengah-1] dan bagian kanan larik[indekTengah+1 .. indekAkhir]).
    //Langkah 4:Test apakah larik[indekTengah] = X. 
    //Jika ya, pencarian dihentikan sebab X sudah ditemukan dan kembalikan nilai indekTengah. 
    //Jika tidak, lanjutkan  ke langkah 5.
    //Langkah 5:Harus ditentukan apakah pencarian selanjutnya akan dilakukan di larik bagian kiri atau di bagian kanan. Test larik[indekTengah] > X, 
    //Jika ya pencarian selanjutnya dilakukan di larik bagian kiri,  buat indekAkhir=indekTengah-1. 
    //Jika tidak pencarian selanjutnya dilakukan pada larik bagian kanan, buat indekAwal=indekTengah+1.
    //Langkah 6: Kembalikan nilai -1 untuk menunjukkan data tidak ditemukan.

public static int interpolasiSearch (int[] larik, int kunci){
    int indexAwal = 0;
    int indexAkhir = larik.length-1;
    int indexTengah;
    
    while(indexAwal<=indexAkhir){
        indexTengah = indexAwal + ((kunci - larik[indexAwal]) * (indexAkhir - indexAwal)) / (larik[indexAkhir]-larik[indexAwal]);
        if (larik[indexTengah]==kunci)return indexTengah;
        else if(larik[indexTengah]>kunci)indexAkhir=indexTengah-1;
        else indexAwal=indexTengah+1;
    }
    return -1;
}

}
