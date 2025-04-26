/* 
 * Nama File    : Anabul.java
 * Deskripsi    : Super Class Representasi anabul
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Kamis, 26 April 2025
 */

package PRAKTIKUM_6.Anabul;

public abstract class Anabul {
    // Atribut
    private String nama;

    // konstruktor
    public Anabul(String nama){
        this.nama = nama;
    }

    // methode
    public abstract String Gerak();
    public abstract String Bersuara();

    public void infoAnabul(){
        System.out.println("Nama    : "+this.nama);
    }
}
