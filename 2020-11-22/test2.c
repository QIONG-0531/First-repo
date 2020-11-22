#include<stdio.h>
#include<Windows.h>
#include<assert.h>
void *my_memmove(void *dst, const void *src, int num)
{
	assert(dst);
	assert(src);
	char *_dst = (char *)dst;
	const char *_src = (const char*)src;
	if (_dst > _src&&dst < _src + num)//right->left
	{
		_dst = _dst + num - 1;
		_src = _src + num - 1;
		while (num)
		{
			*_dst = *_src;
			_dst--;
			_src--;
			num--;
		}
	}
	else//left->right
	{
		while (num)
		{
			*_dst = *_src;
			_dst++;
			_src++;
			num--;
		}
	}

	return dst;
}
int main()
{

	char a[16] = "abcd1234";
	my_memmove(a+1, a, sizeof(a));
	printf("%s\n", a);
	system("pause");
	return 0;
}