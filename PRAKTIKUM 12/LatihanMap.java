// package PRAKTIKUM 12;
/* 
 * File : LatihanMap.java
 * Deskripsi : Implementasi ekspresi lambda untuk menampilkan key dan value dari sebuah Map,
dimana key merupakan NIM dan value merupakan nama mahasiswa
 * Pembuat : Shakila Tungga Dewi/24060123120025
 * Tanggal : 5 Juni 2025
 */
import java.util.*;

public class LatihanMap {
    public static void main(String[] args) {
        // key -> String, value String
        Map<String,String> mapMhs = new HashMap<String, String>();

        mapMhs.put("24060123120025", "Shakila");
        mapMhs.put("240601231200xx", "Mhsxx01");
        mapMhs.put("24060123120099", "Mhsxx02");
        mapMhs.put("24060123120077", "Mhsxx03");

        // print dengan lambda
        mapMhs.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
