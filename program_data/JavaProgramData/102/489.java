package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		//?????????????????????????????//??????????????????????????????????????
		//int n,i,x=0,y=0,k,t;
		//char a[100];
		//int b[100],c[100],d[100];                   ///???????????????,?????????double??
		//scanf("%d",&n);
		int n;
		int i;
		int m;
		int j = 0;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] male = new double[50]; //daiding[100]???????d[100]?b c????male && female
		double[] female = new double[50];
		double[] daiding = new double[100];
		double tmp;
		String xingbie = new String(new char[10]);



		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xingbie = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				daiding[i] = Double.parseDouble(tempVar3);
			}







			if (xingbie.charAt(0) == 'm') //?????xingbie[0],??xingbie[1],????????a[1];
			{
				male[j] = daiding[i];
				j++; //j==??�x�
			}
			else if (xingbie.charAt(0) == 'f')
			{
				female[k] = daiding[i];
				k++; //k==??�y�
			}
		}





		//?????????????








		for (i = 0;i < j;i++)
		{
			for (m = 0;m < j - 1;m++)
			{
				if (male[m] > male[m + 1])
				{
					tmp = male[m];
					male[m] = male[m + 1];
					male[m + 1] = tmp;
				}

			}
		}





		//???????????????????????????????????????m<j-1???m<j;??male[m+1]??????????
		for (i = 0;i < k;i++)
		{
			for (m = 0;m < k - 1;m++)
			{
				if (female[m] > female[m + 1])
				{
					tmp = female[m];
					female[m] = female[m + 1];
					female[m + 1] = tmp;
				}
			}
		}


		//?????????????????????????????????????????????????????????













		for (i = 0;i < j;i++)
		{
			System.out.printf("%.2lf ",male[i]);
		}
		for (i = k - 1;i > 0;i--)
		{
			System.out.printf("%.2lf ",female[i]);
		}


		//???????????????????????????????
		System.out.printf("%.2lf",female[0]);

		//???????????



		return 0;
	}
}

