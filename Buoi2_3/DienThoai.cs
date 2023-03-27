using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Buoi2_3
{
    internal class DienThoai
    {
        /*
            gồm các thông tin: tên - String, hãng - String , mau - String , boNho - int , gia - int 
            và các phương thức constructor, property và InThongTin(): void
         */

        // Thuộc tính
        private string ten;
        private string hang;
        private string mau;
        private int boNho;
        private int gia;

        // Constructor (2 loại: không tham số, có tham số)
        // Không TS
        public DienThoai()
        {

        }

        // Có TS
        public DienThoai(string ten, string hang, string mau, int boNho, int gia)
        {
            this.Ten = ten;
            this.Hang = hang;
            this.Mau = mau;
            this.BoNho = boNho;
            this.Gia = gia;
        }

        // Property
        public string Ten { get => ten; set => ten = value; }
        public string Hang { get => hang; set => hang = value; }
        public string Mau { get => mau; set => mau = value; }
        public int BoNho { get => boNho; set => boNho = value; }
        public int Gia { get => gia; set => gia = value; }

        // InThongTin()
        public void InThongTin()
        {
            Console.WriteLine($"Điện thoại: {Ten} - {Hang} - {Mau} - {BoNho} - {Gia}");
        }

    }
}
