/* 
 * Nama File    : Programmer.java
 * Deskripsi    : Class Representasi Programmer
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Kamis, 24 April 2025
 */

package PRAKTIKUM_6.Pekerja;

public class Programmer extends Pegawai{
    // atribut
    private int bonus = 450000;

    // konstruktor
    public Programmer(String nama){
        super(nama);
    }

    // method
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus       : "+ this.bonus);
    }

}
