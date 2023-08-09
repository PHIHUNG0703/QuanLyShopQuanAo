/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanshopquanao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author THIS MY PC
 */
public class SQLConnect {

    public static Connection connectionSQL() {
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=QUANLYSHOPQUANAO;user=TRANQUOCTHINH;password=0845710208;encrypt=true;trustServerCertificate=true;";
        try {
            Connection con = DriverManager.getConnection(connectionUrl);
            return con;
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
        return null;
    }
}
