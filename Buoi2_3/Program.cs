
namespace Buoi2_3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*
             *  Tạo class DienThoai 
             *  gồm các thông tin: tên, hãng - String , mau - String , boNho - int , gia - int 
             *  và các phương thức constructor, property và InThongTin(): void
             * Tạo class QLDienThoai sử dụng List<DienThoai> . Các chức năng viết trong class này
                Tạo Class Program: trong hàm Main() tạo menu lặp đi lặp lại tới khi chọn 0  và làm các chức năng:
	                1.Nhập thông tin điện thoại
	                2.In các thông tin ra màn hình
	                0.Thoát
             */
            #region Khai báo và khởi tạo đối tượng
            // Khai báo và khởi tạo đối tượng điện thoại
            // Constructor không tham số
            //DienThoai dienThoai = new DienThoai();
            // Trước khi gán
            //dienThoai.InThongTin();

            //dienThoai.Ten = "a"; // gán giá trị
            //dienThoai.Hang = "a"; // gán giá trị
            //dienThoai.Mau = "a"; // gán giá trị
            //dienThoai.BoNho = 11; // gán giá trị
            //dienThoai.Gia = 10; // gán giá trị

            // Sau khi gán
            //dienThoai.InThongTin();

            // Nhập vào gán giá trị cho từng thuộc tính của đối tượng
            //Console.Write("Nhập tên: ");
            //dienThoai.Ten = Console.ReadLine(); // nhập và gán giá trị
            //Console.Write("Nhập hãng: ");
            //dienThoai.Hang = Console.ReadLine(); // nhập và gán giá trị
            //Console.Write("Nhập màu: ");
            //dienThoai.Mau = Console.ReadLine(); // nhập và gán giá trị
            //Console.Write("Nhập bộ nhớ: ");
            //dienThoai.BoNho = Convert.ToInt32(Console.ReadLine()); // nhập và gán giá trị
            //Console.Write("Nhập giá: ");
            //dienThoai.Gia = Convert.ToInt32(Console.ReadLine()); // nhập và gán giá trị

            #endregion

            QLDienThoai qLDienThoai = new QLDienThoai();

            while (true)
            {
                // Tạo MENU
                Console.WriteLine("MENU");
                Console.WriteLine("1. Nhập");
                Console.WriteLine("2. Xuất");
                Console.WriteLine("0. Thoát");
                Console.Write("Chọn chức năng: ");

                // Lựa chọn
                string luaChon = Console.ReadLine();

                // Kiểm tra lựa chọn -> thực hiện chức năng tương ứng
                switch (luaChon)
                {
                    case "1":
                        qLDienThoai.NhapNhieuDoiTuong();
                        break;
                    case "2":
                        qLDienThoai.XuatDanhSach();
                        break;
                    case "0":
                        Console.WriteLine("BẠN ĐÃ THOÁT !");
                        return;
                    default:
                        Console.WriteLine("Nhập sai rồi. Không có chức năng vừa nhập.");
                        break;
                }
            }
        }
    }
}