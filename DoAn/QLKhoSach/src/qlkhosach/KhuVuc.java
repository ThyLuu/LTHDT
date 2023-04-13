/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlkhosach;

import java.util.Date;

public class KhuVuc extends Sach{
    private String maKV;
    private String tenKV;

    public KhuVuc() {
    }

    public KhuVuc(String maKV, String tenKV) {
        this.maKV = maKV;
        this.tenKV = tenKV;
    }

    public KhuVuc(String maKV, String tenKV, String maSach, String tenSach, 
            String tacGia, Date ngayNhap, int soLuong, NhaXB nhaxb, TheLoai tl, KhuVuc kv) {
        super(maSach, tenSach, tacGia, ngayNhap, soLuong, nhaxb, tl, kv);
        this.maKV = maKV;
        this.tenKV = tenKV;
    }

    public String getMaKV() {
        return maKV;
    }

    public void setMaKV(String maKV) {
        this.maKV = maKV;
    }

    public String getTenKV() {
        return tenKV;
    }

    public void setTenKV(String tenKV) {
        this.tenKV = tenKV;
    }

    @Override
    public String toString() {
        return this.tenKV;
    }
}
