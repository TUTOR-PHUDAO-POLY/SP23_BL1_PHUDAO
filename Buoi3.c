// mảng: tập hợp các phần tử có cùng kiểu dữ liệu.
  // mảng số nguyên : chỉ chứa các số có kiểu dữ liệu là int
  // char : kiểu kí tự => 'a' là 1 kí tự 
  // 1 mảng kí tự => chuỗi kí tự.
  // độ dài của mảng ??? 
  // mảng có 5 phần tử là  5 3 6 9 7
  // vị trí  0 1 2 3 4
  // giá trị 5 3 6 9 7
  // ví dụ mảng tên là A
  // duyệt qua các phần tử của mảng thì dùng vòng lặp (for)
  // ví dụ mảng A có 5 phần tử
  // for(i=0 ;i<5; i++){
  //  printf("%d",)
  //}
  // cách lấy giá trị tại vị trí bất kì trong mảng
  // mảng a có 5 phần tử là  5 3 6 9 7
  // vị trí  0 1 2 3 4
  // giá trị 5 3 6 9 7
  // giá trị tại vị trí 2 là : a[2] = 6
  // khai báo mảng số nguyên: 
  // int mang[5] ={5,3,6,9,7};
  // printf("Giá trị tại vị trí số 2 là :  %d",mang[2]);
  // cú pháp lấy ra giá trị tại ví trí bất kì: ten_mang[vi_tri]
  // char str[50] = "Toi yeu em";
  // // cú pháp in ra chuỗi
  // //printf("Chuoi vừa nhập là : %s",str);
  // char str1[50]; // khởi tạo chuỗi có độ dài x
  // printf("Moi ban nhap chuoi: ");
  // gets(str1); // nhập chuỗi từ bàn phím
  // printf("\nChuoi vua nhap la: ");
  // puts(str1); // in ra chuỗi 

  // gets === scanf  => scanf dùng để nhập kí tự (char, số) từ bàn phím
  // gets tương tự => dành để nhập chuỗi
  
  // nhập vào n 
  // yêu cầu: nhập vào mảng n phần tử
  // in ra các số chẵn trong mảng
  int n;
  printf("Nhap n: ");
  scanf("%d", &n);
  int mang[n];
  int i; // vị trí của từng phần tử trong mảng
  // phần tử đầu tiên là i = 0 <=> mang[i] = mang[0]
  for(i=0; i<n; i++){
    printf("Nhap phan tu thu %d: ",i);
    scanf("%d",&mang[i]);
  }
  printf("\nMang vua nhap la : ");
  for(i=0 ; i<n; i++){
    printf("\t%d", mang[i]);
  }
