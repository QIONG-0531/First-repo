#include<stdio.h>
#include<windows.h>
int main()
{
	int i = 0;
	float sum = 0.0;
	for (i = 1; i <= 100; i++)
	{
		if (i % 2 == 0)
		{
			i = -i;
		}
		sum = sum + (1.0 / i);
		if (i < 0)
		{
			i = -i;
		}
	}
	printf("sum=%f\n", sum);
	system("pause");
	return 0;
}
