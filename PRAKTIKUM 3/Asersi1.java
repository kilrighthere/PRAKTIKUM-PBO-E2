// package PRAKTIKUM 3;

/* 
 * Nama file    : Asersi1.java
 * Deskripsi    : Program untuk menunjukkan praktikum
 * Pembuat      : Shakila Tungga Dewi/24060123120025
 * Tanggal      : 6 Maret 2025
 */

public class Asersi1 {
    public static void main(String[] args) {
        int x =0;
        if (x>0) {
            System.out.println("x bilangan positif");
        }
        else{
            assert(x<0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
