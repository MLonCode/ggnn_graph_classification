package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int i;
	public static int[][] sz = new int[10000][30];
	public static int[] a = new int[10000];
	public static int[] b = new int[10000];
	public static int l = 0;
	public static int k;

	public static int Main()

	{

	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }

		for (i = 0;i < n;i++)
		{

		  for (l = 0;l < 21;l++)
		  {
			  sz[i][l] = -1;
		  }
		}



	   l = 0;

	   for (i = 0;i < n;i++)

	   {

		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  b[i] = Integer.parseInt(tempVar2);
		  }

		  sz[i][0] = b[i];

		  for (l = 0;l < b[i];l++)
		  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  (sz[i][l + 1]) = Integer.parseInt(tempVar3);
			  }
		  }

	   }



	   for (i = 0;i < n;i++)

	   {

		  //printf("%d\n",i);

		  l = 1;

		  if (sz[i][0] == 0)

		  {

		   a[i] = 60;

		   continue;

		  }

		  while (sz[i][l] != -1)

		  {

		   k = sz[i][l] + 3 * l;

		   if (k < 60 && (sz[i][l + 1] == -1))

		   {

			a[i] = 60 - 3 * l;

			break;

		   }

		   else if (k < 60 && (sz[i][l + 1] != -1))
		   {
			   l++;
		   }

		   else if ((k >= 60) && (k <= 63))

		   {

			a[i] = sz[i][l];

			break;

		   }

		   else if (k > 63)

		   {

			a[i] = 60 - 3 * (l - 1);

			break;

		   }

		  }

	   }

	for (i = 0;i < n;i++)
	{

	 System.out.printf("%d\n",a[i]);
	}

	 return 0;

	}











}

