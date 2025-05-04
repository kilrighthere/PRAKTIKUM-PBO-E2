/* 
 * Nama File    : BangunDatarGenericTest.java
 * Deskripsi    : Representasi Main kelas Bangun Datar dengan implementasi generic class
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Kamis, 1 Mei 2025
 */

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("Keliling Lingkaran : "+bdg.hitungKeliling());
        System.out.println("Type generic : "+bdg.get(). getClass().getName());

    }
}
