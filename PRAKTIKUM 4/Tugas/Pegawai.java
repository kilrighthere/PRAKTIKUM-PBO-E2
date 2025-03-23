package Tugas;

import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.text.NumberFormat;
import java.util.Locale;

public class Pegawai {
    private String NIP;
    private String name;
    private LocalDate birthDate;
    private LocalDate TMT;
    private double gajiPokok;

    public Pegawai(){

    }

    public Pegawai(String NIP, String name, LocalDate birthDate, LocalDate TMT, double gajiPokok ){
        this.NIP = NIP;
        this.name = name;
        this.birthDate = birthDate;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    public String getNIP(){
        return this.NIP;
    }
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public LocalDate getBirthDate(){
        return this.birthDate;
    }
    public void setBirthDate(int year, int month, int day){
        this.birthDate = LocalDate.of(year, month, day);
    }

    public LocalDate getTMT(){
        return this.TMT;
    }
    public void setTMT(int year, int month, int day){
        this.TMT = LocalDate.of(year, month, day);
    }

    public double getGajiPokok(){
        return this.gajiPokok;
    }
    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public String masaKerja(){
        LocalDate now = LocalDate.now();
        Period selisih = Period.between(getTMT(), now);

        int Tahun = selisih.getYears();
        int bulan = selisih.getMonths();
        return (Tahun + " tahun " + bulan + " bulan");
    }

    public int getYearMasaKerja(){
        LocalDate now = LocalDate.now();
        Period selisih = Period.between(getTMT(), now);
        return selisih.getYears();
    }

    
    public void printInfo(){
        System.out.println("\n============PEGAWAI============");
        NumberFormat formatter2 = NumberFormat.getCurrencyInstance(Locale.of("id", "ID"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy").withLocale(Locale.of("id", "ID"));
        String gajiPokok = formatter2.format(getGajiPokok());
        String bDate = getBirthDate().format(formatter);
        String TMTs = getTMT().format(formatter);
        System.out.println("NIP\t\t\t:" + this.NIP);
        System.out.println("Nama\t\t\t:"+ this.name);
        System.out.println("Tanggal Lahir\t\t:"+  bDate);
        System.out.println("TMT\t\t\t:"+TMTs);
        System.out.println("Masa Kerja\t\t:"+ masaKerja());
        System.out.println("Gaji Pokok\t\t:"+gajiPokok);
    }

}
