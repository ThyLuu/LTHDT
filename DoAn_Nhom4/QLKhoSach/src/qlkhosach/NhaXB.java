/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlkhosach;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class NhaXB extends Sach{
    private String maNXB;
    private String tenNXB;

    public NhaXB() {
    }

    public NhaXB(String maNXB, String tenNXB) {
        this.maNXB = maNXB;
        this.tenNXB = tenNXB;
    }

    public NhaXB(String maNXB, String tenNXB, String maSach, 
            String tenSach, String tacGia, Date ngayNhap, int soLuong, NhaXB nhaxb, TheLoai tl, KhuVuc kv) {
        super(maSach, tenSach, tacGia, ngayNhap, soLuong, nhaxb, tl, kv);
        this.maNXB = maNXB;
        this.tenNXB = tenNXB;
    }

    public String getMaNXB() {
        return maNXB;
    }

    public void setMaNXB(String maNXB) {
        this.maNXB = maNXB;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    @Override
    public String toString() {
        return this.tenNXB;
    }
}
