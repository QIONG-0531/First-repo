#include<stdio.h>
#include<Windows.h>
#pragma warning(disable:4996)
#define NAME "tom"
#define PASSWD "12345"
int Login(int times)
{
	int ret = -1;
	char name[64];
	char passwd[64];
	do{
		printf("请输入你的账号# ");
		scanf("%s", name);
		printf("请输入你的密码# ");
		scanf("%s", passwd);
		if (strcmp(name, NAME) == 0 && strcmp(passwd, PASSWD) == 0)
		{
			ret = 1;
			break;
		}
		else{
			times--;
			printf("你还有%d次机会！\n", times);
			if (times == 0){
				printf("不好意思，需要等3S才能再次尝试\n");
				Sleep(3000);
				times = 3;
			}
		}
	} while (1);
	return ret;
}
int main()
{
	int times = 3;
	int result = Login(times); //success:1, failed: -1;
	if (1 == result){
		printf("恭喜，登录成功！\n");
	}
	else{
		printf("不好意思，登录失败！\n");
	}
	system("pause");
	return 0;
}