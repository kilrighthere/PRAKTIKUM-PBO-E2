/* Nama File    : Titik.java */
/* Deskripsi    : berisi main program class Titik*/
/* Pembuat      : Shakila Tungga Dewi*/
/* Tanggal      : 20 Februari 2025*/


public class MTitik {
    public static void main(String[] args){
        // membuat objek Titik baru T1
        Titik T1 = new Titik();

        // mengeset absis T1
        T1.setAbsis (3);

        // mengeset ordinat T1
        T1.setOrdinat(4);

        // menampilkan titik T1 
        System.out.print("Menampilkan Titik T1 : ");
        T1.printTitik();

        // Menggeser titik T1 sejauh x dan y
        T1.geser(3, 4);
        System.out.println("Menampilkan titik T1 setelah dilakukan penggeseran");
        T1.printTitik();

        // Obeject Reference
        // membuat objek baru T2
        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        // membuat objek baru T3
        Titik T3 = new Titik(3,4);
        T3.printTitik();

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        // System.out.println("Jumlah Objek Titik = "+ T2.getCounterTitik());

        System.out.println("Kuadaran dari T1 = "+T1.getKuadran());
        System.out.println("Jarak T1 dengan titik pusat = " + T1.getJarakPusat());
        System.out.println("Jarak T1 dengan T3 = " + T1.getJarak(T3));

        System.out.println("Merefleksikan T1 terhadap sumbu X");
        T1.refleksiX();
        System.out.print("T1 setelah direfleksi : ");
        T1.printTitik();
        System.out.println("Merefleksikan T1 terhadap sumbu Y");
        T1.refleksiY();
        System.out.print("T1 setelah direfleksi : ");
        T1.printTitik();
        
        Titik refleksiX = new Titik();
        Titik refleksiY = new Titik();

        refleksiX = T1.getRefleksiX();
        refleksiY = T1.getRefleksiY();

        System.out.println("titik baru hasil refleksi T1 terhadap sb.X = ");
        refleksiX.printTitik();
        System.out.println("titik baru hasil refleksi T1 terhadap sb.Y = ");
        refleksiY.printTitik();
        
    }    
}
