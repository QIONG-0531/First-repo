#include<stdio.h>
#include<Windows.h>
#pragma warning(disable:4996)
void Menu()
{
	printf("###################\n");
	printf("##1.play   2.exit##\n");
	printf("###################\n");
	printf("please select:\n");
}
void Game()
{
	char board[ROW][COL];
	memset(board, ' ', sizeof(board));
	do{
		Showboard();
		PlayerMove();
		Judge();
		ComputerMove();
		Judge();
	} while (1);
}
void Showboard(char board[][col], int row, int col)
{

}
void PlayerMove(char board[][col], int row, int col)
{
	int x = 0;
	int y = 0;
	int quit = 0;
	while (!quit)
	{
		printf("请输入你的位置 \n");
		scanf_s("%d %d", &x, &y);
		if (x > 3 || x<1 || y>3 | y < 1)
		{
			printf("你的输入有误\n");
			continue;
		}
		if (board[x - 1][y - 1] != ' ')
		{
			printf("该位置已被占用\n");
			continue;
		}
		board[x - 1][y - 1] = 'x';
		quit = 1;
	}
}
void Judge(char board[][col], int row, int col)
{
	if ()
}
int main()
{
	int select = 0;
	int quit = 0;
	Menu();
	scanf_s("%d\n", &select);
	while (!quit){
		switch (select)
		{
		case 1:
			Game();
			printf("要不要再来一把？\n");
			break;
		case 2:
			quit = 1;
			break;
		default:
			printf("输入有误\n");
			break;

		}
	}
	system("pause");
	return 0;
}