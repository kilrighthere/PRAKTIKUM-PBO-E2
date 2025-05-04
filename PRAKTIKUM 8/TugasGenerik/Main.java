/* 
 * Nama File    : Main.java
 * Deskripsi    : Main Class Representasi kelas utama untuk mengimplementasikan kelas Anabul
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Kamis, 26 April 2025
 */

package TugasGenerik;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Anabul hewan1 = new Kucing("Mochi");
        Anabul hewan2 = new Anjing("Choco");
        Anabul hewan3 = new Burung("Tweety");

        ArrayList<Anabul> animal = new ArrayList<>();
        animal.add(hewan1);
        animal.add(hewan2);
        animal.add(hewan3);

        for (Anabul anim : animal){
            anim.infoAnabul();
            System.out.println();
        }
    }
}
