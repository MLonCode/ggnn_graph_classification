package <missing>;

public class GlobalMembers
{
	//
	//	?????	????????
	//	?????	???????????????????????????????????????????????????????????????? 
	//	?????	?  ? ? ? ? ? 1000012733 ?
	//	?????	2010 ? 10 ? 31 ?
	//
	public static int Main()
	{
		int i; //?????????????
		int j;
		int k;
		int n;
		int count = 0;
		int p;
		int[] a = new int[100000]; //????a[100000]
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a [i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0; j < n; j++)
		{
			if (a [j] != k) //?????????????????????????k
			{
				a [count] = a [j]; //???????k?????????????????????�??�??
				count++; //??????????????count?1
			}
		}
		System.out.print(a [0]);
		for (p = 1; p < count ; p++)
		{
			System.out.print(" ");
			System.out.print(a [p]);
		}
		return 0;
	}
}

