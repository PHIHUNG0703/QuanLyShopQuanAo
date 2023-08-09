package duanshopquanao.dao;

import duanshopquanao.SQLConnect;
import duanshopquanao.model.QLNV;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author THIS MY PC
 */
public class QLNVDAO {

    public static List<QLNV> getALL() {
        List<QLNV> qlnv = new ArrayList<>();
        try {
            Connection con = SQLConnect.connectionSQL();
            String sql = "select * from NHANVIEN";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                QLNV nv = new QLNV();
                nv.setMaNV(rs.getString(1));
                nv.setTenNV(rs.getString(2));
                nv.setChucVu(rs.getString(3));
                nv.setLuong(rs.getFloat(4));
                qlnv.add(nv);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return qlnv;
    }

    public static int insert(QLNV emp) {
        int rs = 0;
        try {
            Connection con = SQLConnect.connectionSQL();
            String sql = "insert into NHANVIEN values(?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, emp.getMaNV());
            st.setString(2, emp.getTenNV());
            st.setString(3, emp.getChucVu());
            st.setString(4, Double.toString(emp.getLuong()));
            rs = st.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return rs;
    }
    public static int update(QLNV emp){
        int rs = 0;
        try {
            Connection con = SQLConnect.connectionSQL();
            String sql = "update NHANVIEN set HOTENNV = ?, CHUCVU = ?,LUONG = ? where MANV = ? ";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, emp.getTenNV());
            st.setString(2, emp.getChucVu());
            st.setString(3, Double.toString(emp.getLuong()));
            st.setString(4, emp.getMaNV());
            rs = st.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    public static int delete(QLNV emp){
        int rs = 0;
        try {
            Connection con = SQLConnect.connectionSQL();
            String sql = "delete from NHANVIEN where MANV = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, emp.getMaNV());
            rs = st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
    
}
