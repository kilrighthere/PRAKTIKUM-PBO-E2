/* Nama File    : Mahasiswa.java */
/* Deskripsi    : berisi atribut dan methode class Mahasiswa*/
/* Pembuat      : Shakila Tungga Dewi*/
/* NIM          : 24060123120025 */
/* Tanggal      : 27 Februari 2025*/

package RELASI;

import java.util.ArrayList;


public class Mahasiswa {
    /* ATRIBUT CLASS MAHASISWA */
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /* KONSTRUKTOR */
    public Mahasiswa(){
        this.listMatkul = new ArrayList<>();
    }

    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    /* METHOD GETTER */
    // Method untuk mengembalikan nim mahasiswa
    public String getnim(){
        return this.nim;
    }

    // method untuk mengembalikan nama mahasiswa
    public String getnama(){
        return this.nama;
    }
    
    // method untuk mengembalikan prodi mahasiswa
    public String getprodi(){
        return this.prodi;
    }

    // method untuk mengembalikan dosen wali mahasiswa
    public Dosen getdosenWali(){
        return this.dosenWali;
    }

    // method untuk mengembalikan kendaraan mahasiswa
    public Kendaraan getkendaraan(){
        return this.kendaraan;
    }

    /* METHOD SETTER */
    // method untuk mengeset nim mahasiwa
    public void setnim(String nim){
        this.nim = nim;
    }

    // method untuk mengeset nama dari mahasiswa
    public void setnama(String nama){
        this.nama = nama;
    }

    // method untuk mengeset prodi dari mahasiswa
    public void setprodi(String prodi){
        this.prodi = prodi;
    }
    
    // method untuk mengeset dosen wali mahasiwa
    public void setdosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }
    
    // method untuk mengeset kendaraan dari mahasiswa
    public void setKendaraan (Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }
    
    // method untuk menambahkan matakuliah 
    public void addMatkul(MataKuliah mataKuliah){
        if (this.listMatkul.size()<50) {
            this.listMatkul.add(mataKuliah);
        }
        else{
            System.out.println("Mata Kuliah sudah penuh ☹");
        }
    }


    /* FUNGSI FUNGSI LAIN */
    // fungsi untuk mengembalikan jumlah SKS yang telah diambil mahasiswa
    public int getJumlahSKS(){
        int jumlah = 0;
        for (MataKuliah mataKul : this.listMatkul){
            jumlah+= mataKul.getSKS();
        }
        return jumlah;
    }

    // fungsi untuk mengembalikan jumlah matakuliah yang telah diambil mahasiswa
    public int getJumlahMatkul(){
        return this.listMatkul.size();
    }

    // method untuk menampilkan nim, nama, dan prodi mahasiswa
    public void printMhs(){
        System.out.println("NIM \t\t : "+nim);
        System.out.println("Nama \t\t : "+nama);
        System.out.println("Prodi \t\t : "+prodi);
    }

    // method untuk menampilkan detail mahasiswa
    public void printDetailMhs(){
        printMhs();
        System.out.println("Daftar Mata Kuliah");
        int i;
        for(i = 0; i< listMatkul.size(); i++){
            System.out.println(listMatkul.get(i).getnama_MK());
        }
        System.out.println("Dosen wali \t"+ dosenWali.getNama());
        System.out.println("Kendaraan\t"+ kendaraan.getJenis());
    }

}
