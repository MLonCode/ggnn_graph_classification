package <missing>;

public class GlobalMembers
{
	//**************************
	//*???????????  **
	//*?????? 1200012888 **
	//*???2013.10.30**
	//**************************
	public static int Main()
	{
		int[] a = new int[100000]; //??????a
		int n; //????????n??????k
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0 ; i < n ; i++) //?n???????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0 ; i < n ; i++)
		{
			if (k == a[i]) //??a[i] == k
			{
				int count = 0; //??count ?????????k????????
				int I = i; //I = i ??????
				for (int j = i ; j < n ; j++)
				{
					if (k == a[j]) //???????
					{
						count++;
					}
					else //??????????? k ? ????
					{
						break;
					}
				}
				while ((I + count) < n) //????
				{
					a[I] = a[I + count];
					I++;
				}
				n = n - count; //???????count???
			}
		}
		for (int i = 0 ; i < n ; i++) //??????????
		{
			if (i != n - 1) //??????????????
			{
			System.out.print(a[i]);
			System.out.print(" ");
			}
			else
			{
			System.out.print(a[i]);
			}
		}
		return 0;
	}

}

