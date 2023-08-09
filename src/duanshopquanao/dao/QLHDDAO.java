/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanshopquanao.dao;

import duanshopquanao.SQLConnect;
import duanshopquanao.model.QLHD;
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
public class QLHDDAO {
     public static List<QLHD> getALL() {
        List<QLHD> qlhd = new ArrayList<>();
        try {
            Connection con = SQLConnect.connectionSQL();
            String sql = "select * from HOADON";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                QLHD hd = new QLHD();
                hd.setMaHD(rs.getString(1));
                hd.setNgayXHD(rs.getString(2));
                hd.setTongTien(rs.getInt(3));
                hd.setSoLuong(rs.getInt(4));
                hd.setMaSP(rs.getString(5));
                hd.setMaKH(rs.getString(6));
                hd.setMaNV(rs.getString(7));
                qlhd.add(hd);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return qlhd;
    }
     public static int insert(QLHD emp) {
        int rs = 0;
        try {
            Connection con = SQLConnect.connectionSQL();
            String sql = "insert into HOADON values(?,?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, emp.getMaHD());
            st.setString(2, emp.getNgayXHD());
            st.setInt(3, emp.getTongTien());
            st.setInt(4,emp.getSoLuong());
             st.setString(5, emp.getMaSP());
              st.setString(6, emp.getMaKH());
               st.setString(7, emp.getMaNV());
            rs = st.executeUpdate();
            con.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }

        return rs;
    }
      public static int update(QLHD emp){
        int rs = 0;
        try {
            Connection con = SQLConnect.connectionSQL();
            String sql = "update HOADON set NGAYXHD = ?, TONGTIEN = ?,SOLUONG = ?, MASP = ?, MAKH = ?, MANV = ? where MAHD = ? ";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, emp.getNgayXHD());
            st.setString(2, Integer.toString(emp.getTongTien()));
            st.setString(3, Integer.toString(emp.getSoLuong()));
            st.setString(4, emp.getMaSP());
            st.setString(5, emp.getMaKH());
            st.setString(6, emp.getMaNV());
            st.setString(7, emp.getMaHD());
            rs = st.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }
       public static int delete(QLHD emp){
        int rs = 0;
        try {
            Connection con = SQLConnect.connectionSQL();
            String sql = "delete from HOADON where MAHD = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, emp.getMaNV());
            rs = st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }
       public static List<QLHD> upSort() {
        List<QLHD> qlhd = new ArrayList<>();
        try {
            Connection con = SQLConnect.connectionSQL();
            String sql = "select * from HOADON \n" +"order by SOLUONG asc";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                QLHD hd = new QLHD();
                hd.setMaHD(rs.getString(1));
                hd.setNgayXHD(rs.getString(2));
                hd.setTongTien(rs.getInt(3));
                hd.setSoLuong(rs.getInt(4));
                hd.setMaSP(rs.getString(5));
                hd.setMaKH(rs.getString(6));
                hd.setMaNV(rs.getString(7));
                qlhd.add(hd);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return qlhd;
    }
        public static List<QLHD> downSort() {
        List<QLHD> qlhd = new ArrayList<>();
        try {
            Connection con = SQLConnect.connectionSQL();
            String sql = "select * from HOADON \n" +"order by SOLUONG desc";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                QLHD hd = new QLHD();
                hd.setMaHD(rs.getString(1));
                hd.setNgayXHD(rs.getString(2));
                hd.setTongTien(rs.getInt(3));
                hd.setSoLuong(rs.getInt(4));
                hd.setMaSP(rs.getString(5));
                hd.setMaKH(rs.getString(6));
                hd.setMaNV(rs.getString(7));
                qlhd.add(hd);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return qlhd;
    }
}
