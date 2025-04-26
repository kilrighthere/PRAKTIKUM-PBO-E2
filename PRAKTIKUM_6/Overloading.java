/* 
 * Nama File    : Overloading.java
 * Deskripsi    : Contoh Polimorfisme Overloading
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Kamis, 24 April 2025
 */

package PRAKTIKUM_6;

public class Overloading {
    
    // contoh penerapan overloading dengan membuat beberapa methode dengan nama sama namun signature berbeda
    int tambah(int x, int y){
        return x + y;
    }

    int tambah(int x, int y, int z){
        return x + y + z;
    }

    double tambah(double x){
        return x+ x;
    }

    int tambah(int x){
        return x+ x;
    } 
    
    // main program
    public static void main(String[] args) {
        Overloading  O = new Overloading();
        System.out.println(O.tambah(1.3));
        System.out.println(O.tambah(13));
        System.out.println(O.tambah(1, 5));
        System.out.println(O.tambah(1, 4, 7));
    }
}
