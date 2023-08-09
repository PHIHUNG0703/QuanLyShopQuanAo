/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanshopquanao.model;

/**
 *
 * @author THIS MY PC
 */
public class QLHD {
    private String maHD,ngayXHD;
    private int tongTien,soLuong;
    private String maSP,maKH,maNV;
    private int giaSP;

    public QLHD() {
    }

    public QLHD(String maHD, String ngayXHD, int tongTien, int soLuong, String maSP, String maKH, String maNV, int giaSP) {
        this.maHD = maHD;
        this.ngayXHD = ngayXHD;
        this.tongTien = tongTien;
        this.soLuong = soLuong;
        this.maSP = maSP;
        this.maKH = maKH;
        this.maNV = maNV;
        this.giaSP = giaSP;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getNgayXHD() {
        return ngayXHD;
    }

    public void setNgayXHD(String ngayXHD) {
        this.ngayXHD = ngayXHD;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public int getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(int giaSP) {
        this.giaSP = giaSP;
    }

    
}
