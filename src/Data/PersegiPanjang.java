package Data;
import Data.koneksi;
import java.sql.ResultSet;

public class PersegiPanjang extends abstrakClass {
    private double panjang, lebar, luas;
    private int id_bangun;
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    // halo
    public double hitungLuas(){
        this.luas = panjang*lebar;
        return luas;
    }
    public void simpanPersegiPanjang(int id_bangun,double luas) {
        koneksi db = new koneksi();
        this.id_bangun = id_bangun;
        this.luas = luas;
        String s = "insert into persegi_panjang (no_bangun, panjang, lebar, luas)"
        + "values ('"+this.id_bangun+"'" + ", '"+this.panjang+"', '"+this.lebar+"', '" +
        this.luas+"') ";
        db.query(s);
    }

    public void hapusPersegiPanjang() {
        koneksi db = new koneksi();
        String s = "Delete From persegi_panjang";
        db.query(s);
    }

    public void updatePersegiPanjang(int id_bangun,double luas) {
        koneksi db = new koneksi();
        this.id_bangun = id_bangun;
        this.luas = luas;
        String s1 = "update persegi_panjang set no_bangun = '"
        +this.id_bangun+"'" + ", panjang = '"+this.panjang+"', lebar = '"+this.lebar+"', luas= '" +
        this.luas+"' where no_bangun = '"+this.id_bangun+"'";
        db.query(s1);
    }
}

