/* 
 * Nama File    : Main.java
 * Deskripsi    : Main Class Representasi Vehicle
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Kamis, 24 April 2025
 */

package PRAKTIKUM_6.Vehicle;

// import RELASI.Kendaraan;

public class Main {
    public static void main(String[] args) {
        Vehicle Kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();
        Kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);

        Vehicle.hitungsewa(Kendaraan);
        Vehicle.hitungsewa(mobil);
        Vehicle.hitungsewa(bis);
    }

}
