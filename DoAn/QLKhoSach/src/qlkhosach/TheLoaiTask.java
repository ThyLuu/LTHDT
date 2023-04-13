/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlkhosach;

import java.util.ArrayList;
import java.util.List;

public class TheLoaiTask {
    List<TheLoai> lsTL = new ArrayList<>();

    public TheLoaiTask() {
        lsTL.add(new TheLoai("1", "Giáo Trình")); 
        lsTL.add(new TheLoai("2", "Tiểu Thuyết")); 
        lsTL.add(new TheLoai("3", "Thiếu Nhi")); 
        lsTL.add(new TheLoai("4", "Văn học Nghệ Thuật")); 
        lsTL.add(new TheLoai("5", "Chính trị - Pháp luật")); 
        lsTL.add(new TheLoai("6", "Khoa học Công Nghệ")); 
        lsTL.add(new TheLoai("7", "Truyện")); 
        lsTL.add(new TheLoai("8", "Tâm lý")); 
    }
    
    public int add(TheLoai tl){
        lsTL.add(tl);
        return 1;
    }
    
    public List<TheLoai> getAllTL(){
        return lsTL;
    }
}
