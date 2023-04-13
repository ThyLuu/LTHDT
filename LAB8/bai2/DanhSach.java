/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class DanhSach {
    private ArrayList<String> ds = new ArrayList<>();
    
    public void menu(){
        Scanner sc = new Scanner(System.in);
        int chon = 0;
        do{
            System.out.println("=== CHON CHUC NANG ===");
            System.out.println("1. Nhap ds ho va ten");
            System.out.println("2. Hien thi ds");
            System.out.println("3. Xuat ds ngau nhien");
            System.out.println("4. Sap xep giam dan");
            System.out.println("5. Xoa");
            System.out.println("6. Thoat");
            System.out.print("Nhap so: ");
            chon = sc.nextInt();
            
            switch (chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    xuatRandom();
                    break;
                case 4:
                    sapXep();
                    break;    
                case 5:
                    xoa();
                    break;  
                case 6:
                    break;
                default:
                    System.out.println("Nhap so: ");
            }
        }while(chon != 6);
    }
    
    public void nhap(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("=== NHAP ===");
        while(true){
            System.out.print("Nhap va ten: ");
            String hoTen = nhap.nextLine();
            if(hoTen.isEmpty()){
                System.out.println("Nhap thanh cong");
                break;
            }
            ds.add(hoTen);
        }
    }
    
    public void xuat(){
        System.out.print("=== HIEN THI ===");
        for(String item : ds){
            System.out.println(item);
        }
    }
    
    public void xuatRandom(){
        Collections.shuffle(ds);
        xuat();
    }
    
    public void sapXep(){
        Collections.sort(ds);
        Collections.reverse(ds);
        xuat();
    }
    
    public void xoa(){
        Scanner xoa = new Scanner(System.in);
        System.out.println("=== XOA ===");
        System.out.println("Nhap ho va ten muon xoa: ");
        String hoTen = xoa.nextLine();
        for(String item : ds){
            if(item.equalsIgnoreCase(hoTen)){
                ds.remove(item);
                System.out.println("Xoa thanh cong");
                break;
            }
        }
    }
}
