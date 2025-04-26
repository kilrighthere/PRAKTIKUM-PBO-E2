/* 
 * Nama File    : Vehicle.java
 * Deskripsi    : Class Representasi Car
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Kamis, 24 April 2025
 */

package PRAKTIKUM_6.Vehicle;

public class Car extends Vehicle{
    void calRent(int jarak, float harga){
        float fare = jarak * harga;
        fare = fare - 100.00f;
        System.out.println("harga sewa mobil = "+fare);
    }
}
