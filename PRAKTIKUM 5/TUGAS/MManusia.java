/* Nama file    : MManusia.java
* Deskripsi    : Program Main Kelas Manusia
* Pembuat      : Shakila Tungga Dewi/24060123120025
* Tanggal      : 23 Maret 2025
*/

package TUGAS;

import java.time.LocalDate;

public class MManusia {
    public static void main(String[] args) { 
        LocalDate tgl_p1 = LocalDate.of(2006, 1, 4);
        PNS p1 = new PNS("Satriyo",tgl_p1,"Jl. Seroja",15000000,"198302032006041002");
        
        LocalDate tgl_pe1 = LocalDate.of(2000, 1, 1);
        Pengusaha pe1 = new Pengusaha("Adhy",tgl_pe1,"Jl.Air",55000000,"000-556-773-212-000-5"); 
        
        LocalDate tgl_pt1 = LocalDate.of(1997, 1, 9);
        Petani pt1 = new Petani("Nugraha",tgl_pt1,"Jl. Bunga 9 Tembalang",5000000,"wonogiri");
        
        LocalDate tgl_p2 = LocalDate.of(2010, 4, 1);
        PNS p2 = new PNS("Panji",tgl_p2,"",10000000,"198004212010041002"); 

        p2.setAlamat("Jl. Panorama 111 Tembalang"); 
        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns()); 
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS()); 
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha()); 
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani()); 
        
        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak()); 
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak()); 
        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja()); 
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja()); 
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja()); 
        p1.cetakInfo(); 
        pe1.cetakInfo(); 
        pt1.cetakInfo();   
        p2.cetakInfo(); 
    }
}
