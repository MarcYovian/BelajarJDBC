
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DEWATA
 */
public class koneksi {
    private String dbuser = "root";
    private String dbpsswd = "";
    private Statement stmt = null;
    private Connection con = null;
    private ResultSet rs = null;
    
    public koneksi(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bangun_datar", 
                dbuser, 
                dbpsswd
            );
            stmt = con.createStatement();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,""+e.getMessage(), 
            "JDBCDriver Error", JOptionPane.WARNING_MESSAGE);
        }

    }

    public ResultSet getData(String sQLString) {
        try {
            rs = stmt.executeQuery(sQLString);
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null,
             "Error"+e.getMessage(), "CommunicationError", 
             JOptionPane.WARNING_MESSAGE);
        }
        return rs;
    }

    public void query(String sQLString) {
        try {
            int i = stmt.executeUpdate(sQLString);
            if(i>0){
                JOptionPane.showMessageDialog(null,"Data Tersimpan");
            }else{
                JOptionPane.showMessageDialog(null,"Error");
            }
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, "Error : "+ e.getMessage(), 
            "ExecuteUpdateError", JOptionPane.WARNING_MESSAGE);
        }
    }
}
