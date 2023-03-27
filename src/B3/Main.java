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
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chucNang = 0;
        ArrayList<Nguoi>listNguoi = new ArrayList<>();
        // lap di lap lai => do..while.. while..
        do {
            System.out.println("1.Nhap");
            System.out.println("2.Xuat");
            System.out.println("Moi chon:");
            chucNang = Integer.valueOf(sc.nextLine());
            // menu => switch case
            switch (chucNang) {
                case 1: {
                    // Cach goi ham tu 1 class bat ki 
                    // new TenClassChuaHamCan().tenHam
                    new QLNguoi().nhapThongTinNguoi(listNguoi);
                    break;
                }
                case 2: {
                    new QLNguoi().inThongTinNguoi(listNguoi);
                    break;
                }
                case 0: {
                    break;
                }
                default: {
                    System.out.println("Chuc nang khon ton tai");
                    break;
                }
            }
        } while (chucNang != 0);
    }
}
