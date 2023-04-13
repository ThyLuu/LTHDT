/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlkhosach;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class SachTask {
    List<Sach> lsB = new ArrayList<>();
    
    public int add(Sach b){
        lsB.add(b);
        return 1;
    }
    
    public int del(String id){
        Sach b = findByID(id);  
        if(b != null){
            lsB.remove(b);
            return 1;
        }
        return -1;
    }
    
    public int count(){
        return lsB.size();
    }
    
    public List<Sach> getAllBook(){
        return lsB;
    }
    
    public Sach findByID(String id){
        for(Sach b : lsB){
            if(b.getMaSach().equalsIgnoreCase(id)){
                return b;
            }
        } 
        return null;
    }
    
    public Sach findByName(String name){
        for(Sach b : lsB){
            if(b.getTenSach().equalsIgnoreCase(name)){
                return b;
            }
        }
        return null;
    }
    
    public Sach getBookAtPoint(int position){
        return lsB.get(position);
    }
    
    public int edit(Sach bNew){
        for(Sach b : lsB){
            if (b.getMaSach().equalsIgnoreCase(bNew.getMaSach())){
                b.setTenSach(bNew.getTenSach());
                b.setTacGia(bNew.getTacGia());
                b.setSoLuong(bNew.getSoLuong());
                b.setNgayNhap(bNew.getNgayNhap());
                b.setNhaxb(b.getNhaxb());
                b.setTl(b.getTl());
                b.setKv(b.getKv());
                return 1;
            }
        }
        return -1;
    }
}    
