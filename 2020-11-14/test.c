#include<stdio.h>
#include<windows.h>
int main()
{
	int  x, y;
	printf("enter:");
	scanf("%d %d", &x, &y);
	if (x >=y)
		printf("%d", x);
	else
		printf("%d", y);
	system("pause");
	return 0;
}
