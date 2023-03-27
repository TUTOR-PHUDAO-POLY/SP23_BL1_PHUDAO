/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_ArrayList_Menu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asus_vinh
 */
public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> danhSach;
        danhSach = new ArrayList<>();
//
//        danhSach.add(1);
//        danhSach.add(2);
//        danhSach.add(3);
//        danhSach.add(4);
//        
        System.out.println("nhap t: ");
        int t = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < t; i++) {
            System.out.print("nhap phan tu cua mang:");
            int v = Integer.valueOf(sc.nextLine());
            danhSach.add(v);
        }
        System.out.println(" so phan tu cua mang: " + danhSach.size());
        
        // in ra phan tu cua mang
        for (int i = 0; i < danhSach.size(); i++) {
            System.out.println("Phần tử tại vị trí " + i
                    + " = " + danhSach.get(i));
        }
        
        // tinh tong cac pha ntu cua mang
        int tong = 0;
        for (int i = 0; i < danhSach.size(); i++) {
            tong += danhSach.get(i);
        }
        System.out.println("tong: " + tong);
        
        // tinh tich cac phan tu cua mang chia het cho 5
        int tich = 1;
        for (int i = 0; i < danhSach.size(); i++) {
            if (i % 5 == 0) {
                tich *= danhSach.get(i);
            }

        }
        System.out.println("tich: " + tich);
    }
}
