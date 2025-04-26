/* 
 * Nama File    : Manajere.java
 * Deskripsi    : Class Representasi Manajer
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Kamis, 24 April 2025
 */

package PRAKTIKUM_6.Pekerja;

public class Manajer extends Pegawai{
    // atribut
    private int tunjangan = 700000;

    // Konstruktor
    public Manajer(String nama){
        super(nama);
    }

    // method
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan   : "+ this.tunjangan);
    }
    
}
