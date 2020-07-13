/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import connectDB.ConnetionDB;
import static connectDB.test.conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author longvo
 */
public class DAO {

    static Connection conn;
    static ConnetionDB temp = new ConnetionDB();

    public ArrayList<DTO> getAdmin() {
        ArrayList<DTO> listadmins = new ArrayList<>();

        try {
            conn = temp.connect();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM admins");

            while (rs.next()) {
                DTO admins = new DTO();
                admins.setUsername(rs.getString("Username"));
                admins.setPassword(rs.getString("Password"));
                admins.setClassname(rs.getString("Classname"));
                listadmins.add(admins);
            }
            for (DTO admins : listadmins) {
                System.out.println(admins.getUsername() + admins.getClassname() + admins.getPassword());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return listadmins;
    }

    public static void UpdateAdmins(DTO admins) {
        try {
            conn = temp.connect();
            PreparedStatement stmt = conn.prepareStatement("UPDATE admins set Password=?,Classname=? where Username = ? ");
            stmt.setString(3, admins.getUsername());
            stmt.setString(1, admins.getPassword());
            stmt.setString(2, admins.getClassname());
            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void insetAdmins(DTO admins) {
        try {
            conn = temp.connect();
            PreparedStatement stmt = conn.prepareStatement("Insert into admins values(?, ?, ?)");
            stmt.setString(1, admins.getUsername());
            stmt.setString(2, admins.getPassword());
            stmt.setString(3, admins.getClassname());
            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void deleteAdmins(String Username) {
        try {
            conn = temp.connect();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM admins WHERE Username =? ");
            stmt.setString(1, Username);

            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
