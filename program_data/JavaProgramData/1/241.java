int means = new int(int,int);
int main()
{
	int n;
	int i = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (i < n)
	{
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(means(a,a));
		System.out.print("\n");
		i++;
	}
	return 0;
}



int means(int a,int b)
{
	int i;
	int sum = 0;
	if (a != 1)
	{
		for (i = b;i >= 2;i--)
		{
			if (a % i == 0)
			{
				sum = sum + means(a / i,i); //?i????a??????a/i???a/i??????i????????????
			}
		}
		return sum; //?????a???????????
	}
	else
	{
		return 1; //?a=1?????????1
	}
}

