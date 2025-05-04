/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanVeryEasy;

/**
 *
 * @author asus
 */
public class Senjata {
    private String bunyi;
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
    }

    public String getBunyi() {
        return bunyi;
    }

    public int getPeluru() {
        return peluru;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
    
    public void menembak(){
        if(this.getPeluru()>0){
            System.out.println(this.getBunyi());
            this.setPeluru(this.getPeluru()-1);
            System.out.println("Sisa Peluru : "+this.getPeluru());
        }
        else{
            System.out.println("Peluru habis, isi peluru!");
        }
    }
    
}
