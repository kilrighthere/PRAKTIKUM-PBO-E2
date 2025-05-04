/* 
 * Nama File    : BangunDatarGeneric.java
 * Deskripsi    : Representasi kelas Bangun Datar dengan implementasi generic class
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Kamis, 1 Mei 2025
 */

public class BangunDatarGeneric <T extends BangunDatar>{
    private T bangunDatar;

    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}

// mengganti variabel T pada signature class maka harus mengganti seluruh variabel T di dalam class tersebut agar sesuai (parameterisasi generic)