/* Nama file    : PNS.java
* Deskripsi    : Program untuk sub Kelas PNS
* Pembuat      : Shakila Tungga Dewi/24060123120025
* Tanggal      : 23 Maret 2025
*/

package TUGAS;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class PNS extends Manusia implements Pajak{
    // ATRIBUT
    private String nip;
    private static int counterPNS;

    // KONSTRUKTOR
    // konstruktor tanpa parameter
    public PNS(){
        counterPNS++;
    }

    // konstruktor dengan parameter
    public PNS (String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // GETTER DAN SETTER
    //getter nip
    public String getNip(){
        return this.nip;
    }
    // setter nip
    public void setNip(String nip){
        this.nip = nip;
    }

    // getter counter PNS
    public static int getCounterPNS(){
        return counterPNS;
    }

    // implementasi method abstract
    public int hitungMasaKerja(){
        LocalDate now = LocalDate.now();
        Period selisih = Period.between(getTgl_mulai_kerja(), now);
        int Tahun = selisih.getYears();
        return Tahun + 5; // NIM : 24060123120025
    }

    // implementasi methode interface
    @Override
    public double hitungPajak(){
        return (10/100)*getPendapatan();
    }

    // overiding methode di parent class
    @Override
    public void cetakInfo(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy").withLocale(Locale.of("id", "ID"));
        NumberFormat formatter2 = NumberFormat.getCurrencyInstance(Locale.of("id", "ID"));
        String pendapatan = formatter2.format(getPendapatan());
        System.out.println("INFORMASI");
        System.out.println("Nama                : "+getNama());
        System.out.println("NIP                 : "+getNip());
        System.out.println("Tanggal mulai Kerja : "+getTgl_mulai_kerja().format(formatter));
        System.out.println("Alamat              : "+getAlamat());
        System.out.println("Pendapatan          : "+pendapatan);
        System.out.println();
    }
}
