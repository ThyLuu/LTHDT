/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;

    public SanPham() {
    }
    
    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSp, double donGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = 0;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    
    public double getThueNhapKhau(){
        return donGia * 0.1;
    }
     
    public void xuat(){
        System.out.println("=== XUAT ===");
        System.out.println("Ten SP: "+tenSp);
        System.out.println("Don gia: "+donGia);
        System.out.println("Giam gia: "+giamGia);
        System.out.println("Thue nhap khau: "+getThueNhapKhau());
    }
    
    public void nhap(){
        System.out.println("=== NHAP ===");
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap ten SP: ");
        tenSp = nhap.nextLine();
        System.out.print("Don gia: ");
        donGia = nhap.nextDouble();
        System.out.print("Giam gia: ");
        giamGia = nhap.nextDouble();
    }
}
