package ENKAPSULASI;
/* Nama File    : Titik.java */
/* Deskripsi    : berisi atribut dan methode class Titik*/
/* Pembuat      : Shakila Tungga Dewi*/
/* Tanggal      : 27 Februari 2025*/


public class Titik {
    /* ATRIBUT */
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;
 
    /* METHOD */
    // kontruktor untuk membuat titik

    // Titik() {
    //     absis = 0;
    //     ordinat = 0;
    //     counterTitik++;
    // }

    // Override toString untuk mengembalikan titik dalam format (x, y)
    @Override
    public String toString() {
        return "(" + absis + ", " + ordinat + ")";
    }
    
    public Titik(){
        this (0,0);
    }
    
    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //mengembalikan nilai counterTitik
    public static int getCounterTitik(){
        return counterTitik;
    }

    //counter titik dengan this untuk objek
    public void printCounterTitik(){
        System.out.println(counterTitik);
    }

    // mengembalikan nilai absis
    public double getAbsis() {
       return absis;
    }
 
    // mengembalikan nilai ordinat
    public double getOrdinat() {
       return ordinat;
    }
    
    // mengeset nilai absis
    public void setAbsis(double x) {
       absis = x;
    }
    
    // mengeset nilai ordinat
    public void setOrdinat(double y) {
       ordinat = y;
    }
 
    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
       absis += x;
       ordinat += y;
    }
 
    // mencetak koordinat titik
    public void printTitik() {
       System.out.println("Titik(" + absis + "," + ordinat + ")");
    }

    // mengembalikan posisi kuadran dari sebuah titik bedasarkan absis dan ordinatnya
    public int getKuadran(){
        if(absis > 0 && ordinat > 0){
            return 1;
        }
        else if (absis < 0 && ordinat > 0){
            return 2;
        }
        else if(absis < 0 && ordinat < 0){
            return 3;
        }
        else if (absis >0 && ordinat < 0){
            return 4;
        }
        else{
            return -1;
        }
    }

    // mengembalikan nilai jarak sebuh titik ke titik pusat
    public double getJarakPusat(){
        return (Math.sqrt((absis*absis )+(ordinat*ordinat)));
    } 

    // mengembalikan nilai jarak antara dua buah titik
    public double getJarak(Titik T){
        // Titik T = new Titik();
        return (Math.sqrt(((T.getAbsis()-absis)*(T.getAbsis()-absis))+((T.getOrdinat()-ordinat)*(T.getOrdinat()-ordinat))));
    }

    // mmerefleksikan sebuah titik terhadap sumbu x
    public void refleksiX(){
        ordinat = ordinat * (-1);
    }

    // merefleksikan sebuah titik terhadap sumbu Y
    public void refleksiY(){
        absis = absis * (-1);
    }

    // mengembalikan sebuah titik baru yang merupakan hasil refleksi titik sebelumnya terhadap sumbu x
    public Titik getRefleksiX(){
        Titik T = new Titik ();
        T.ordinat = ordinat * (-1);
        T.absis = absis;
        return T;
    }

    // mengembalikan sebuah titik baru yang merupakan hasil refleksi titik sebelumnya terhadap sumbu y
    public Titik getRefleksiY(){
        Titik T = new Titik ();
        T.absis = absis * (-1);
        T.ordinat = ordinat;
        return T;
        }    
}
