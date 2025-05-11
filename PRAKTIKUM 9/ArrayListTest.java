// package PRAKTIKUM 9;
/* 
 * Nama File    : ArrayListTest.java
 * Deskripsi    : Representasi kelas untuk Colection bertipe ArrayList
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Kamis, 1 Mei 2025
 */

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // inisialisasi ArrayList yang hanya dapat berisi objek String
        ArrayList<String> strings = new ArrayList<String>();

        // menambahkan elemen
        strings.add("praktikum");
        strings.add("collections");
        strings.add("dan generics");

        // menghapus elemen
        strings.remove("praktikum");

        // iterasi pada keseluruhan ArrayList
        for(String s : strings){
            System.out.println(s + " ");
        }
    }
}
