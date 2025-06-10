// package PRAKTIKUM 12;

/* 
 * File : LambdaList.java
 * Deskripsi : Implementasi Lambda pada List, digunakan sebagai parameter pada method
 * Pembuat : Shakila Tungga Dewi/24060123120025
 * Tanggal : 5 Juni 2025
 */

import java.util.*;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        // lambda digunakan sebgai parameter
        mahasiswaList.forEach((nama)-> System.out.println(nama));
    }
}
