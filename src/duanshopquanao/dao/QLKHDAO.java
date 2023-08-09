/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanshopquanao.dao;

import duanshopquanao.SQLConnect;
import duanshopquanao.model.QLKH;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author THIS MY PC
 */
public class QLKHDAO {

    public static List<QLKH> getALL() {
        List<QLKH> qlkh = new ArrayList<>();
        try {
            Connection con = SQLConnect.connectionSQL();
            String sql = "select * from KHACHHANG";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                QLKH kh = new QLKH();
                kh.setMaKH(rs.getString(1));
                kh.setTenKH(rs.getString(2));
                kh.setSoDT(rs.getInt(3));

                qlkh.add(kh);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return qlkh;
    }

    public static int insert(QLKH emp) {
        int rs = 0;
        try {
            Connection con = SQLConnect.connectionSQL();
            String sql = "insert into KHACHHANG values(?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, emp.getMaKH());
            st.setString(2, emp.getTenKH());
            st.setInt(3, emp.getSoDT());
            rs = st.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return rs;
    }

    public static int update(QLKH emp) {
        int rs = 0;
        try {
            Connection con = SQLConnect.connectionSQL();
            String sql = "update KHACHHANG set HOTENKH = ?, SĐT = ? where MAKH = ? ";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, emp.getTenKH());
            st.setInt(2, emp.getSoDT());
            st.setString(3, emp.getMaKH());
            rs = st.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }

    public static int delete(QLKH emp) {
        int rs = 0;
        try {
            Connection con = SQLConnect.connectionSQL();
            String sql = "delete from KHACHHANG where MAKH = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, emp.getMaKH());
            rs = st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }

}
