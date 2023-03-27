using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Buoi2_3
{
    internal class QLDienThoai
    {
        /*
         * Tạo class QLDienThoai sử dụng List<DienThoai>. 
         * Các chức năng viết trong class này
         * Nhập
         * Xuất
         */

        private List<DienThoai> listDT = new List<DienThoai>(); // nếu không khởi tạo new -> listDT = null;

        // Nhập 1 đối tượng
        public void NhapMotDoiTuong()
        {
            // Khai báo và khởi tạo đối tượng
            DienThoai dienThoai = new DienThoai();

            // Cho người dùng nhập giá trị của từng thuộc tính
            Console.Write("Nhập tên: ");
            dienThoai.Ten = Console.ReadLine(); // nhập và gán giá trị
            Console.Write("Nhập hãng: ");
            dienThoai.Hang = Console.ReadLine(); // nhập và gán giá trị
            Console.Write("Nhập màu: ");
            dienThoai.Mau = Console.ReadLine(); // nhập và gán giá trị
            Console.Write("Nhập bộ nhớ: ");
            dienThoai.BoNho = Convert.ToInt32(Console.ReadLine()); // nhập và gán giá trị
            Console.Write("Nhập giá: ");
            dienThoai.Gia = Convert.ToInt32(Console.ReadLine()); // nhập và gán giá trị

            // Thêm đối tượng vào list 
            listDT.Add(dienThoai);
        }

        // Nhập nhiều hơn 1 đối tượng
        public void NhapNhieuDoiTuong()
        {
            bool nhapTiep = true;

            do
            {
                // Nhập một đối tượng
                NhapMotDoiTuong();

                // Hỏi người dùng có nhập tiếp ?
                Console.WriteLine("Bạn có muốn nhập tiếp? Nhập 'y' để tiếp tục");
                string luaChon = Console.ReadLine();

                switch(luaChon)
                {
                    case "y":
                        nhapTiep = true;
                        break;
                    default:
                        nhapTiep = false;
                        break;
                }

            } while (nhapTiep);
        }

        public void XuatDanhSach()
        {
            foreach (var dienThoai in listDT)
            {
                dienThoai.InThongTin();
            }
        }
    }
}
