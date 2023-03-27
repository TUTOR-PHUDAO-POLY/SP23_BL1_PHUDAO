/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3;

/**
 *
 * @author hangnt
 */
public class SinhVien {
    // thuoc tinh <=> Bien
    // Tạo class SinhVien gồm các thuộc tính maSV-String , hoTen - String, 
    //namSinh - int , chuyenNganh - String , diemTB- double 
    //và các phương thức constructor, getter, setter và phương thức display(): void. 

    // Ca nhan => rieng tu => Khong phai ai cung biet => private 
    private String maSV;
    private String hoTen;
    private int namSinh;
    private String chuyenNganh;
    private double diemTB;

    // contructor : Khởi tạo 1 đối tượng (Object)
    // Có 2 loại contructor : 
    // + contructsốor không tham số
    // + contructor có tham số
    // Mặc định của 1 class => Là loại contructor không tham so 
    // Tuy nhiên nếu khi class đấy nó có 1 contructor có tham số rồi 
    // => Thi cái contructor mặc định (không tham số) nó KHÔNG CÒN TỒN TẠI 
    // Khi dung contructor khong tham so => Gia tri mac dinh cua tung kieu du lieu
    // String => null , int => 0, double/float:0.0
    public SinhVien() {
    }
//
    public SinhVien(String maSV, String hoTen, int namSinh, String chuyenNganh, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.chuyenNganh = chuyenNganh;
        this.diemTB = diemTB;
    }

    // Getter : Lấy giá trị của thuộc tính 
    public String getMaSV() {
        return maSV;
    }

    // Setter: Thay đổi giá trị của thuộc 
    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    // hien thi thong tin sinh vien
    public void display() {
        System.out.println(maSV);
        System.out.println(hoTen);
        System.out.println(namSinh);
        System.out.println(chuyenNganh);
        System.out.println(diemTB);
    }

}
