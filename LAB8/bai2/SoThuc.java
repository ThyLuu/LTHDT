/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class SoThuc {
    private ArrayList<Double> list = new ArrayList<>();
    
    public void nhap(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap danh sach so thuc");
        while(true){
            System.out.print("Nhap so: ");
            Double x = nhap.nextDouble();
            list.add(x);
            nhap.nextLine();
            System.out.print("Nhap them (Y/N): ");
            if(nhap.nextLine().equals("N")){
                break;
            }
        }
    }
    
    public void xuat(){
        System.out.println("=== XUAT ===");
        for(Double item : list){
            System.out.println(" "+item);
        }
    }
}
