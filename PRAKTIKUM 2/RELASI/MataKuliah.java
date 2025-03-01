/* Nama File    : MataKuliah.java */
/* Deskripsi    : berisi atribut dan methode class MataKuliah*/
/* Pembuat      : Shakila Tungga Dewi*/
/* NIM          : 24060123120025 */
/* Tanggal      : 27 Februari 2025*/

package RELASI;

public class MataKuliah {
    /* ATRIBUT */
    private String IDmatkul;
    private String nama_MK;
    private int SKS;

    /* KONSTRUKTOR */
    public MataKuliah(){

    }

    public MataKuliah(String IDmatkul, String nama_MK, int SKS){
        this.IDmatkul = IDmatkul;
        this.nama_MK = nama_MK;
        this.SKS = SKS;
    }

    /* GETTER */
    // mengembalikan IDmatkul dari mata kuliah
    public String getIDmatkul(){
        return this.IDmatkul;
    }

    // mengembalikan nama matakuliah
    public String getnama_MK(){
        return this.nama_MK;
    }

    // mengembalikan jumlah sks
    public int getSKS(){
        return this.SKS;
    }

    /* SETTER */
    // mengeset ID matakuliah
    public void setIDmatkul(String IDmatkul){
        this.IDmatkul = IDmatkul;
    }

    // mengeset nama mata kuliah
    public void setnama_MK (String nama_MK){
        this.nama_MK = nama_MK;
    }

    // mengeset SKS
    public void setSKS(int SKS){
        this.SKS = SKS;
    }
}
