package B1_OverviewLoop_DieuKien_NhapXuat;

import java.util.Scanner; // thu vien => An sctrl space => goi y tu dong import thu vien

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * 1. If...else : co nhieu lua chon if(dieu kien){ // muon lam gi thi
         * lam : code => Thoa man de bai }else{ // muon lam gi thi lam : code =>
         * Thoa man de bai } diem  <=10 va >9 : Xuat sac diem >8 va <=9 : Gioi
         * diem >7 va <=8 : Kha
         * ..
         * => else if if() // dk dau tien o giua co bao nhieu truong hop thi co
         * bang day else if dieu kien cuoi : else
         */

        //B1: Kiểm tra 1 số nguyên nhập vào từ bàn phím là số chẵn hay lẻ
        //scanf => C
//        Scanner sc = new Scanner(System.in); // nhap du lieu tu ban phim 
//        System.out.print("Nhap vao 1 so nguyen:");
//        int number = sc.nextInt(); // nextInt => Nhap so nguyen 
//        if (number % 2 == 0) {
//            System.out.println("Day la so chan");
//        } else {
//            System.out.println("Day la so le");
//        }

        /**
         * 3.Trong C : 3 loai vong lap : while(), do{}while(), for
         * 3.1. while
         * while(dieukien)
         * { // code gi thi code }
         * 3.2. do..while 
         * do{ 
         * // code gi thi code }
         * while(dieu kien); 
         * 3.3. for 
         * for(khoi tao gia tri bien, dieukien,buoc nhay)
         * { // code }
         */
        
        // Bài 2: Nhập số nguyên dương n tính tổng các số từ 1-n
        //  Nhap
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhap so:");
//        int number = sc.nextInt();
//        // float : nextFloat, double : nextDouble...
//        //  Tinh tong 
//        int sum = 0;
//        for(int i = 1; i<=number;i++){
//            sum+=i;
//        }
//        System.out.println("Sum = "+sum);
        // n = 5 => 1+2+3+4+5
        
//        Bài 3: Nhập số nguyên dương n (0<n<20) tính tổng các số chẵn từ 1-n.
//        Scanner sc = new Scanner(System.in);
//        int n = 0;
//        do {
//            System.out.print("nhap n: ");
//            n = sc.nextInt();
//        } while (n < 0 || n > 20);
//        int tong = 0;
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 == 0) {
//                tong += i;
//            }
//        }
//        System.out.println("Tong: " + tong);

//        Bài 4: Nhập số nguyên dương n  tính tích các số lẻ từ 1-n.
//        System.out.print("nhap n: ");
//        int n = sc.nextInt();
//        int tich = 1;
//        for (int i = 1; i <= n; i++) {
//            if(i % 2 != 0){
//                tich *= i;
//            }
//        }
//        System.out.println("tich la: " + tich);

        /**
         * 3. switch..case 
         * => nam, thang, dung nhieu nhat voi ban menu.
         * Cu phap:
         * switch(dieukien){ 
         *      case giaTri:{ 
         *          // code gi thi code
         *          break; 
         *      }
         *      .... 
         *      default:{
         *          // code // nhung truong hop khong vao case thi se xuong default 
         *      break;
         *      } 
         * }
         */
        
        //Bài 5: Nhập vào 1 số nguyên dương và kiểm tra đó thuộc tháng nào trong năm
//            Scanner scan = new Scanner(System.in);
//            System.out.print("Nhap so :");
//            printf(""): khong xuong dong => viet lien \n
//            System.out.println("");
//            int thang = scan.nextInt();
//            // 1 nam => 12 thang :
//            switch(thang){
//                case 1:{
//                    // ket thuc moi case => la break
//                    System.out.println("Thang thu nhat");
//                    break;
//                }
//                case 2:{
//                    System.out.println("Thang thu hai ");
//                    break;
//                }
//                // 12 thang => 12 case 
//                // Ket thuc switch => la default 
//                default:{
//                    System.out.println("Khong thuoc thang nao trong nam ");
//                    break;
//                }
//            }

        /**
         * 4. Nhập xuất dữ liệu từ bàn scanf => Scanner : Nhap du lieu tu ban
         * phim Scanner tenBien = new Scanner(System.in);
         */
        //Scanner sc = new Scanner(System.in);
        //Scanner sc1 = new Scanner(System.in);
        /**
         * so nguyen-int => tenBien.nextInt() so thuc - float =>
         * tenBien.nextFloat() double =>tenBien.nextDouble() chuoi - String =>
         * tenBien.next() hoac tenBien.nextLine()
         */
        
        //VD:Nhap 1 so nguyen, 1 so float, double. Nhap 1 chuoi tu ban phim 
        // In tat ca ra man hinh 
//        Scanner s = new Scanner(System.in);
        // Nhap so
//        System.out.println("Nhap so nguyen");
//        int n = s.nextInt();
//        System.out.println("Nhap so thuc float:");
//        float n1 = s.nextFloat();
//        System.out.println("Nhap so double:");
//        double n2 = s.nextDouble();
         // Xu ly troi lenh : Enter
//         s.nextLine();
        // Nhap chuoi
//        System.out.println("Nhap chuoi:");
        // next => Khi gap space => Ngat k doc dc nua
//        String str = s.nextLine();
//        System.out.println(n);
//        System.out.println(n1);
//        System.out.println(n2);
//        System.out.println(str);
        // Loi bo nho dem : fflush(stdin): Nhap so => Nhap chuoi
        // Co 2 cach de xu ly :
        // C1: Them 1 dong s.nextLine(): O giua doan nhap so va nhap chuoi
        // C2: Coi tat ca moi thu nhap vao tu ban phim la chuoi (.nextLine())
        // Roi sau day se ep kieu ve kieu du lieu tuong ung
        // C2:
//        System.out.println("Nhap so nguyen:");
        // B1: Nhap chuoi vao ban phim
//        String soStr = s.nextLine();
        // B2: Ep kieu ve kieu du lieu tuong ung: Chuoi (String) => So Nguyen(int)
        // String => int 
//        int number = Integer.valueOf(soStr); // day la cach ep kieu trong Java 
        //int number = Integer.valueOf(s.nextLine());
//        System.out.println("Nhap chuoi:");
//        String str = s.nextLine();
//        System.out.println("In ra:");
//        System.out.println(number);
//        System.out.println(str);
        //Bài 6: Nhập thông tin gồm tên , tuổi, địa chỉ, điểm của bản thân và in ra .
         Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten: ");
        String ten = sc.nextLine();
        System.out.print("nhap tuoi: ");
        int tuoi = Integer.valueOf(sc.nextLine());
        System.out.print("nhap dia chi: ");
        String diaChi = sc.nextLine();
        System.out.print("nhap diem: ");
        int diem = Integer.valueOf(sc.nextLine());
        System.out.print("nhap truong hoc: ");
        String truongHoc = sc.nextLine();

        System.out.println("ten: " + ten + " || tuoi: "
                + tuoi + " || dia chi: " + diaChi + " || diem: "
                + diem + " || truong hoc: " + truongHoc);
    }
            

}
