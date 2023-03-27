/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_ArrayList_Menu;

import java.util.Scanner;

/**
 *
 * @author asus_vinh
 */
public class Bai2 {
//      Bài 2: Tạo 1 menu gồm các chức năng sau. Menu chỉ dừng lại khi chọn 0.
//Nhập vào số n. Tính tổng các số lẻ từ 1 tới n
//Nhập vào số n. Tính tích các số chẵn từ 1 tới n
//Nhập vào số nguyên. Kiểm tra xem đó là số chẵn hay lẻ
//     0. Thoát

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chucNang = 0;
        int n = 0;
        do {
            System.out.println("======================");
            System.out.println("1.Nhập vào số n. Tính tổng các số lẻ từ 1 tới n");
            System.out.println("2.Nhập vào số n. Tính tích các số chẵn từ 1 tới n");
            System.out.println("3.Nhập vào số nguyên. Kiểm tra xem đó là số chẵn hay lẻ");
            System.out.println("0.thoat");
            System.out.print("moi ban nhap chuc nang: ");
            chucNang = Integer.valueOf(sc.nextLine());

            switch (chucNang) {
                case 1:
                    System.out.print("nhap n: ");
                    n = Integer.valueOf(sc.nextLine());
                    int tong = 0;
                    // duyet mang
                    for (int i = 1; i <= n; i++) {

                        if (i % 2 != 0) {
                            tong += i;
                        }
                    }
                    System.out.println("tong: " + tong);
                    break;
                case 2:
                    System.out.print("nhap n: ");
                    n = Integer.valueOf(sc.nextLine());
                    int tich = 1;
                    for (int i = 1; i <= n; i++) {
                        if (i % 2 == 0) {
                            tich *= i;
                        }
                    }
                    System.out.println("tich la: " + tich);
                    break;
                case 3:
                    System.out.print("nhap n: ");
                    n = Integer.valueOf(sc.nextLine());
                    if(n % 2 ==0){
                        System.out.println("la so chan");
                    }else{
                        System.out.println("la so le");
                    }
                    break;
                case 0:

                    break;
                default:
                    System.out.println("chuc nang ko ton tai");
            }

        } while (chucNang != 0);
    }

}
