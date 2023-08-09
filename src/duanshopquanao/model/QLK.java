/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanshopquanao.model;

/**
 *
 * @author THIS MY PC
 */
public class QLK {
    private String maKho,maSP,ngayNhapKho;
    private int soLuongNhapKho;
    private String ngaXuatKho;
     private int soLuongXuatKho;
     private String size;

    public QLK() {
    }

    public QLK(String maKho, String maSP, String ngayNhapKho, int soLuongNhapKho, String ngaXuatKho, int soLuongXuatKho, String size) {
        this.maKho = maKho;
        this.maSP = maSP;
        this.ngayNhapKho = ngayNhapKho;
        this.soLuongNhapKho = soLuongNhapKho;
        this.ngaXuatKho = ngaXuatKho;
        this.soLuongXuatKho = soLuongXuatKho;
        this.size = size;
    }

    public String getMaKho() {
        return maKho;
    }

    public void setMaKho(String maKho) {
        this.maKho = maKho;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNgayNhapKho(String ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }

    public int getSoLuongNhapKho() {
        return soLuongNhapKho;
    }

    public void setSoLuongNhapKho(int soLuongNhapKho) {
        this.soLuongNhapKho = soLuongNhapKho;
    }

    public String getNgaXuatKho() {
        return ngaXuatKho;
    }

    public void setNgaXuatKho(String ngaXuatKho) {
        this.ngaXuatKho = ngaXuatKho;
    }

    public int getSoLuongXuatKho() {
        return soLuongXuatKho;
    }

    public void setSoLuongXuatKho(int soLuongXuatKho) {
        this.soLuongXuatKho = soLuongXuatKho;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
     
     
    
}
