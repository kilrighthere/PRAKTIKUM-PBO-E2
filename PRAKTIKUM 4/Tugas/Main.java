package Tugas;


public class Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        p1.setName("Andi");
        p1.setNIP("9545647548");
        p1.setTMT(2015, 1,1);
        p1.setBirthDate(1990, 5, 5);
        p1.setGajiPokok(5000000);

        System.out.println("NIP P1 : "+p1.getName());
        System.out.println("Nama P1 : "+p1.getName());
        System.out.println("Tanggal Lahir P1 : "+p1.getBirthDate());
        System.out.println("TMT P1 : "+p1.getTMT());
        System.out.println("Masa Kerja P1 : "+p1.masaKerja());
        System.out.println("Gaji Pokok : "+p1.getGajiPokok());
        System.out.println();
        p1.printInfo();
        System.out.println();

        Tendik p2 = new Tendik();
        p2.setName("Benny");
        p2.setNIP("12387548");
        p2.setTMT(2017, 1,1);
        p2.setBirthDate(2000, 8, 5);
        p2.setGajiPokok(5000000);
        p2.setBidang("Kemahasiswaan");
        System.out.println("nama p2 : "+p2.getName());
        System.out.println("NIP p2 : "+p2.getNIP());
        System.out.println("TMT p2 : "+p2.getTMT());
        System.out.println("Tanggal Lahir p2 : "+p2.getBirthDate());
        System.out.println("Gaji Pokok p2 : "+p2.getGajiPokok());
        System.out.println("bidang p2 : "+p2.getBidang());
        System.out.println();
        p2.printInfo();
        System.out.println();

        DosenTetap P3 = new DosenTetap();
        P3.setName("Benny");
        P3.setNIP("12387548");
        P3.setNIDN("3456788");
        P3.setTMT(2017, 1,1);
        P3.setBirthDate(2000, 8, 5);
        P3.setGajiPokok(5000000);
        P3.setFakultas("Fakultas Sains dan Matematika");
        System.out.println("nama P3 : "+P3.getName());
        System.out.println("NIP P3 : "+P3.getNIP());
        System.out.println("NIDN P3 : "+P3.getNIDN());
        System.out.println("TMT P3 : "+P3.getTMT());
        System.out.println("Tanggal Lahir P3 : "+P3.getBirthDate());
        System.out.println("Gaji Pokok P3 : "+P3.getGajiPokok());
        System.out.println("Fakultas P3 : "+P3.getFakultas());
        System.out.println();
        P3.printInfo();
        System.out.println();

        DosenTamu P4 = new DosenTamu();
        P4.setName("Henri");
        P4.setNIP("12387548");
        P4.setNIDK("3456788");
        P4.setTMT(2017, 1,1);
        P4.setBirthDate(2000, 8, 5);
        P4.setGajiPokok(4500000);
        P4.setFakultas("Fakultas Teknik");
        P4.setTanggalKontrak(2030,8,25);
        System.out.println("nama P4 : "+P4.getName());
        System.out.println("NIP P4 : "+P4.getNIP());
        System.out.println("NIDK P4 : "+P4.getNIDK());
        System.out.println("TMT P4 : "+P4.getTMT());
        System.out.println("Tanggal Lahir P4 : "+P4.getBirthDate());
        System.out.println("Gaji Pokok P4 : "+P4.getGajiPokok());
        System.out.println("Fakultas P4 : "+P4.getFakultas());
        System.out.println("Tanggal Kontrak P4 : "+ P4.getTanggalKontrak());
        System.out.println();
        P4.printInfo();
        System.out.println();

    }
}
