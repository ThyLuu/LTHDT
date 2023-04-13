/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class DanhSachSP {
    private ArrayList<SanPham> ds = new ArrayList<>();
    
    public void chon(){
        Scanner sc = new Scanner(System.in);
        int chon = 0;
        do{
            System.out.println("=== CHON CHUC NANG ===");
            System.out.println("1. Nhap ds ho va ten");
            System.out.println("2. Sap xep giam dan");
            System.out.println("3. Hien thi danh sach SP");
            System.out.println("4. Tim va xoa SP");
            System.out.println("5. Gia tri trung binh cua SP");
            System.out.println("6. Thoat");
            System.out.println("Nhap so: ");
            chon = sc.nextInt();
            
            switch (chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    sapXep();
                    break;
                case 3:
                    xuat();
                    break;
                case 4:
                    xoa();
                    break;    
                case 5:
                    tinhTrungBinh();
                    break;  
                case 6:
                    break;   
                default:
                    System.out.println("Hay nhap lai");
            }
        }while(chon != 6);
    }
    
    public void nhap(){
        Scanner nhap = new Scanner(System.in);
        int i = 1;
        System.out.println("=== NHAP DANH SACH SAN PHAM === ");
        do {
            System.out.printf("Nhap ten sp thu %d: ", i);
            String ten = nhap.nextLine();
            if(ten == null || ten.equals(" ")){
                break;
            }
            i++;
            System.out.print("Gia sp: ");
            double gia = nhap.nextDouble();
            ds.add(new SanPham(ten, gia));
        }while(true);
    }
    
    public void sapXep(){
        Comparator<SanPham> sx = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o1.getGia(), o2.getGia());
            }
        };
        Collections.sort(ds, sx);
        xuat();
    } 
    
    public void xuat(){
        System.out.println("=== HIEN THI DANH SACH SAN PHAM");
        System.out.println("Ten SP \t\t Gia \t\t");
        for(SanPham sp : ds){
            System.out.printf("%s \t\t %.2f", sp.getClass(), sp.getGia());
        }
    }
    
    public void xoa(){
        Scanner xoa = new Scanner(System.in);
        System.out.print("Nhap ten SP can tim: ");
        String ten = xoa.nextLine();
        SanPham sp = null;
        for(SanPham sp1 : ds){
            if(sp1.getTenSP().equals(ten)){
                sp = sp1;
                break;
            }
        }
        if(sp != null){
            ds.remove(sp);
            System.out.println("Xoa thanh cong");
        }
        else{
            System.out.println("Khong tim thay SP");
        }
    }
    
    public void tinhTrungBinh(){
        double avg = 0;
        double sum = 0;
        for(SanPham sp : ds){
            sum += sp.getGia();
        }
        avg = sum / ds.size();
        System.out.println("Gia trung binh cua SP: ");
    }
}
