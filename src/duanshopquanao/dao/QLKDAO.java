/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanshopquanao.dao;

import duanshopquanao.SQLConnect;
import duanshopquanao.model.QLK;
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
public class QLKDAO {
     public static List<QLK> getALL() {
        List<QLK> qlk = new ArrayList<>();
        try {
            Connection con = SQLConnect.connectionSQL();
            String sql = "select * from KHO";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                QLK k = new QLK();
                k.setMaKho(rs.getString(1));
                k.setMaSP(rs.getString(2));
                k.setNgayNhapKho(rs.getString(3));
                k.setSoLuongNhapKho(rs.getInt(4));
                k.setNgaXuatKho(rs.getString(5));
                k.setSoLuongXuatKho(rs.getInt(6));
                k.setSize(rs.getString(7));
                qlk.add(k);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return qlk;
    }
     public static int insert(QLK emp) {
        int rs = 0;
        try {
            Connection con = SQLConnect.connectionSQL();
            String sql = "insert into KHO values(?,?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, emp.getMaKho());
            st.setString(2, emp.getMaSP());
            st.setString(3, emp.getNgayNhapKho());
            st.setString(4, Integer.toString(emp.getSoLuongNhapKho()));
            st.setString(5, emp.getNgaXuatKho());
            st.setString(6, Integer.toString(emp.getSoLuongXuatKho()));
            st.setString(7, emp.getSize());
            rs = st.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return rs;
    }
     public static int update(QLK emp){
        int rs = 0;
        try {
            Connection con = SQLConnect.connectionSQL();
            String sql = "update KHO set MASP = ?, NGAYNHAPKHO = ?,SOLUONGNHAP = ?, NGAYXUATKHO = ?, SOLUONGXUAT = ?, SIZE = ? where MAKHO = ? ";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, emp.getMaSP());
            st.setString(2, emp.getNgayNhapKho());
            st.setInt(3,emp.getSoLuongNhapKho());
            st.setString(4, emp.getNgaXuatKho());
            st.setInt(5, emp.getSoLuongXuatKho());
            st.setString(6, emp.getSize());
            st.setString(7, emp.getMaKho());
            rs = st.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }
     public static int delete(QLK emp){
        int rs = 0;
        try {
            Connection con = SQLConnect.connectionSQL();
            String sql = "delete from KHO where MAKHO = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, emp.getMaSP());
            rs = st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }

}
