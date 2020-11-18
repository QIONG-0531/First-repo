#include<stdio.h>
#include<Windows.h>
#pragma warning(disable:4996)
char *my_strcpy(char *dst, const char *src)
{
	char *ret = dst;
	while (*src)
	{
		*dst++ = *src++;
	}
	return ret;
}
int main()
{
	char dst[16] = "hello ";
	char *src = "world!";
	printf("%s\n", my_strcpy(dst, src));
	system("pause");
	return 0;
}