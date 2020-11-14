#include<stdio.h>
#include<Windows.h>
#include<string.h>
#pragma warning(disable:4996)
int Compare(int a, int b)
{
	int c = a^b;
	int i = 0;
	int count = 0;
	for (int i = 0; i < 32; i++)
	{
		if (((c >> i) & 1) == 1)
		{
			count++;
		}
	}
	return count;
}
int main()
{
	int a = 1999;
	int b = 2299;
	printf("%d\n", Compare(a, b));
	system("pause");
	return 0;
}


