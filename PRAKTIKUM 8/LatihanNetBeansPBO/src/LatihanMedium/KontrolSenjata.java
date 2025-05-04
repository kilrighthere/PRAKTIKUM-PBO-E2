/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanMedium;

/**
 *
 * @author asus
 */
public class KontrolSenjata {
    Senjata senjata;
    
    public KontrolSenjata(Senjata senjata){
        this.senjata = senjata;
    }
    
    public boolean isAdaPeluru(){
        if(this.senjata.getPeluru()>0){
            return true;
        }
        else {
            return false;
        }
    }
    
    public void isiPeluru(int jumlahPeluru){
        this.senjata.setPeluru(senjata.getPeluru()+jumlahPeluru);
        System.out.println("Peluru berhasil ditambahan : "+ jumlahPeluru);
    }
    
    public void menembak(int jumlah){
        System.out.println("Siap menembak "+jumlah + " kali");
        if(isAdaPeluru()){
            for(int i = jumlah; i>0; i--){
                if(isAdaPeluru()){
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru()-1);
                }
                else{
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            }
            System.out.println(">> Peluru sisa : " + senjata.getPeluru());
        }
        else{
            System.out.println("Peluru Habis");
        }
    }
    
    
    public void pasangBayonet(){
        senjata.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
    
    public String menusuk(){
        if(senjata.isMenusuk()){
            return "Jleb!";
            
        }
        else{
            return "Gagal, belum pasang bayonet";
        }
    }
    
    
}
