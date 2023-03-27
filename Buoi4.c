#include<stdio.h>
int main(){
	int chucNang;
	do{
	printf("+-----------------Menu---------------+\n");
	printf("      1.Thong tin nguoi yeu cu.\n");
	printf("      2.Tinh tong cac so le tu 1->n.\n");
	printf("      3.Thong tin Vaccine.\n");
	printf("      4.Thoat.\n");
	printf("+---------------------------------------+\n");
	printf("Moi ban nhap vao chuc nang: \n");
	scanf("%d",&chucNang);
	switch(chucNang){
		case 1:{
			char tenNyc[50],tot[1];
			int namSinh,canNang;
			printf("Moi nhap ten cua nguoi yeu cu: ");
			gets(tot);
			gets(tenNyc);
			printf("Moi ban nhap nam sinh cua nguoi yeu cu: ");
			scanf("%d",&namSinh);
			printf("Moi ban nhap can nang cua nguoi yeu cu: ");
			scanf("%d",&canNang);
			int tuoi = 2023 - namSinh;
         	printf("+---------------NYC---------------------+\n");
         	printf("      Ten: ");
         	puts(tenNyc);
        	printf("      Nam sinh: %d.\n",namSinh);
        	printf("      Can nang: %d.\n",canNang);
        	printf("      Tuoi: %d.\n",tuoi);
         	printf("+---------------------------------------+\n");
			break;
		}
		case 2:{
			int n;
			printf("Moi ban nhap so phan tu trong mang: ");
			scanf("%d",&n);
			int i;
			float soNguyen[n];
			for(i=0;i<n;i++){
				printf("Moi ban nhap phan tu thu %d: ",i+1);
				scanf("%f",&soNguyen[i]);
				// 7.5  - gia tri ban dau == 0
				while(soNguyen[i]<=0 ){
					printf("O day chung toi ko lam the moi ban nhap so nguyen duong: ");
					scanf("%d",&soNguyen[i]);
				}
			}
			int sum =0;
			for(i=0;i<n;i++){
				if((int)soNguyen[i] % 2 != 0)
                sum += soNguyen[i];
			}
			printf("Tong cac so le la: %d\n",sum);
			break;
		}
	}
	}while(chucNang != 4); // Tao vong lap cho menu
}
#include<stdio.h>
int main(){
	int chucNang;
	do{
	printf("+-----------------Menu---------------+\n");
	printf("      1.Thong tin nguoi yeu cu.\n");
	printf("      2.Tinh tong cac so le tu 1->n.\n");
	printf("      3.Thong tin Vaccine.\n");
	printf("      4.Thoat.\n");
	printf("+---------------------------------------+\n");
	printf("Moi ban nhap vao chuc nang: \n");
	scanf("%d",&chucNang);
	switch(chucNang){
		case 1:{
			char tenNyc[50],tot[1];
			int namSinh,canNang;
			printf("Moi nhap ten cua nguoi yeu cu: ");
			gets(tot);
			gets(tenNyc);
			printf("Moi ban nhap nam sinh cua nguoi yeu cu: ");
			scanf("%d",&namSinh);
			printf("Moi ban nhap can nang cua nguoi yeu cu: ");
			scanf("%d",&canNang);
			int tuoi = 2023 - namSinh;
         	printf("+---------------NYC---------------------+\n");
         	printf("      Ten: ");
         	puts(tenNyc);
        	printf("      Nam sinh: %d.\n",namSinh);
        	printf("      Can nang: %d.\n",canNang);
        	printf("      Tuoi: %d.\n",tuoi);
         	printf("+---------------------------------------+\n");
			break;
		}
		case 2:{
			int n;
			printf("Moi ban nhap so phan tu trong mang: ");
			scanf("%d",&n);
			int i;
			float soNguyen[n];
			for(i=0;i<n;i++){
				printf("Moi ban nhap phan tu thu %d: ",i+1);
				scanf("%f",&soNguyen[i]);
				// 7.5  - gia tri ban dau == 0
				//Cho nguoi giai cuu
				//BTVN cho moi nguoi
				while(soNguyen[i]<=0 || (int)soNguyen[i] != soNguyen[i]){
					printf("O day chung toi ko lam the moi ban nhap so nguyen duong: ");
					scanf("%d",&soNguyen[i]);
					if(soNguyen[i]>=0 || (int)soNguyen[i] == soNguyen[i])
					break;
				}
			}
			int sum =0;
			//Tim so chan dau tien trong mang;
			for(i=0;i<n;i++){
				if((int)soNguyen[i] % 2 == 1)
                sum += soNguyen[i];
			}
			printf("Tong cac so le la: %d\n",sum);
			//Tim so chan lon nhat
			//Binh thuong se gan gia tri bang phan tu dau tien
			// Nhung ma gia tri dau tien co phai la so chan khong?
			//7 4 2 1
			float max =0;
			for(i=0;i<n;i++){
				if((int)soNguyen[i] % 2 == 0){
				max=soNguyen[i];
				break;
				}
			}
			
			for(i=0;i<n;i++){
				if((int)soNguyen[i] % 2 == 0 && max < soNguyen[i]){
					max = soNguyen[i];
				}
			}
			if(max!=0)
			printf("So chan lon nhat la: %0.0f\n",max);
			break;
		}
		case 3:{
			printf("Moi ban nhap so luong vaccine: ");
			int n;
			scanf("%d",&n);
			int vaccine[n],i;
			for(i=0;i<n;i++){
				printf("Moi ban nhap thoi gian hieu qua vaccine %d: ",i+1);
				scanf("%d",&vaccine[i]);
			}
			printf("So luong vaccine la: %d\n",n);
			int min = vaccine[0];
			for(i=0;i<n;i++){
				if(min> vaccine[i])
				min = vaccine[i];
			}
			int max = vaccine[0];
			for(i=0;i<n;i++){
				if(max < vaccine[i])
				max = vaccine[i];
			}
			printf("Thoi gian hieu qua thap nhat la:%d\n",min);
			printf("Thoi gian hieu qua cao nhat la:%d\n",max);
			int j;
			int temp;
			for(i=0;i<n-1;i++){
				for(j=i+1;j<n;j++){
					if(vaccine[i]>vaccine[j]){
						temp = vaccine[i];	
            vaccine[i]=vaccine[j];
						vaccine[j]=temp;
					}
				}
			}
			printf("Thoi gian hieu qua thap nhat la:%d\n",vaccine[0]);
			printf("Thoi gian hieu qua cao nhat la:%d\n",vaccine[n-1]);
			break;
		}
	}
	}while(chucNang != 4); // Tao vong lap cho menu
}
