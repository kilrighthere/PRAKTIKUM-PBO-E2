package Tugas;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DosenTamu extends Pegawai{
    private String NIDK;
    private String Fakultas;
    private LocalDate TanggalKontrak;

    public DosenTamu(){

    }

    public DosenTamu(String NIP, String NIDK, String name, LocalDate birthDate, LocalDate TMT, double gajiPokok, String Fakultas){
        super(NIP, name, birthDate,TMT,gajiPokok);
        this.NIDK = NIDK;
        this.Fakultas = Fakultas;
    }

    public String getNIDK(){
        return this.NIDK;
    }
    public void setNIDK(String NIDK){
        this.NIDK=NIDK;
    }
    public String getFakultas(){
        return this.Fakultas;
    }
    public void setFakultas(String Fakultas){
        this.Fakultas=Fakultas;
    }

    public LocalDate getTanggalKontrak(){
        return this.TanggalKontrak;
    }
    public void setTanggalKontrak(int year, int month, int day){
        this.TanggalKontrak = LocalDate.of(year, month, day);
    }

    public String Tunjangan(){
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.of("id", "ID"));
        double tunjangan = 0.025*getGajiPokok();
        return formatter.format(tunjangan);
    }

    public String masaKontrak(){
        LocalDate now = LocalDate.now();
        Period selisih = Period.between(now, getTanggalKontrak());

        int Tahun = selisih.getYears();
        int bulan = selisih.getMonths();
        if (Tahun > 0) {
            return (Tahun + " tahun " + bulan + " bulan");
        }
        else{
            return bulan + " bulan";
        }
    }


    public String Jabatan(){
        return "Dosen Tamu";
    }
    @Override
    public void printInfo(){
        System.out.println("\n============ DOSEN TAMU ============");
        NumberFormat formatter2 = NumberFormat.getCurrencyInstance(Locale.of("id", "ID"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy").withLocale(Locale.of("id", "ID"));
        String gajiPokok = formatter2.format(getGajiPokok());
        String bDate = getBirthDate().format(formatter);
        String TMTs = getTMT().format(formatter);
        System.out.println("NIDK\t\t\t:"+getNIDK());
        System.out.println("NIP\t\t\t:" + getNIP());
        System.out.println("Nama\t\t\t:"+ getName());
        System.out.println("Tanggal Lahir\t\t:"+  bDate);
        System.out.println("TMT\t\t\t:"+TMTs);
        System.out.println("Jabatan\t\t\t:"+Jabatan());
        System.out.println("Fakultas\t\t:" + getFakultas());
        System.out.println("Masa Kerja\t\t:"+ masaKerja());
        System.out.println("Masa Kontrak Berakhir\t:"+masaKontrak());
        System.out.println("Tanggal Berakhir Kontrak:"+getTanggalKontrak().format(formatter));
        System.out.println("Gaji Pokok\t\t:"+gajiPokok);
        System.out.println("Tunjangan\t\t: 2,5% x "+gajiPokok + " = " +Tunjangan());    
    }
}
