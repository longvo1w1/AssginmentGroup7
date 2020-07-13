/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author longvo
 */
public class ConnetionDB {


    public  Connection connect() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
             DriverManager.getConnection("jdbc:mysql://localhost/wed", "root", "");
            System.out.println("Success");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return DriverManager.getConnection("jdbc:mysql://localhost/wed", "root", "");

    }


}
