/* Nama File    : Kendaraan.java */
/* Deskripsi    : berisi atribut dan methode class Kendaraan*/
/* Pembuat      : Shakila Tungga Dewi*/
/* NIM          : 24060123120025 */
/* Tanggal      : 27 Februari 2025*/

package RELASI;

public class Kendaraan {
    /* ATRIBUT CLASS KENDARAAN */
    private String noPlat;
    private String Jenis;
    

    /* KONSTRUKTOR */
    public Kendaraan(){

    
    }

    public Kendaraan(String noPlat, String Jenis){
        this.noPlat = noPlat;
        this.Jenis = Jenis;
    }

    /* GETTER */
    // mengembalikan no plat kendaraan
    public String getnoPlat(){
        return this.noPlat;
    }

    // mengembalikan jenis dari kendaraan
    public String getJenis(){
        return this.Jenis;
    }

    /* SETTER */
    // mengeset no plat kendaraan
    public void setnoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    // mengeset jenis kendaraan
    public void setJenis(String Jenis){
        if (Jenis.equalsIgnoreCase("motor")|| Jenis.equalsIgnoreCase("mobil")) {
            this.Jenis = Jenis;
        }
        else{
            System.out.println("Jenis kendaraan harus Motor atau Mobil ☹");
        }
    }
}
