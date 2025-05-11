// package PRAKTIKUM 9;
/* 
 * Nama File    : MapTest.java
 * Deskripsi    : Class Representasi Collection bertipe map
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Kamis, 26 April 2025
 */


import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        // kunci -> integer, nilai -> string
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "Satu");
        map.put(2, "Dua");

        System.out.println(map.get(1));

        Set<Integer> key = map.keySet();
        for(Integer i : key){
            System.out.println(i + " " + map.get(i));
        }
        //nilai key bersifat set di dalam map, jadi nilai key yang sama akan menumpuk nilai key sebelumnya
        // walaupun variabel key dijadikan sebuah list nilai key akan tetap set, karena penataan key set di dalam map yang bersifat unik

    }
}
