/* 
 * Nama File    : TestPolimorfisme.java
 * Deskripsi    : Main Class Representasi Pegawai
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Kamis, 24 April 2025
 */

package PRAKTIKUM_6.Pekerja;

import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for(Pegawai emp : emps){
            emp.tampilData();
            System.out.println();
        }
    }
}
/* Manfaat Polimorfisme pada kasus ini

 * Dalam kasus ini polimorfisme berguna untuk menyederhanakan kode,
 * khususnya di dalam ArrayList<Pegawai>, kita dapat menyimpan obek programmer,
 * manajer mauupun pegawai dalam satu list tanpa membuat list terpisah
 * 
 * Pada perulangan for(Pegawai emp : emps), kita cukup memanggil emp.tampilData(), 
 * dan java akan otomatis memanggil implementasi method sesuai dengan tipe objek sebenarnya, 
 * hal ini sangat berguna untuk mengurangi kompleksitas kode
 */

 /* Jawaban soal Nomor 3 (Permasalahan tanpa Polimorfisme)
  * Jika dalam program main kita menambahkan objek pegawai4 dan pegawai 5 tanpa polimorfisme
    masalah yang muncul adalah :
    1. Harus membuat ArrayList terpisah untuk setiap child/tipe class pegawai (manajer dan programmer), seperti
    ArrayList<Manager> managers = new ArrayList<>();
    ArrayList<Programmer> programmers = new ArrayList<>();
    2. Perlu banyak castinf dan pengecekan tipe :
    saat ingin menampilkan data semua pegawai, kita harus menggunakan pengecekan manual seperti :
    if (pegawai instanceof Manager) { ... }
    else if (pegawai instanceof Programmer) { ... } 
  */