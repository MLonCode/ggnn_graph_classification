package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int k;
	 int l;
	 int m;
	 int n;
	 float num;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 num = Float.parseFloat(tempVar);
	 }
	 i = (int)(num / 100);
	 num = num - i * 100;
	 j = (int)(num / 50);
	 num = num - j * 50;
	 k = (int)(num / 20);
	 num = num - k * 20;
	 l = (int)(num / 10);
	 num = num - l * 10;
	 m = (int)(num / 5);
	 num = num - m * 5;
	 n = (int)(num);
	 num = num - n;
	 System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",i,j,k,l,m,n);

	 return 0;
	}
}

