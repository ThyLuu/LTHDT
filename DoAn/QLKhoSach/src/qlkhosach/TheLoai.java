/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlkhosach;

import java.util.Date;

public class TheLoai extends Sach {
    private String maTL;
    private String tenTL;

    public TheLoai() {
    }

    public TheLoai(String maTL, String tenTL) {
        this.maTL = maTL;
        this.tenTL = tenTL;
    }

    public TheLoai(String maTL, String tenTL, String maSach, 
            String tenSach, String tacGia, Date ngayNhap, int soLuong, NhaXB nhaxb, TheLoai tl, KhuVuc kv) {
        super(maSach, tenSach, tacGia, ngayNhap, soLuong, nhaxb, tl, kv);
        this.maTL = maTL;
        this.tenTL = tenTL;
    }

    public String getMaTL() {
        return maTL;
    }

    public void setMaTL(String maTL) {
        this.maTL = maTL;
    }

    public String getTenTL() {
        return tenTL;
    }

    public void setTenTL(String tenTL) {
        this.tenTL = tenTL;
    }

    @Override
    public String toString() {
        return this.tenTL;
    }
    
}
