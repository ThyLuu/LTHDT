/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlkhosach;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class KhuVucTask {
    List<KhuVuc> lsKV = new ArrayList<>();
    
    public KhuVucTask() {
        lsKV.add(new KhuVuc("1", "Dãy D1 - Khu Giáo Trình"));
        lsKV.add(new KhuVuc("2", "Dãy D2 - Khu Tiểu thuyết")); 
        lsKV.add(new KhuVuc("3", "Dãy D3 - Khu Thiếu Nhi")); 
        lsKV.add(new KhuVuc("4", "Dãy D4 - Khu Văn Học Nghệ Thuật"));
        lsKV.add(new KhuVuc("5", "Dãy D5 - Khu Chính Trị - Pháp Luật")); 
        lsKV.add(new KhuVuc("6", "Dãy D6 - Khu Khoa Học Công Nghệ"));
        lsKV.add(new KhuVuc("7", "Dãy D7 - Khu Truyện")); 
        lsKV.add(new KhuVuc("8", "Dãy D8 - Khu Tâm Lý"));
        lsKV.add(new KhuVuc("9", "Kho 1"));
        lsKV.add(new KhuVuc("10", "Kho 2"));
        lsKV.add(new KhuVuc("11", "Kho 3"));
    }
    
    public int add(KhuVuc kv){
        lsKV.add(kv);
        return 1;
    }
    
    public List<KhuVuc> getAllKV(){
        return lsKV;
    }
}
