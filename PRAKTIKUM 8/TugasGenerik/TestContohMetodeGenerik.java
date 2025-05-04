/* 
 * Nama File    : TestContohMetodeGenerik.java
 * Deskripsi    : Representasi kelas utama sebagai implementasi dari kelas ContohMetodeGenerik
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Sabtu, 3 Mei 2025
 */

package TugasGenerik;

public class TestContohMetodeGenerik {
    public static void main(String[] args) {
        // ContohMetodeGenerik C = new ContohMetodeGenerik();
        Datum<Anabul> p1 = new Datum<Anabul>();

        ContohMetodeGenerik.setDatum(p1, new Kucing("pus"));
        ContohMetodeGenerik.getGerak(p1);
        ContohMetodeGenerik.getSuara(p1);
        ContohMetodeGenerik.InfoPetDatum(p1);
        ContohMetodeGenerik.InfoDatum(p1);
        
        ContohMetodeGenerik.setDatum(p1, new Anjing("doggy"));
        ContohMetodeGenerik.getGerak(p1);
        ContohMetodeGenerik.getSuara(p1);
        ContohMetodeGenerik.InfoPetDatum(p1);
        ContohMetodeGenerik.InfoDatum(p1);


        // ContohMetodeGenerik.getGerak(Datum<>(new Kucing(null)));

    }
}
