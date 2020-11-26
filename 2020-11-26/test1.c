#include<stdio.h>
#include<Windows.h>
int main()
{
	int i = 0, a = 0, sum = 0;
	for (i = 100; i < 201; i++)
	{
		for (a = 2; a < i; a++)
		{
			if (i%a == 0)
			{
				sum += 1;
			}
		}
		if (sum == 0)
		{
			printf("%dÊÇËØÊý\n", i);
		}
	}
	system("pause");
	return 0;
}