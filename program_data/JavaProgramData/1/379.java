//***************************************
//* ?????2010?12?01?            *
//* ?????????                  *
//* ?????         ???1000012902 *
//***************************************
int factors = new int(int, int, int); //????factors?????????????
int main()
{
	int num;
	int n;
	int i;
	int j;
	int[] b = new int[10000];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0; i < n; i++)
	{
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int part = 0; //??????????
		int t = num; //????

		//??????1????????????
		for (j = 2; j <= num; j++)
		{
			while (t % j == 0)
			{
				t /= j;
				part++;
			}
		}
		b[i] = factors(1, part, num); //?????????????, ??????????
	}

	//?????????
	for (i = 0; i < n; i++)
	{
		System.out.print(b[i]);
		System.out.print("\n");
	}
	return 0;
}

//factor1????????????????????factor1, part??????????????????????????, num???????? 
int factors(int factor1, int part, int num)
{
	int sum = 0; //????????0, ???0
	if (num < factor1) //?????????????????, ???0?????????????
	{
		return 0;
	}
	if (part == 1) //?????????, ??1??????????
	{
		return 1;
	}

	//???????????????????????????????????????????, ????????
	for (int i = factor1; i <= num; i++)
	{
		if (num % i == 0)
		{
			sum = sum + factors(i, part - 1, num / i);
		}
	}
	return sum;
}

