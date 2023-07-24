/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanshopquanao;

/**
 *
 * @author THIS MY PC
 */
public class QLKH {
    private String maKH,tenKH;
    private int soDT;
    private String ngayMuaHang,maHD;

    public QLKH() {
    }

    public QLKH(String maKH, String tenKH, int soDT, String ngayMuaHang, String maHD) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.soDT = soDT;
        this.ngayMuaHang = ngayMuaHang;
        this.maHD = maHD;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public int getSoDT() {
        return soDT;
    }

    public void setSoDT(int soDT) {
        this.soDT = soDT;
    }

    public String getNgayMuaHang() {
        return ngayMuaHang;
    }

    public void setNgayMuaHang(String ngayMuaHang) {
        this.ngayMuaHang = ngayMuaHang;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    
    
}
