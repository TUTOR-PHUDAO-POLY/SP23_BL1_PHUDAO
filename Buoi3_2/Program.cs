using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Buoi3_2

{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Khai bao QLSV
            QLSV qLSV = new QLSV();

            bool tiepTucCT = true;
            do
            {
                // Menu
                Console.WriteLine("MENU");
                Console.WriteLine("1. NHAP");
                Console.WriteLine("2. XUAT");
                Console.WriteLine("3. DANH SACH > 20 TUOI");
                Console.WriteLine("4. TIM KIEM = MA SINH VIEN");
                Console.WriteLine("0 THOAT");

                // Cho người dùng chọn chức năng
                Console.Write("Chon chuc nang: ");
                string luaChon = Console.ReadLine();

                // Thực hiện chức năng tương ứng
                switch (luaChon)
                {
                    case "1":
                        qLSV.Nhap();
                        break;
                    case "2":
                        qLSV.Xuat();
                        break;
                    case "3":
                        qLSV.XuatDanhSachTrenHaiMuoiTuoi();
                        break;
                    case "4":
                        qLSV.TimKiemTheoMa();
                        break;
                    case "0":
                        Console.WriteLine("BAN DA THOAT !");
                        tiepTucCT = false;
                        break;
                    default:
                        Console.WriteLine("Chuc nang sai. Moi nhap lai !");
                        break;
                }
            } while (tiepTucCT);
        }
    }
}
