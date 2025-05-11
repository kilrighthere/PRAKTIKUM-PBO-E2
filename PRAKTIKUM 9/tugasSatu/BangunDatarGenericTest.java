/* 
 * Nama File    : BangunDatarGenericTest.java
 * Deskripsi    : Representasi Main kelas Bangun Datar dengan implementasi generic class
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Kamis, 1 Mei 2025
 */

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(7);
        Persegi p = new Persegi(5);
        PersegiPanjang pj = new PersegiPanjang(4, 3);
        Segitiga sg = new Segitiga(24);

        BangunDatarGeneric<BangunDatar2> bdg = new BangunDatarGeneric<BangunDatar2>();

        // objek lingkaran
        bdg.set(l);
        System.out.println("Keliling Lingkaran : "+bdg.hitungKeliling());
        System.out.println("Luas Lingkaran : "+bdg.hitungLuas());
        System.out.println("Type generic : "+bdg.get(). getClass().getName());
        System.out.println();

        // objek persegi
        bdg.set(p);
        System.out.println("Keliling Persegi : "+bdg.hitungKeliling());
        System.out.println("Luas Persegi : "+bdg.hitungLuas());
        System.out.println("Type generic : "+bdg.get(). getClass().getName());
        System.out.println();

        // objek persegi panjang
        bdg.set(pj);
        System.out.println("Keliling Persegi Panjang : "+bdg.hitungKeliling());
        System.out.println("Luas Persegi Panjang : "+bdg.hitungLuas());
        System.out.println("Type generic : "+bdg.get(). getClass().getName());
        System.out.println();

        // objek segitiga(sama sisi)
        bdg.set(sg);
        System.out.println("Keliling Segitiga : "+bdg.hitungKeliling());
        System.out.println("Luas Segitiga : "+bdg.hitungLuas());
        System.out.println("Type generic : "+bdg.get(). getClass().getName());
    }
}
