// package PRAKTIKUM 3;
/*
* Nama file    : Asersi2.java
* Deskripsi    : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran bernilai nol
* Pembuat      : Shakila Tungga Dewi/24060123120025
* Tanggal      : 6 Maret 2025
*/

// class Lingkaran
class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
    
}

// class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari>0): "jari jari tidak boleh nol !!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = "+kelilingLingkaran);

    }
}

/* 
 * Konsep Asersi pada program di atas kurang tepat karena, penggunaan dan penempatan asersi di dalam program
 * 1. Penempatan asersi tidak tepat karena berada di bawah variabel yang diinisialisasi 0, karena nilai jariJari selalu 0, 
 *    maka asersi akan selalu gagal.
 *    Lebih baik lagi, validasi nilai valid seharusnya diletakkan di konstruktor lingkaran, sehingga tidak perlu 
 *    menempatkan asersi setiap pemanggilan class 
 * 2. Mekanisme validasi tidak tepat
 *    asersi pada dasarnya tidak digunakan untuk validasi input atau parameter,asersi lebih tepat digunakan untuk mendeteksi kesalahan
 *    logika program atau hal-hal yang seharusnya tidak terjadi dalam program.Untuk validasi input lebih baik menggunakan pengecekan kondisional (if-else)
 */