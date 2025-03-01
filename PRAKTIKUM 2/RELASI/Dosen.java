/* Nama File    : Dosen.java */
/* Deskripsi    : berisi atribut dan methode class Dosen*/
/* Pembuat      : Shakila Tungga Dewi*/
/* NIM          : 24060123120025 */
/* Tanggal      : 27 Februari 2025*/

package RELASI;

public class Dosen {
    /* ATRIBUT CLASS DOSEN */
    private String nip;
    private String nama;
    private String prodi;

    // kontruktor Dosen
    public Dosen(){
    
    }
    
    public Dosen (String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    /* Getter class dosen */
    // mengembalikan nip dari dosen
    public String getNip(){
        return this.nip;
    }

    // mengembalikan nama dari dosen 
    public String getNama(){
        return this.nama;
    }

    // mengembalikan prodi dari dosen 
    public String getProdi(){
        return this.prodi;
    }

    /*SETTER class Dosen */
    // mengeset nip dari dosen
    public void setNip(String NIP){
        this.nip = NIP;
    }

    // mengeset nama dari dosen
    public void setNama(String name){
        this.nama = name;
    }

    // mengeset prodi dari dosen
    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    // menampilkan dosen
    public void printDosen(){
        System.out.println(nip + " - " + nama + " - " + prodi);
    }
}



