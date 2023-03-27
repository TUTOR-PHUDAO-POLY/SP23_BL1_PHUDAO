#include <stdio.h>
// Bài 1: Nh?p vào 2 s? nguyên a, b.
// In ra t?ng, hi?u, tích, thuong c?a 2 s?.
// Tính (a + b) * c và in ra màn hình.
// T?o menu cho các yêu c?u trên

int main(void) {
//  int a, b;
//  printf("Moi ban nhap so a: ");
//  scanf("%d", &a);
//  printf("Moi ban nhap so b: ");
//  scanf("%d", &b);
//  int tong, tich, hieu;
//  float thuong;
//  tong = a + b;
//  tich = a * b;
//  hieu = a - b;
//  thuong = (float)a / b; // ep kieu sang so thuc
//  // 10 int 10.0
//  char chon,hiSinh;
//  printf("Moi ban chon phep tinh");
//  scanf("%c",&hiSinh);
//  scanf("%c",&chon);
//  switch (chon){
//  case '+': {
//    printf("Tong 2 so a b la: %d\n", tong);
//    break;
//  }
//  case '-': {
//    printf("Hieu 2 so a b la: %d\n", hieu);
//    break;
//  }
//  case '*': {
//    printf("Tich 2 so a b la: %d\n", tich);
//    break;
//  }
//  case '/': {
//    printf("Thuong 2 so a b la: %0.2f\n", thuong);
//    break;
//  }
//  }

//Bài 2: Nhap 2 canh a,b
//Neu a = b => tính dien tích hình vuông và in ra màn hình
//Neu a != b => tính dien tích hcn và in ra màn hình
//float a,b;
//printf("Moi ban nhap canh a: ");
//scanf("%f",&a);
//printf("Moi ban nhap canh b: ");
//scanf("%f",&b);
//if(a == b){
//	printf("Dien tich hinh vuong la %0.2f",a*b);
//}else{
//	printf("Dien tich hinh chu nhat la %0.2f",a*b);
//}
//
//Bài 3: Xây dung chuong trình tính diem trung bình:
//Nhap diem toán van anh tu bàn phím
//Tính diem trung bình  = (toán + van + anh)/3
//Neu 0<= diem trung bình <= 4 in ra màn hình ‘Hoc yeu’
//Neu 4< diem trung bình < 6 in ra màn hình ‘Hoc trung bình’
//Neu 6< = diem trung bình <8 in ra màn hình ‘Hoc khá’
//Neu 8<= diem trung bình <=10 in ra màn hình ‘Hoc gioi’

//float diemToan, diemVan, diemAnh;
//printf("Moi ban nhap vao diem Toan: ");
//scanf("%f",&diemToan);
//printf("Moi ban nhap vao diem Van: ");
//scanf("%f",&diemVan);
//printf("Moi ban nhap vao diem Anh: ");
//scanf("%f",&diemAnh);
//float diemTrungBinh;
// Neu ko de float ma gap so thuc thi phai ep kieu
//diemTrungBinh = (diemToan + diemVan + diemAnh)/3;
//printf("Diem trung binh la: %0.2f\n",diemTrungBinh);// 0.2f la lay sau dau , 2 so
// if(diemTrungBinh>0 && diemTrungBinh <= 4 ){
// 	printf("Hoc luc yeu");
// }else if(diemTrungBinh > 4 && diemTrungBinh < 6){
// 	printf("Hoc luc trung binh");
// }else if(diemTrungBinh >= 6 && diemTrungBinh < 8){
// 	printf("Hoc luc kha");
// }else if(diemTrungBinh >= 8 && diemTrungBinh <= 10){
// 	printf("Hoc luc gioi");
// }
//	int i,n;
//	printf("Moi ban nhap so phan tu cua mang: "); scanf("%d",&n);
//	int arrSoPhanTu[n];
//	for(i=0;i<n;i++){
//	printf("Moi nhap gia tri vao phan tu [%d]=",i);
//	scanf("%d",&arrSoPhanTu[i]);
//    }
//    for(i=0;i<n;i++){
//    	printf("Vi tri thu %d cua mang co gia tri la : %d\n",i,arrSoPhanTu[i]);
//	}
//    int j,temp;
//    for(i=0;i<n-1;i++){
//    	for(j=i+1;j<n;j++){
//    		if(arrSoPhanTu[i]>arrSoPhanTu[j]){
//    			temp = arrSoPhanTu[i];
//    			arrSoPhanTu[i] = arrSoPhanTu[j];
//    			arrSoPhanTu[j] = temp;
//			}
//		}
//	}
//	printf("sau khi sap xep\n",temp);
//	for(i=0;i<n;i++){
//    	printf("Vi tri thu %d cua mang co gia tri la : %d\n",i,arrSoPhanTu[i]);
//	}
	return 0;

}
