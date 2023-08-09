/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanshopquanao.dao;

import duanshopquanao.SQLConnect;
import duanshopquanao.model.QLSP;
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
public class QLSPDAO {
    public static List<QLSP> getALL() {
        List<QLSP> qlnv = new ArrayList<>();
        try {
            Connection con = SQLConnect.connectionSQL();
            String sql = "select * from SANPHAM";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                QLSP nv = new QLSP();
                nv.setMaSP(rs.getString(1));
                nv.setTenSP(rs.getString(2));
                nv.setSoLuong(rs.getInt(3));
                nv.setGia(rs.getInt(4));
                nv.setSize(rs.getString(5));
                nv.setHinh(rs.getString(6));
                qlnv.add(nv);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return qlnv;
    }
     public static int insert(QLSP emp) {
        int rs = 0;
        try {
            Connection con = SQLConnect.connectionSQL();
            String sql = "insert into SANPHAM values(?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, emp.getMaSP());
            st.setString(2, emp.getTenSP());
            st.setInt(3, emp.getSoLuong());
            st.setInt(4, emp.getGia());
            st.setString(5, emp.getSize());
            st.setString(6, emp.getHinh());
            rs = st.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return rs;
    }
     public static int update(QLSP emp){
        int rs = 0;
        try {
            Connection con = SQLConnect.connectionSQL();
            String sql = "update SANPHAM set TENSP = ?, SOLUONG = ?,GIÁ = ?, SIZE = ?, HINH = ? where MASP = ? ";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, emp.getTenSP());
            st.setInt(2, emp.getSoLuong());
            st.setInt(3,emp.getGia());
            st.setString(4, emp.getSize());
            st.setString(5, emp.getHinh());
            st.setString(6, emp.getMaSP());
            rs = st.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }
       public static int delete(QLSP emp){
        int rs = 0;
        try {
            Connection con = SQLConnect.connectionSQL();
            String sql = "delete from SANPHAM where MASP = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, emp.getMaSP());
            rs = st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }
        public static List<QLSP> upSort() {
        List<QLSP> qlnv = new ArrayList<>();
        try {
            Connection con = SQLConnect.connectionSQL();
            String sql = "select * from SANPHAM \n" +"order by SOLUONG asc";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                QLSP nv = new QLSP();
                nv.setMaSP(rs.getString(1));
                nv.setTenSP(rs.getString(2));
                nv.setSoLuong(rs.getInt(3));
                nv.setGia(rs.getInt(4));
                nv.setSize(rs.getString(5));
                 nv.setHinh(rs.getString(6));
                qlnv.add(nv);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return qlnv;
    }
        public static List<QLSP> downSort() {
        List<QLSP> qlnv = new ArrayList<>();
        try {
            Connection con = SQLConnect.connectionSQL();
            String sql = "select * from SANPHAM \n" +"order by SOLUONG desc";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                QLSP nv = new QLSP();
                nv.setMaSP(rs.getString(1));
                nv.setTenSP(rs.getString(2));
                nv.setSoLuong(rs.getInt(3));
                nv.setGia(rs.getInt(4));
                nv.setSize(rs.getString(5));
                 nv.setHinh(rs.getString(6));
                qlnv.add(nv);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return qlnv;
    }
}
