// package tugasDua;
/* 
 * Nama File    : Koleksi.java
 * Deskripsi    : Representasi kelas generik koleksi 
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Kamis, 8 Mei 2025
 */


import java.util.ArrayList;

public class Koleksi <T> {
    // Atribut
    private int nbElm;
    private ArrayList<T> wadah;

    // konstruktor
    public Koleksi(){
        this.nbElm = 0;
        this.wadah = new ArrayList<>();
    }

    // methode
    // fungsi untuk mengembalikan objek pada wadah
    public T getIsi(int index){
        if (index>= 0 && index<nbElm) {
            return wadah.get(index);
        }
        return null;
    }
    
    // prosedur untuk mengubah elemen wadah pada index tertentu
    public void setIsi(int index,T isi){
        if (index>= 0 && index<nbElm) {
            wadah.set(index, isi);
        }
    }

    // fungsi untuk mengembalikan ukuran koleksi (array List)
    public int getSize(){
        return this.nbElm;
    }

    // methode untuk mengubah ukuran Array dan wadah
    public void setSize(int size){
        if (size < nbElm) {
            // Buang elemen dari belakang untuk menyinkronkan ArrayList pada wadah
            for (int i = nbElm - 1; i >= size; i--) {
                wadah.remove(i);
            }
        }
        this.nbElm = size;
    }

    // methode untuk menambahkan elemen pada wadah koleksi
    public void add(T x){
        wadah.add(x);
        this.nbElm++;
    }

    // methode untuk menghapus elemen terakhir pada wadah koleksi
    public T delete(){
        if (nbElm>0) {
            T e = wadah.remove(nbElm-1);
            this.nbElm--;
            return e;
        }
        return null;
    }

    // prosedur untuk menampilkan keseluruhan elemen
    public void showAll(){
        if (nbElm>0) {
            for (int i = 0; i<nbElm; i++){
                System.out.println("elemen ke-" + (i+1) + " adalah : " + getIsi(i));
            }
        }
    }
}
