#include<stdio.h>
#include<Windows.h>
#include<assert.h>
void *my_memcpy(void *dst, const void *src, int num)
{
	assert(dst);
	assert(src);
	char *_dst = (char *)dst;
	const char *_src = (const char*)src;
	while (num)
	{
		*_dst = *_src;
		_dst++;
		_src++;
		num--;
	}
	return dst;
}
int main()
{
	
	int a[] = { 1, 2, 3, 4, 5 };
	int b[10] = { 0 };
	my_memcpy(b, a, sizeof(a));
	for (int i = 0; i < 10; i++)
	{
		printf("%d ", b[i]);
	}
	printf("\n");
	system("pause");
	return 0;
}