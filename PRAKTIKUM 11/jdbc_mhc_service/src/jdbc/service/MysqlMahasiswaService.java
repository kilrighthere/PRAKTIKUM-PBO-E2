/* 
 * File : MysqlMahasiswaService.java
 * Deskripsi : Kelas ini berperan menyediakan layanan (service/controller) bagi program utama dalam mengelola basisdata
 * Pembuat : Shakila Tungga Dewi
 * Tanggal : 25 Mei 2025
 */



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.*;
import jdbc.service.*;
import jdbc.utilities.MysqlUtility;
import static jdbc.utilities.MysqlUtility.getConnection;

/**
 *
 * @author asus
 */
public class MysqlMahasiswaService {
    Connection koneksi = null;
    
    public MysqlMahasiswaService(){
        koneksi = getConnection();
    }
    
    public Mahasiswa makeMhsObject(){
            return new Mahasiswa();            
    }
    
    public void add (Mahasiswa mhs) throws SQLException{
        String query = "INSERT INTO Mahasiswa (id, nama) VALUES ("+mhs.getId()+",'"+mhs.getNama()+"')";
        try{
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("Berhasil Insert");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void update (Mahasiswa mhs) throws SQLException{
        String query = "UPDATE Mahasiswa SET nama ='"+mhs.getNama()+ "'WHERE id = "+ mhs.getId();
        try{
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("Berhasil Update");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void delete (int id) throws SQLException{
        String query = "DELETE FROM Mahasiswa WHERE id =" + id;
        try{
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("Berhasil Delete");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
        
    public Mahasiswa getById (int id) throws SQLException{
        Mahasiswa mhs = new Mahasiswa();
        String query = "SELECT * FROM Mahasiswa WHERE id = "+id;
        try{
            Statement s = koneksi.createStatement();
            ResultSet  rs = s.executeQuery(query);
            if (rs.next()){
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return mhs;
    }        
        
    
    public List<Mahasiswa> getAll () throws SQLException{
        List<Mahasiswa> mhsList = new ArrayList<>();
        String query = "SELECT * FROM Mahasiswa";
        try{
            Statement s = koneksi.createStatement();
            ResultSet  rs = s.executeQuery(query);
            while (rs.next()){
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
                mhsList.add(mhs);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return mhsList;
    }

    public void indexReset() throws SQLException{
        String query = "ALTER TABLE Mahasiswa AUTO INCREMENT = 1";
        try{
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("Berhasil Index Reset");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
    public boolean isEmpty(){
        String query = "SELECT COUNT(*) FROM Mahasiswa";
        try{
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            if (rs.next()){
                return rs.getInt(1)==0;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    
    public void closeConnection(){
        if (koneksi !=null){
            try{
                koneksi.close();
                System.out.println("Koneksi ditutup");
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
    
      
    
}
