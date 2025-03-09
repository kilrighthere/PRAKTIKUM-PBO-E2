// package PRAKTIKUM 3;
/*
* Nama file    : ExceptionOnArray.java
* Deskripsi    : Program penggunaan eksepsi menggunakan class library Java
* Pembuat      : Shakila Tungga Dewi/24060123120025
* Tanggal      : 6 Maret 2025
*/
public class ExceptionOnArray {
    public static void main(String[] args) {
        // instansiasi object array integer
        Integer[] arrayIntegers = new Integer[4];
        try{
            arrayIntegers[2]=11;
            arrayIntegers[4]=10;

        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code. . .");
        }
    }
}
