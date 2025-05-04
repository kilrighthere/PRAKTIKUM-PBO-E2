/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanVeryEasy;

/**
 *
 * @author asus
 */
public class TestSenjata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata ("DOR");
        
        System.out.println("Jumlah Peluru AK47 : " + ak47.getPeluru());
        System.out.println("AK47 mengisi peluru ");
        ak47.setPeluru(5);
        System.out.println("Jumlah Peluru AK47 : " + ak47.getPeluru());
        
        System.out.println("AK47 menembak");
        ak47.menembak();

        System.out.println();
        System.out.println("Jumlah Peluru m16 : " + m16.getPeluru());
        System.out.println("m16 mengisi peluru ");
        m16.setPeluru(5);
        System.out.println("Jumlah Peluru m16 : " + m16.getPeluru());
        
        System.out.println("m16 menembak");
        m16.menembak();
        
    }
    
}
