/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;
import Data.koneksi;
import java.sql.ResultSet;
/**
 *
 * @author DEWATA
 */
public class trapesium extends abstrakClass{
    private double panjangAtas, panjangBawah, tinggi, luas;
    private int id_trapesium;
    public trapesium(double panjangAtas, double panjangBawah, double tinggi){
        this.panjangAtas = panjangAtas;
        this.panjangBawah = panjangBawah;
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungLuas(){
        this.luas = ((panjangAtas+panjangBawah)*tinggi)/2;
        return luas;
    }
    
    public void simpanTrapesium(int id_trapesium, double luas){
        koneksi db = new koneksi();
        this.id_trapesium = id_trapesium;
        this.luas = luas;
        String s = "INSERT INTO trapesium (id_trapesium, panjang_atas, panjang_bawah, tinggi, luas)"
        + "VALUES ('"+this.id_trapesium+"', '"+this.panjangAtas+"', '"+this.panjangBawah+"', '" +this.tinggi+"', '"+ this.luas +"');";
        db.query(s);
    }
    
    public void hapusTrapesium() {
        koneksi db = new koneksi();
        String s = "Delete From trapesium";
        db.query(s);
    }
    
    public void updateTrapesium(int id_trapesium,double luas) {
        koneksi db = new koneksi();
        this.id_trapesium = id_trapesium;
        this.luas = luas;
        String s1 = "update trapesium set id_trapesium = '"
        +this.id_trapesium+"'" + ", panjang_atas = '"+this.panjangAtas+"', panjang_bawah = '"+this.panjangBawah+"', tinggi = '"
        + this.tinggi + "', luas = '" + this.luas+
        "' where id_trapesium = '"+this.id_trapesium+"'";
        db.query(s1);
    }
    
}
