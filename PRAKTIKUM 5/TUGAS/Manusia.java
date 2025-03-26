/* Nama file    : Manusia.java
* Deskripsi    : Program untuk Kelas Abstract Manusia
* Pembuat      : Shakila Tungga Dewi/24060123120025
* Tanggal      : 23 Maret 2025
*/

package TUGAS;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Manusia {
    // ATRIBUT
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns;

    //METHODE
    // KONSTRUKTOR
    // konstruktor tanpa parameter
    protected Manusia(){
        counterMns++;
    } 

    // konstruktor dengan parameter
    protected Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // SETTER DAN GETTER
    // getter nama
    public String getNama(){
        return this.nama;
    }
    // setter nama
    public void setNama(String nama){
        this.nama = nama;
    }

    // getter tanggal mulai kerja
    public LocalDate getTgl_mulai_kerja(){
        return this.tgl_mulai_kerja;
    }
    // setter tanggal mulai kerja
    public void setTgl_mulai_kerja(int year, int month, int day){
        this.tgl_mulai_kerja = LocalDate.of(year, month, day);

    }


    // getter alamat
    public String getAlamat(){
        return this.alamat;
    }
    // setter alamat
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    // getter pendapatan
    public double getPendapatan(){
        return this.pendapatan;
    }
    // setter pendapatan
    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    // getter counter Manusia
    public static int getCounterMns(){
       return counterMns;
    }

    // METHODE LAINNYA
    public void cetakInfo(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy").withLocale(Locale.of("id", "ID"));
        NumberFormat formatter2 = NumberFormat.getCurrencyInstance(Locale.of("id", "ID"));
        String pendapatan = formatter2.format(getPendapatan());
        System.out.println("INFORMASI");
        System.out.println("Nama                : "+getNama());
        System.out.println("Tanggal mulai Kerja : "+getTgl_mulai_kerja().format(formatter));
        System.out.println("Alamat              : "+getAlamat());
        System.out.println("Pendapatan          : "+pendapatan);
    }

    // method abstract untuk menghitung masa kerja
    public abstract int hitungMasaKerja();
}
