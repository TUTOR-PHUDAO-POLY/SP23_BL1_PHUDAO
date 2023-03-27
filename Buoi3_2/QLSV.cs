using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Buoi3_2
{
    internal class QLSV
    {
        // List<SinhVien>
        List<SinhVien> listSV = new List<SinhVien>();

        // Các chức năng

        public void Nhap()
        {
            // Khởi tạo 1 biến lưu lựa chọn của người dùng
            string luaChon;

            do
            {
                // Nhap 1 doi tuong
                // Khởi tạo đối tượng SV
                SinhVien sv = new SinhVien();

                // Nhập thông tin thuộc tính cho đối tượng
                Console.WriteLine("Nhap ma: ");
                sv.MaSV = Console.ReadLine();
                Console.WriteLine("Nhap ten: ");
                sv.Ten = Console.ReadLine();
                Console.WriteLine("Nhap nam sinh: ");
                sv.NamSinh = Convert.ToInt32(Console.ReadLine());

                // Thêm đối tượng vào list
                listSV.Add(sv);

                // Hỏi người dùng có nhập tiếp hay không?
                Console.WriteLine("Bạn có muốn nhập tiếp? Nhấn 'y' để tiếp tục");
                luaChon = Console.ReadLine();
                // Nếu điều kiện là luaChon == 'y' -> người dùng chọn 'y' -> dừng vòng lặp
                // Nếu điều kiện là luaChon != 'y' -> người dùng không chọn 'y' -> dừng vòng lặp

            } while (/*luaChon != "y"*/ luaChon.Equals("y"));


        }
        public void Xuat() 
        {
            foreach (var sinhVien in listSV)
            {
                sinhVien.InThongTin();
            }
        }

        public void XuatDanhSachTrenHaiMuoiTuoi()
        {

        }

        public void TimKiemTheoMa()
        {
            // Cho người dùng nhập mã sinh viên cần tìm
            Console.WriteLine("Nhap ma sinh vien can tim: ");
            string maCanTim = Console.ReadLine();

            // Tìm kiếm
            // 2 cách: for và foreach
            // Foreach
            foreach (var sinhVien in listSV)
            {
                // Kiểm tra nếu maSV trùng maCanTim -> in ra thông tin của sinh viên
                if (sinhVien.MaSV.Equals(maCanTim))
                {
                    sinhVien.InThongTin();
                }
            }

            // For
            for (int i = 0; i < listSV.Count(); i++)
            {
                if (listSV[i].MaSV.Equals(maCanTim))
                {
                    listSV[i].InThongTin();
                }
            }
        }
    }
}
