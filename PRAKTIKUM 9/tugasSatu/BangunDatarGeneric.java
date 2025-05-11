/* 
 * Nama File    : BangunDatarGeneric.java
 * Deskripsi    : Representasi kelas Bangun Datar dengan implementasi generic class
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Kamis, 1 Mei 2025
 */

public class BangunDatarGeneric <T extends BangunDatar2>{
    // atribut
    private T bangunDatar;

    // methode
    // methode untuk mengubah class/objek pada atribut generic T 
    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    // methode untuk mengembalikan class/objek yang terpasang pada atribut T
    public T get(){
        return bangunDatar;
    }

    // methode untuk menghitung keliling dari objek yang terpasang pada atribut t
    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
    
    // methode untuk menghitung luas dari objek yang terpasang pada atribut t
    public double hitungLuas(){
        return bangunDatar.hitungLuas();
    }
}

// mengganti variabel T pada signature class maka harus mengganti seluruh variabel T di dalam class tersebut agar sesuai (parameterisasi generic)