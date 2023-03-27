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
public class OnTapArrayList {
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author nguyenvv
 */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int a[]; // cú pháp trong nhập môn lập trình => kí hiệu mảng???
        // đặc điểm: khởi tạo độ dài của mảng 
        // ví dụ: tạo ra mảng lưu 10 số nguyên => độ dài mảng =11
        // vị trí trong mảng bắt đầu từ ??? 0 1 2 3 4 5 6 7 8 9 
        // ví dụ mảng có 10 phần tử => muốn them 1 phần tử nữa ??? liệu có thêm 
        // được không?
        // ArrayList : cũng là mảng
        // khởi tạo ArrayList lưu 10 số nguyên.
        // muốn thêm 1 phần tử nữa => ArrayList => tự động add phần tử đó vào 
        // cuối danh sách.=> số phần tử trong ArrayList là 11
        // ví dụ tạo ArrayList lưu các số nguyên.=> kiểu dữ liệu là int 
        // mảng là tập hợp chứa các phần tử có cùng kiểu dữ liệu
        // int và Integer  
        ArrayList<Integer> listInt = new ArrayList<>();
        // mảng này có bao nhiêu phần tử ???
        listInt.add(10);// thêm 1 phần tử vào trong ArrayList
        listInt.add(9);
        listInt.add(7);
        listInt.add(8);
        listInt.add(2);
        listInt.add(5);
        // độ dài của mảng.
        System.out.println("độ dài của mảng là : " + listInt.size());
        // duyệt mảng => dùng vòng lặp => for i = 0 i<n  i++ ; n là độ dài của mảng
        // list dòng 33 có độ dài listInt.size() = 2
        // lấy ra phần tử trong mảng => get(index)
        // phần tử ở vị trí số 2 trong mảng A => 
        // A.get(2) => lấy ra phần tử ở vị trí số 2 trong mảng
        // in ra phần tử tại vị trí thứ i=> 
        System.out.println("\nMảng ban đầu là: ");
        for (int i = 0; i < listInt.size(); i++) {
            System.out.print("\t" + listInt.get(i));
        }

//        listInt.remove(0);
//        System.out.println("\nMảng sau khi xoá lần 1 là: ");
//        for (int i = 0; i < listInt.size(); i++) {
//            System.out.print("\t"+ listInt.get(i));
//        }
//        listInt.remove(1);
//        System.out.println("\nMảng sau khi xoá là: ");
//        for (int i = 0; i < listInt.size(); i++) {
//            System.out.print("\t"+ listInt.get(i));
//        }
/*
// add() : thêm phần tử vào cuối danh sách
        // get(i): lấy ra phần tử thứ i trong danh sách
}
// size(): lấy ra độ dài của danh sách
        // remove() : xoá
in ra các số chẵn có trong mảng => điều kiện là số chẵn ???
    số a là số chẵn khi a % 2 == 0
phần tử thứ i trong mảng là số chẵn khi list.get(i) % 2 == 0
    in ra các số chẵn trong danh sách.
    tính tổng các số chẵn trong danh sách
B1: duyệt mảng
B2: kiểm tra chẵn/lẻ if-else
         */
//        System.out.println("số dư :" + listInt.get(1) % 2);
//        int tong = 0;
//        System.out.println("\n Các số chẵn là :");
//        for (int i = 0; i < listInt.size(); i++) {
//            if (listInt.get(i) % 2 == 0) {
////                System.out.print("\t" + listInt.get(i));
//                tong = tong + listInt.get(i);
//            }
//        }
        /*
        i =0 => 10 là số chẵn => tong = 0 + 10 =10;
        i= 1 => 9 là số lẻ
        i=2 => 7 là số lẻ 
        i=3 => 8 là số chẳn => tong = 10 + 8 = 18
        i =4 => 2 => là số chẵn => tong = 18+2 =20
        i=5 =>5 là số lẻ 
         */
//        System.out.println("Tổng là : " + tong);
// nhập vị trí cần xoá từ bàn phím.
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhập vị trí cần xoá :");
        int n = sc.nextInt();
        // nếu n > độ dài của mảng => có xoá được không ????
        // add() : thêm phần tử vào cuối danh sách
        // get(i): lấy ra phần tử thứ i trong danh sách
        // size(): lấy ra độ dài của danh sách
        // remove() : xoá
        listInt.remove(n);
        System.out.println("\nMảng sau khi xoá là: ");
        for (int i = 0; i < listInt.size(); i++) {
            System.out.print("\t" + listInt.get(i));
        }
        /*
        Bài 1: Nhập một mảng số nguyên từ bàn phím:
        In ra số phần tử của mảng
        In mảng vừa nhập ra bàn phím
        Tính tổng của các phần tử trong mảng
        Tính tích của các phần tử chia hết cho 5 trong mảng

        */
    }
}
