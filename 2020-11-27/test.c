#include<stdio.h>
#include<Windows.h>
#pragma warning(disable:4996)
#include<stdlib.h>
#include<time.h>
#include<string.h>
//void  menu()
//{
//	printf("1.play  2.exit\n");
//	printf("please select:");
//}
//void game()
//{
//	int n = 0;
//	int RANGE = 100;
//	srand((unsigned long)time(NULL));//随机数
//	int r = rand() % RANGE + 1;//范围变成1-100
//	while (1){
//	printf("你猜:");
//	scanf("%d", &n);
//		if (n < r){
//			printf("你猜小了\n");
//		}
//		else if (n>r){
//			printf("你猜大了\n");
//		}
//		else {
//			printf("恭喜你，猜对了\n");
//			break;
//		}
//	}
//}
//int main()
//{
//	int quit = 1;
//	while (quit){
//	menu();
//	int select = 0;
//	scanf_s("%d", &select);
//	switch (select){
//	case 1:game();
//		break;
//	case 2:
//		quit = 0;
//		break;
//	default:
//		printf("输入有误，请重新输入\n");
//	}
//	}
//	system("pause");
//	return 0;
//
//}
 /*void print(char arr[])
{
	int num = strlen(arr);
	int end = num - 1;
	for (int start = 0; start <= end; start++)
	{
		printf("%c\n", arr[start]);
	}
}
int main()
{
	char arr[] = "abcdefg";
	print(arr);
	system("pause");
	return 0;

}*/
int found(int arr[],int num,int n)
{
	int start = 0;
	int end = num - 1;
	int mid = (end - start) / 2;
	for (; start <= end; start++, end--)
	{
		if (n < arr[mid])
		{
			end = mid - 1;
		}
		else if (n>arr[mid])
		{
			start = mid + 1;
		}
		else{
			return mid;
		}
	}
	return -1;
}
int main()
{
	int arr[] = { 11, 22, 33, 44, 55, 66 };
	int num = sizeof(arr) / sizeof(arr[0]);
	int n = 55;
	int ret = found(arr,num,n);
	if (ret == (-1))
	{
		printf("找不到\n");
	}
	else{
		printf("%d\n", arr[ret]);
	}
	system("pause");
	return 0;
}