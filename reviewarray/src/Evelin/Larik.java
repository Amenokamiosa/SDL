package Evelin;
import java.util.Arrays;
public class Larik {
    //Membaca Array
    public static void cetak(int[] x){
    //Melakukan perulangan sebanyak panjang array kali
        for (int i = 0; i < x.length; i++) {
    //Mencetak isi data array selama perulangan
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
    //Langkah 5:Harus ditentukan apakah pencarian selanjutnya akan dilakukan di larik bagian kiri atau di bagian kanan. Test larik[indekTengah] > X,
    //Jika ya pencarian selanjutnya dilakukan di larik bagian kiri,  buat indekAkhir=indekTengah-1. 
        else if(larik[indexTengah]>kunci)indexAkhir=indexTengah-1;
    //Jika tidak pencarian selanjutnya dilakukan pada larik bagian kanan, buat indekAwal=indekTengah+1.
        else indexAwal=indexTengah+1;
    }
    //Langkah 6: Kembalikan nilai -1 untuk menunjukkan data tidak ditemukan.
    return -1;
}

    //Pencarian interpolasi mencoba memperbaiki pencarian bagi dua atau pencarian biner (binary
    //search) dengan tidak membagi dua yang hampir sama ukurannya, tetapi dengan
    //memperkirakan letak data yang dicari. 
    //Langkah 0: Baca data ke dalam larik dalam keadaan urut, indekAwal diisi indek data pertama dan indekAkhir diisi indek data terakhir 
    //Langkah 1: Baca data yang dicari ke dalam variabel kunci
public static int interpolasiSearch (int[] larik, int kunci){
    int indexAwal = 0;
    int indexAkhir = larik.length-1;
    int indexTengah;
    //Langkah 2: Selama (indekAwal <= indekAkhir) lakukan langkah: 3, 4, 5    
    while(indexAwal<=indexAkhir){
    //Mid (tengah) dicari dengan cara interpolasi
    // mid = low + ((toFind - sortedArray[low]) * (high - low)) /
    // (sortedArray[high] - sortedArray[low]); 
        indexTengah = indexAwal + ((kunci - larik[indexAwal]) * (indexAkhir - indexAwal)) / (larik[indexAkhir]-larik[indexAwal]);
    //Langkah 4:Test apakah larik[indekTengah] = X. 
    //Jika ya, pencarian dihentikan sebab X sudah ditemukan dan kembalikan nilai indekTengah.        
        if (larik[indexTengah]==kunci)return indexTengah;
    //Jika tidak, lanjutkan  ke langkah 5.
    //Langkah 5:Harus ditentukan apakah pencarian selanjutnya akan dilakukan di larik bagian kiri atau di bagian kanan. Test larik[indekTengah] > X, 
    //Jika ya pencarian selanjutnya dilakukan di larik bagian kiri,  buat indekAkhir=indekTengah-1. 
        else if(larik[indexTengah]>kunci)indexAkhir=indexTengah-1;
    //Jika tidak pencarian selanjutnya dilakukan pada larik bagian kanan, buat indekAwal=indekTengah+1.
        else indexAwal=indexTengah+1;
    }
    //Langkah 6: Kembalikan nilai -1 untuk menunjukkan data tidak ditemukan.
    return -1;
}
    //Algoritma buble sort
    //Algoritma ini digunakan untuk mengurutkan data dengan metode bubble sort.
    //Masukan berupa kumpulan data dalam larik.
    //Keluaran akan menghasilkan kumpulan data dalam larik yang sudah dalam keadaan urut.
    //Langkah 0	: Baca data ke dalam larik 
public static void bubleSort(int[]larik){
    //Langkah 1	: Untuk iterasi = 1 sampai N-1 lakukan langkah 2 
    for (int iterasi = 1; iterasi <= larik.length-1; iterasi++) {
    //Langkah 2	: Untuk elemen = 0 sampai N-1-iterasi lakukan langkah 3
        for (int elemen = 0; elemen <= larik.length-1-iterasi; elemen++) {
    //Langkah 3	: Test apakah larik[elemen] > larik[elemen + 1]
            if (larik[elemen]>larik[elemen+1]){
    //Jika ya, tukarkan nilai kedua elemen ini
                int temp;
                temp = larik[elemen];
                larik[elemen]=larik[elemen+1];
                larik[elemen+1] = temp;
            }
        }
    }
}
    //Algoritma selection sort
    //Algoritma ini digunakan untuk mengurutkan data dengan metode selection sort.
    //Masukan berupa kumpulan data dalam larik.
    //Keluaran akan menghasilkan kumpulan data dalam larik yang sudah dalam keadaan urut.
    //Langkah 0	: Baca data ke dalam larik 
public static void selectionSort(int[]larik){
    //Langkah 1	: Untuk iterasi = 0 sampai N-2 lakukan langkah 2 sampai 5 
    for (int iterasi = 0; iterasi <= larik.length-2; iterasi++) {
    //Langkah 2	: Tentukan minIndex = iterasi; 
    int minIndex = iterasi;        
    //Langkah 3	: Untuk elemen = iterasi + 1 sampai N-1 lakukan langkah 4
        for (int elemen = iterasi  +1; elemen <= larik.length-1; elemen++) {
    //Langkah 4	: Test apakah larik[elemen] < larik[minIndex ]
            if (larik[elemen]<larik[minIndex]){
    //Jika ya, minIndex = elemen
    //Langkah 5	: Tukarkan nilai larik[iterasi] dengan larik[minIndex]
                minIndex = elemen;
            }
        }
        int temp;
        temp = larik[iterasi];
        larik[iterasi]=larik[minIndex];
        larik[minIndex] = temp;
    }
    
}









}
