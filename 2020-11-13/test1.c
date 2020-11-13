#include<stdio.h>
#include<Windows.h>
void Show()
{
	char content[] = "hello world,hello china!";
	char lable[] = "########################";
	int len = strlen(content);
	int start = 0;
	int end = 0;
	printf("%s\r", lable);
	for (start = 0, end = len - 1; start <= end; start++, end--){
		lable[start] = content[start];
		lable[end] = content[end];
		Sleep(1000);
		printf("%s\r", lable);
	}
	printf("\n");
}
int main()
{
	Show();
	system("pause");
	return 0;
}