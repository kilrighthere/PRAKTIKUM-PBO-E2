package Tugas;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DosenTetap extends Pegawai{
    private String NIDN;
    private String Fakultas;

    public DosenTetap(){

    }
    public DosenTetap(String NIP, String NIDN, String name, LocalDate birthDate, LocalDate TMT, double gajiPokok, String Fakultas){
        super(NIP, name, birthDate,TMT,gajiPokok);
        this.NIDN = NIDN;
        this.Fakultas = Fakultas;
    }

    public String getNIDN(){
        return this.NIDN;
    }
    public void setNIDN(String NIDN){
        this.NIDN=NIDN;
    }
    public String getFakultas(){
        return this.Fakultas;
    }
    public void setFakultas(String Fakultas){
        this.Fakultas=Fakultas;
    }

    public LocalDate BUP(){
        return getBirthDate().plusYears(65).withDayOfMonth(1).plusMonths(1);
    }

    public String Tunjangan(){
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.of("id", "ID"));
        double tunjangan = 0.02*getGajiPokok()*getYearMasaKerja();
        return formatter.format(tunjangan);
    }
    public String Jabatan(){
        return "Dosen Tetap";
    }

    @Override
    public void printInfo(){
        System.out.println("\n============ DOSEN TETAP ============");
        NumberFormat formatter2 = NumberFormat.getCurrencyInstance(Locale.of("id", "ID"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy").withLocale(Locale.of("id", "ID"));
        String gajiPokok = formatter2.format(getGajiPokok());
        String bDate = getBirthDate().format(formatter);
        String TMTs = getTMT().format(formatter);
        System.out.println("NIDN\t\t\t:"+getNIDN());
        System.out.println("NIP\t\t\t:" + getNIP());
        System.out.println("Nama\t\t\t:"+ getName());
        System.out.println("Tanggal Lahir\t\t:"+  bDate);
        System.out.println("TMT\t\t\t:"+TMTs);
        System.out.println("Jabatan\t\t\t:"+Jabatan());
        System.out.println("Fakultas\t\t:" + getFakultas());
        System.out.println("Masa Kerja\t\t:"+ masaKerja());
        System.out.println("BUP\t\t\t:"+BUP().format(formatter));
        System.out.println("Gaji Pokok\t\t:"+gajiPokok);
        System.out.println("Tunjangan\t\t: 2% x "+getYearMasaKerja()+" x "+gajiPokok + " = " +Tunjangan());    
    }
}
