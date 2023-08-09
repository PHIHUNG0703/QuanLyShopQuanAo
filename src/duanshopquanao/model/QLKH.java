/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanshopquanao.model;

/**
 *
 * @author THIS MY PC
 */
public class QLKH {
    private String maKH,tenKH;
    private int soDT;
    

    public QLKH() {
    }

    public QLKH(String maKH, String tenKH, int soDT) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.soDT = soDT;
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

   
    
    
}
