#include<stdio.h>
#include<Windows.h>
#pragma warning(disable:4996)
char * my_strcat(char *dst,const char* src)
{
	char *ret = dst;
	int i = 0;
	while (*dst)
	{
		dst++;
	}
	while (*src)
	{
		*dst = *src;
		src++;
		dst++;
	}
	return ret;
}
int main()
{
	char dst[16] = "hello ";
	const char *src = "world!";
	printf("%s\n", my_strcat(dst,src));
	system("pause");
	return 0;
}