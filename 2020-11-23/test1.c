#include<stdio.h>
#include<Windows.h>
int my_strlen(char*str)
{
	int count = 0;
	while (*str)
	{
		count++;
		str++;
	}
	return count;
}
int main()
{
	char *str = "abcdef";
	int ret = my_strlen(str);
	printf("%d\n", ret);
	system("pause");
	return 0;
}