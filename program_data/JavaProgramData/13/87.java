package <missing>;

public class GlobalMembers
{
	/************************
	???????????
	???:???
	*********************/
	public static int Main()
	{
		int[] a = new int[20000]; //????n,i,j,n?????????a[20000]???
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++) //??????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++) //????
		{
			for (j = n - 1;j > i;j--)
			{
				if (a[j] == a[i]) //????,??a[j]=a[i]?a[j]=-1
				{
			a[j] = -1;
				}
			}
		}
		System.out.print(a[0]);
		for (i = 1;i < n;i++) //????
		{
		if (a[i] != -1)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
		}
		return 0;
	}
}

