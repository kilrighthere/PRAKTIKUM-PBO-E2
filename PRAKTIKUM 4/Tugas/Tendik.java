package Tugas;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Tendik extends Pegawai{
    private String bidang;

    public Tendik(){

    }

    public Tendik(String NIP, String name, LocalDate birthDate, LocalDate TMT, double gajiPokok, String bidang){
        super(NIP, name, birthDate,TMT,gajiPokok);
        this.bidang =bidang;
    }

    public String getBidang(){
        return this.bidang;
    }
    public void setBidang(String bidang){
        this.bidang = bidang; //Akdemik, Kemahasiswaan, atau Sumber Daya
    }

    public LocalDate BUP(){
        return getBirthDate().plusYears(55).withDayOfMonth(1).plusMonths(1);
    }

    public String Tunjangan(){
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.of("id", "ID"));
        double tunjangan = 0.01*getGajiPokok()*getYearMasaKerja();
        return formatter.format(tunjangan);
    } 

    @Override
    public void printInfo(){
        System.out.println("\n============ TENDIK ============");
        NumberFormat formatter2 = NumberFormat.getCurrencyInstance(Locale.of("id", "ID"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy").withLocale(Locale.of("id", "ID"));
        String gajiPokok = formatter2.format(getGajiPokok());
        String bDate = getBirthDate().format(formatter);
        String TMTs = getTMT().format(formatter);
        System.out.println("NIP\t\t\t:" + getNIP());
        System.out.println("Nama\t\t\t:"+ getName());
        System.out.println("Tanggal Lahir\t\t:"+  bDate);
        System.out.println("TMT\t\t\t:"+TMTs);
        System.out.println("Jabatan\t\t\t:Tenaga Kependidikan (Tendik)");
        System.out.println("Bidang\t\t\t:" + getBidang());
        System.out.println("Masa Kerja\t\t:"+ masaKerja());
        System.out.println("BUP\t\t\t:"+BUP().format(formatter));
        System.out.println("Gaji Pokok\t\t:"+gajiPokok);
        System.out.println("Tunjangan\t\t: 1% x "+getYearMasaKerja()+" x "+gajiPokok + " = " +Tunjangan());    
    }
}
