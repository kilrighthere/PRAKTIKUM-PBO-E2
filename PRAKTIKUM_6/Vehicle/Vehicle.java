/* 
 * Nama File    : Vehicle.java
 * Deskripsi    : Super Class Representasi Vehicle
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Kamis, 24 April 2025
 */

package PRAKTIKUM_6.Vehicle;

public class Vehicle {
    void calRent(int distance, float price){
        float fare = distance*price;
        System.out.println("vehicle price = "+fare);
    }

    public static void hitungsewa(Vehicle v){
        v.calRent(80, 1100);
    }
}
