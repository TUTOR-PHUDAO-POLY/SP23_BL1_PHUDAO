#include<stdio.h>
#include<conio.h>
int main(){
//S? d?ng switch-case làm menu. 
//  n?u nh?p 1 in ra b?n dã ch?n yêu c?u 1
//  N?u nhâp 2 in ra b?n dã ch?n yêu c?u 2
//  N?u nh?p 3 in ra b?n dã ch?n yêu c?u 3
//  N?u nh?p 4 in ra b?n dã ch?n yêu c?u 4
//  N?u nhâp 0 thoát menu
	int n;

while(true){
	
//	printf("\n Nhap ki so ");
//	scanf("%d", &n);
//	switch(n){
//		case 1:
//			printf("Ban da nhap so 1");
//			break;
//		case 2:
//			printf("Ban da nhap so 2");
//			break;
//		case 3:
//			printf("Ban da nhap so 3");
//			break;
//		case 4:
//			printf("Ban da nhap so 4");
//			break;
//		case 0:{
//			printf("Tam biet");
//			
//			return 0;//Nên dung de thoat chuong trinh.
//				
//		    //exit(0);//Phai doi phai qua .c moi dung duoc		}			
//				
//			//Ket thuc chuong trinh.
//			//Co ai con cách nao k nhi? Thoat trong tieng anh la gi nhi
//	}
//Bài 3: S? d?ng while làm menu. Nh?p 1 ký t? t? bàn phím. N?u là ký t? ‘y’ => ti?p t?c cho nh?p, ‘n’ => d?ng vi?c nh?p	
while(true){
	char n ;
	scanf("%c", &n);
	switch(n){
		case 'y':
			break;
		case 'n':
			return 0;			
	}
}
}
