
using PHUDAO_NET101_SP23_THI_THU;

namespace PHUDAO_NET101
{
    internal class Program
    {
        static void Main(string[] args)
        {
            QLCay qLCay = new QLCay();

            do
            {
                Console.WriteLine("MENU");
                Console.WriteLine("1. NHAP");
                Console.WriteLine("2. XUAT");
                Console.WriteLine("3. SAP XEP");
                Console.WriteLine("4. XOA");
                Console.WriteLine("0. THOAT");

                Console.Write("Chon chuc nang: ");
                string luaChon = Console.ReadLine();

                switch (luaChon)
                {
                    case "1":
                        qLCay.Nhap();
                        break;
                    case "2":
                        qLCay.Xuat();
                        break;
                    case "3":
                        qLCay.SapXepTheoIDGiamDan();
                        break;
                    case "4":
                        qLCay.XoaTheoID();
                        break;
                    case "0":
                        Console.WriteLine("BAN DA THOAT !");
                        return;
                    default:
                        Console.WriteLine("NHAP LAI (0-4)!");
                        break;
                }

            } while (true);
        }
    }
}