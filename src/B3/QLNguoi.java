/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class QLNguoi {

    // Nhap thong tin
    public void nhapThongTinNguoi(ArrayList<Nguoi> lists) {
        // B1: Nhap thong tin( ten,tuoi,gioi tinh, nghe nghiep, que quan) Nguoi
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten:");
        String ten = sc.nextLine();
        System.out.println("Tuoi:");
        int tuoi = Integer.valueOf(sc.nextLine());
        System.out.println("Gioi tinh:");
        int gioiTinh = Integer.valueOf(sc.nextLine());
        System.out.println("Nghe nghiep:");
        String ngheNghiep = sc.nextLine();
        System.out.println("Que quan:");
        String queQuan = sc.nextLine();
        
        // B2: Gan gia tri cho doi tuong 
        Nguoi nguoi = new Nguoi(ten, tuoi, gioiTinh, queQuan, ngheNghiep);
        
        // B3: Them doi tuong vao list 
        lists.add(nguoi);
    }   

    // in thong tin
    public void inThongTinNguoi(ArrayList<Nguoi> lists) {
        for (Nguoi n : lists) {
            n.inThongTin();
        }
    }
}
