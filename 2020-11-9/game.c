#include"game.h"
void  Menu()
{
	printf("########################\n");
	printf("##1.Play        2.Exit##\n");
	printf("########################\n");
	printf("Please  select#");
}
void Game()
{
		srand((unsigned long)time(NULL));//生成一个随机数
		int r = rand() % RANGE + 1;//随机数范围变成1-100
	while (1){
		int n = 0;
		printf("你猜#");
		scanf_s("%d", &n);
		if (n < r){
			printf("你猜小了\n");
		}
		else if (n>r){
			printf("你猜大了\n");
		}
		else{
			printf("恭喜你猜对了\n");
			break;
		}
	}

}