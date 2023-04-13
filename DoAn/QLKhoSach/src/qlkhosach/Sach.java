/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlkhosach;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import qlkhosach.NhaXB;
import qlkhosach.TheLoai;
import qlkhosach.KhuVuc;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private Date ngayNhap;
    private int soLuong;
    private NhaXB nhaxb;
    private TheLoai tl;
    private KhuVuc kv;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, String tacGia, 
            Date ngayNhap, int soLuong, NhaXB nhaxb, TheLoai tl, KhuVuc kv) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.ngayNhap = ngayNhap;
        this.soLuong = soLuong;
        this.nhaxb = nhaxb;
        this.tl = tl;
        this.kv = kv;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public NhaXB getNhaxb() {
        return nhaxb;
    }

    public void setNhaxb(NhaXB nhaxb) {
        this.nhaxb = nhaxb;
    }

    public TheLoai getTl() {
        return tl;
    }

    public void setTl(TheLoai tl) {
        this.tl = tl;
    }

    public KhuVuc getKv() {
        return kv;
    }

    public void setKv(KhuVuc kv) {
        this.kv = kv;
    }

    public String toString() {
        return "Book{" + "maSach=" + maSach + ", tenSach=" + tenSach + 
                ", tacGia=" + tacGia + ", ngayNhap=" + ngayNhap + 
                ", soLuong=" + soLuong + ", nhaxb=" + nhaxb + ", tl=" + tl + 
                ", kv=" + kv + '}';
    }
    
   

}
