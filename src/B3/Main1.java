/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main1 {

    // De co the chay dc bat buoc phai co main
    public static void main(String[] args) {
        //Tạo class Main1: Nhập từ bàn phím thông tin của 1 sinh vien và 
        //in thông tin của sinh viên vừa nhập ra màn hình.
        Scanner sc = new Scanner(System.in);
        // B1:  Nhap maSV, hoTen, namSinh,chuyenNganh,diemTB cua SV
        System.out.print("Nhap MSSV:");
        String mssv = sc.nextLine();
        System.out.print("Nhap ho ten:");
        String hoTen = sc.nextLine();
        System.out.print("Nhap nam sinh:");
        int namSinh = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap chuyen nganh:");
        String chuyenNganh = sc.nextLine();
        System.out.println("Nhap diem:");
        double diemTB = Double.valueOf(sc.nextLine());
        // B2:Gan gia tri cua tung thuoc tinh cho doi tuong SV 
        // C1: contructor co tham so 
        SinhVien sv1 = new SinhVien(mssv, hoTen, namSinh, chuyenNganh, diemTB);
        // C2:contructor khong tham so 
        SinhVien sv = new SinhVien();
        // Thay doi gia tri : Setter
        sv.setMaSV(mssv);
        sv.setHoTen(hoTen);
        sv.setNamSinh(namSinh);
        sv.setChuyenNganh(chuyenNganh);
        sv.setDiemTB(diemTB);

        // In ra 
        sv.display();
    }
}
