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
//	srand((unsigned long)time(NULL));//�����
//	int r = rand() % RANGE + 1;//��Χ���1-100
//	while (1){
//	printf("���:");
//	scanf("%d", &n);
//		if (n < r){
//			printf("���С��\n");
//		}
//		else if (n>r){
//			printf("��´���\n");
//		}
//		else {
//			printf("��ϲ�㣬�¶���\n");
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
//		printf("������������������\n");
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
		printf("�Ҳ���\n");
	}
	else{
		printf("%d\n", arr[ret]);
	}
	system("pause");
	return 0;
}