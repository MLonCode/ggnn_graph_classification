//********************************
//*????                **
//*?????? 1200012784 **
//*???2012.12.4         **
//********************************

void move(int *, int, int); //????????????????move

int main()
{
	int n; //??????n?????m???num
	int m;
	int[] num = new int[100];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0; i < n; i++)
	{
		num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	move(num, n, m); //??????
	System.out.print(num[0]);
	for (int i = 1; i < n; i++)
	{
		System.out.print(' ');
		System.out.print(num[i]);
	}
	return 0;
}

void move(int * num, int n, int m) //?????????
{
	int i = 0; //i??????num??i?????num[0]??
	int key = (num + i); //???????????
	while (i != m) //???????????i?????????
	{
		if (i < m) //?????m?
		{
			*(num + i) = *(num + i + n - m); //????i + n + m??
			i = i + n - m; //??????????i + n + m??
		}
		else //??????
		{
			*(num + i) = *(num + i - m); //????i - m??
			i = i - m; //???????i - m??
		}
	}
	*(num + i) = key; //??i?????m?????????????num[0]???num[m]
}

