using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Buoi3_2
{
    internal class SinhVien
    {
        // Thuộc tính
        private string maSV;
        private string ten;
        private int namSinh;

        // ctor
        public SinhVien()
        {

        }

        public SinhVien(string maSV, string ten, int namSinh)
        {
            this.MaSV = maSV;
            this.Ten = ten;
            this.NamSinh = namSinh;
        }

        public string MaSV { get => maSV; set => maSV = value; }
        public string Ten { get => ten; set => ten = value; }
        public int NamSinh { get => namSinh; set => namSinh = value; }

        public void InThongTin()
        {
            Console.WriteLine($"sinh vien: {maSV} | {ten} | {namSinh}");
        }
    }
}
