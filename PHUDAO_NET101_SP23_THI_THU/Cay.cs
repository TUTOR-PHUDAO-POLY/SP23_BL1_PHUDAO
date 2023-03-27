using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PHUDAO_NET101_SP23_THI_THU
{
    internal class Cay
    {
        // Thuộc tính
        private int id;
        private string loaiCay;
        private string ten;

        // Constructor
        public Cay()
        {

        }

        public Cay(int id, string loaiCay, string ten)
        {
            Id = id;
            LoaiCay = loaiCay;
            Ten = ten;
        }

        // Property
        public int Id { get => id; set => id = value; }
        public string LoaiCay { get => loaiCay; set => loaiCay = value; }
        public string Ten { get => ten; set => ten = value; }

        // Phương thức InThongTin
        public void InThongTin()
        {
            Console.WriteLine($"Cay: {Id} - {LoaiCay} - {Ten}");
        }
    }
}
