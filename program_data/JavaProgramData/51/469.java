package <missing>;

public class GlobalMembers
{
	//
	//  main.c
	//  Track 80,n-gram????
	//
	//  Created by Charles.thRay.Lee on 2/1/13.
	//  Copyright (c) 2013 Peking University. All rights reserved.
	/*
	 ??	??-From Whf
	 ??
	 ?????????n-gram??????????????n ?????????????????????????????????????????????n-gram ????? n ?????????????????????????????????????500????? 1 < n <5? ?????????????????????????????????????????????????1???? NO
	 
	 ???n=3???????abcdefabcd?
	 ????? 3-gram??abc,bcd,cde,def,efa,fab,abc,bcd?????cd?????3-gram?????????abc ? bcd ????2?????????1?????????????
	 2
	 abc
	 bcd
	 ????
	 ????n
	 ???????
	 ????
	 ??????????????????
	 ????
	 3
	 
	 abcdefabcd
	 
	 ????
	 2
	 
	 abc
	 
	 bcd
	*/


	public static int save(String point, String[] filed, int[] check, int filedp)
	{
		int p = 0;
		int k = 0;
		for (p = 0; p < filedp && k == 0; p++)
		{
			if (strcmp(point, filed[p]) == 0)
			{
				check[p]++;
				k = 1;
			}
		}
		if (k == 0)
		{
			filed[filedp] = point;
			filedp++;
		}
		return filedp;
	}

	public static int Main()
	{
		int n;
		int i = 0;
		int p = 0;
		int filedp = 0;
		int max = 0;
		int len;
		final String s = "";
		final String point = "";
		final String filed = "";
		int[] check = new int[400];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}

		len = s.length();
		for (i = 0; i <= len - n; i++)
		{
			for (p = 0; p < n; p++)
			{
				point = tangible.StringFunctions.changeCharacter(point, p, s.charAt(p + i));
			}
			filedp = save(point, filed, check, filedp);
		}

		for (p = 0; p < filedp; p++)
		{
			if (check[p] >= max)
			{
				max = check[p];
			}
		}

		if (max == 0)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max + 1);

			for (p = 0; p < filedp; p++)
			{
				if (check[p] == max)
				{
					System.out.printf("%s\n",filed.charAt(p));
				}
			}
		}

	}
}

