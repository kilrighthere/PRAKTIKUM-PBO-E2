/* Nama file    : Petani.java
* Deskripsi    : Program untuk sub Kelas Petani
* Pembuat      : Shakila Tungga Dewi/24060123120025
* Tanggal      : 23 Maret 2025
*/

package TUGAS;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Petani extends Manusia implements Pajak {
    // ATRIBUT
    private String asal_kota;
    private static int counterPetani;

    // METHOD
    // Konstruktor tanpa parameter
    public Petani(){
        counterPetani++;
    }

    // konstruktor dengan parameter
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // GETTER DAN SETTER
    // getter asal kota
    public String getAsal_kota(){
        return this.asal_kota;
    }
    // setter asal kota
    public void setAsal_kota(String asal_kota){
        this.asal_kota = asal_kota;
    }

    // getter counter Petani
    public static int getCounterPetani(){
        return counterPetani;
    }

    // METHOD LAINNYA
    // implementasi method abstract
    public int hitungMasaKerja(){
        LocalDate now = LocalDate.now();
        Period selisih = Period.between(getTgl_mulai_kerja(), now);
        int Tahun = selisih.getYears();
        return Tahun + 0; // NIM : 24060123120025
    }

    // implementasi methode interface
    @Override
    public double hitungPajak(){
        return 0.0;
    }

    // overiding methode di parent class
    @Override
    public void cetakInfo(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy").withLocale(Locale.of("id", "ID"));
        NumberFormat formatter2 = NumberFormat.getCurrencyInstance(Locale.of("id", "ID"));
        String pendapatan = formatter2.format(getPendapatan());
        System.out.println("INFORMASI");
        System.out.println("Nama                : "+getNama());
        System.out.println("Asal Kota           : "+getAsal_kota());
        System.out.println("Tanggal mulai Kerja : "+getTgl_mulai_kerja().format(formatter));
        System.out.println("Alamat              : "+getAlamat());
        System.out.println("Pendapatan          : "+pendapatan);
        System.out.println();
    }

}
