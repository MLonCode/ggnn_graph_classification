package <missing>;

public class GlobalMembers
{
	//**************************
	//*?? ????????  **
	//*?? ??? 1100016602 ** 
	//*?? 2011?10?21?    **
	//************************** 


	public static int Main()
	{
		int[] a = new int[100002]; //????a???????100000????????????n,k?????i,j?????????p
		int n;
		int i;
		int k;
		int p;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= n ; i++) //??????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1, p = n ; i <= p ; i++) //?????????????k,???????????p?
		{
			if (k == a[i]) //?????a[i]?k
			{
				  p--; //?????1
				  for (j = i ; j <= p ; j++) //?????????????????j??i?p
				  {
					  a[j] = a[j + 1]; //?????????????????
				  }
				  i--; //????????????????????????????????i-1
			}
		}
		for (i = 1, p--; i <= p ; i++) //???p-1????????????????
		{
			System.out.print(a[i]);
			System.out.print(' ');
		}
		System.out.print(a[i]);
		System.out.print("\n");
		return 0;
	}

}

