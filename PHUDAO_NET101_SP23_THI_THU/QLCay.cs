using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PHUDAO_NET101_SP23_THI_THU
{
    internal class QLCay
    {
        List<Cay> listCay = new List<Cay>();

        public void Nhap()
        {
            do
            {
                Cay cay = new Cay();
                Console.Write("Nhap ID: ");
                cay.Id = Convert.ToInt32(Console.ReadLine());
                Console.Write("Nhap LOAI: ");
                cay.LoaiCay = Console.ReadLine();
                Console.Write("Nhap TEN: ");
                cay.Ten = Console.ReadLine();

                listCay.Add(cay);

                Console.WriteLine("Co nhap tiep? Nhan 'y' de tiep tuc");
                string luaChon = Console.ReadLine();

                switch (luaChon)
                {
                    case "y":
                        break;
                    default:
                        return;
                }

            } while (true);
        }
        
        public void Xuat()
        {
            foreach (Cay cay in listCay)
            {
                cay.InThongTin();
            }
        }
        
        public void SapXepTheoIDGiamDan()
        {
            // descending: giam dan; ascending/null: tang dan
            listCay = (from cay in listCay
                       orderby cay.Id descending
                       select cay).ToList();
            //-> listCay da duoc sap xep
        }
        
        public void XoaTheoID()
        {

        }
    }
}
