/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlkhosach;

import java.util.ArrayList;
import java.util.List;

public class NhaXBTask {
    List<NhaXB> lsNXB = new ArrayList<>();

    public NhaXBTask() {
        lsNXB.add(new NhaXB("1", "Dân Trí")); 
        lsNXB.add(new NhaXB("2", "Công Thương")); 
        lsNXB.add(new NhaXB("3", "Thế Giới")); 
        lsNXB.add(new NhaXB("4", "Trẻ")); 
        lsNXB.add(new NhaXB("5", "Thông tin và Truyền thông")); 
        lsNXB.add(new NhaXB("6", "Kim Đồng")); 
        lsNXB.add(new NhaXB("7", "Lao Động")); 
        lsNXB.add(new NhaXB("8", "Tổng hợp TPHCM"));
        lsNXB.add(new NhaXB("9", "Phụ nữ Việt Nam"));
        lsNXB.add(new NhaXB("10", "Phương Đông")); 
    }
    
    public int add(NhaXB nxb){
        lsNXB.add(nxb);
        return 1;
    }
    
    public List<NhaXB> getAllNXB(){
        return lsNXB;
    }
}
