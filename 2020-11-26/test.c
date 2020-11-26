#include<stdio.h>
#include<windows.h>
int main()
{
	int a = 0, b = 0, k = 0;
	printf("enter:");
	scanf_s("%d %d", &a, &b);
	//最大公约数：辗转相除法（除数对被除数求余后，将除数当作被除数，余数当作被除数，直至被除数为0，最大公约数为除数）
	while (b)
	{
		k = a%b;
		a = b;
		b = k;
	}
	printf("最大公约数:%d\n", a);
	system("pause");
	return 0;
}