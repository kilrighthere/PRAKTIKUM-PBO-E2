/* 
 * File : MysqlUtility.java
 * Deskripsi : Kelas ini digunakan untuk mengelola koneksi dengan basis data yang digunakan
 * Pembuat : Shakila Tungga Dewi
 * Tanggal : 25 Mei 2025
 */


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;

import java.sql.*;

/**
 *
 * @author asus
 */
public class MysqlUtility {
    private static Connection koneksi;
    
    public static Connection getConnection(){
        if (koneksi == null){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/Mahasiswa";
                String user = "root";
                String password = "12345678";
                koneksi = DriverManager.getConnection(url, user, password);
                if(koneksi !=null){
                    System.out.println("koneksi berhasil");
                }
            }catch(ClassNotFoundException one){
                System.out.println("Gagal load driver : " + one.getMessage());
            }catch(SQLException sqle){
                System.out.println("Gagal Koneksi : " + sqle.getMessage() );
            }
        }
        return koneksi;
    }
}
