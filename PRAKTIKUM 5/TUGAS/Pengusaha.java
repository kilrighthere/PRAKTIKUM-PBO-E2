/* Nama file    : Pengusaha.java
* Deskripsi    : Program untuk sub Kelas Pengusaha
* Pembuat      : Shakila Tungga Dewi/24060123120025
* Tanggal      : 23 Maret 2025
*/

package TUGAS;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pengusaha extends Manusia implements Pajak{
    // ATRIBUT
    private String npwp;
    private static int counterPengusaha;

    // METHODE
    // KONSTRUKTOR
    // konstruktor tanpa parameter
    public Pengusaha(){
        counterPengusaha++;
    }

    // konstruktor dengan parameter
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // SETTER DAN GETTER
    // getter npwp
    public String getNpwp(){
        return this.npwp;
    }
    // setter npwp
    public void setNpwp(String npwp){
        this.npwp = npwp;
    }

    // getter counter pengusaha
    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    // implementasi methode interface
    public int hitungMasaKerja(){
        LocalDate now = LocalDate.now();
        Period selisih = Period.between(getTgl_mulai_kerja(), now);
        int Tahun = selisih.getYears();
        return Tahun + 2; // NIM : 24060123120025
    }


    // implementasi method abstract
    @Override
    public double hitungPajak(){
        return (15/100)*getPendapatan();
    }

    // overiding methode di parent class
    @Override
    public void cetakInfo(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy").withLocale(Locale.of("id", "ID"));
        NumberFormat formatter2 = NumberFormat.getCurrencyInstance(Locale.of("id", "ID"));
        String pendapatan = formatter2.format(getPendapatan());
        System.out.println("INFORMASI");
        System.out.println("Nama                : "+getNama());
        System.out.println("NPWP                : "+getNpwp());
        System.out.println("Tanggal mulai Kerja : "+getTgl_mulai_kerja().format(formatter));
        System.out.println("Alamat              : "+getAlamat());
        System.out.println("Pendapatan          : "+pendapatan);
        System.out.println();
    }


}
