package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int i;
		int j;
		int p = 0;
		int[] b = new int[110];
		cin.get(a,110,'\n');
		for (i = 0;i <= 109;i++)
		{
						   if (a[i] > 0)
						   {
						   p++;
						   }
		}
		for (i = 1;i <= p - 1;i++)
		{
						 if (a[i] == a[0])
						 {
							 continue;
						 }
						 else
						 {
							  j = i - 1;
							  while (j >= 0)
							  {
										 if (b[j] == 0)
										 {
											 break;
										 }
										 else
										 {
										 j--;
										 }
							  }
							  System.out.print(j);
							  System.out.print(" ");
							  System.out.print(i);
							  System.out.print("\n");
							  b[j] = 1,b[i] = 1;
						 }
		}
		return 0;
	}

}
