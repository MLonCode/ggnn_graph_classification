package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int h1;
		int l1;
		int h2;
		int l2;
	   int i;
	   int j;
	   int x;
	   int[][] shuzu1 = new int[100][100];
	   int[][] shuzu2 = new int[100][100];
	   int[][] shuzu3 = new int[100][100];
	   int[] p1 = new int[100];
	   (int)(*p2)[100];
	   (int)(*p3)[100];

	   p1 = shuzu1;
	   p2 = shuzu2;
	   p3 = shuzu3;

	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   h1 = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   l1 = Integer.parseInt(tempVar2);
	   }
	   for (i = 0;i < h1;i++)
	   {
		   for (j = 0;j < l1;j++)
		   {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 p1[i] + j = tempVar3;
			 }
		   }
	   }

		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   h2 = Integer.parseInt(tempVar4);
		   }
		   String tempVar5 = ConsoleInput.scanfRead(" ");
		   if (tempVar5 != null)
		   {
			   l2 = Integer.parseInt(tempVar5);
		   }
	   for (i = 0;i < h2;i++)
	   {
		   for (j = 0;j < l2;j++)
		   {
			 String tempVar6 = ConsoleInput.scanfRead();
			 if (tempVar6 != null)
			 {
				 *(p2 + i) + j = tempVar6;
			 }
		   }
	   }

	   for (i = 0;i < h1;i++)
	   {
		   for (j = 0;j < l2;j++)
		   {
			   for (p3[i][j] = 0,x = 0;x < l1;x++)
			   {
				   p3[i][j] = p3[i][j] + (p1[i] + x) * *(*(p2 + x) + j);
			   }
		   }
	   }

		for (i = 0;i < h1;i++)
		{
			   for (j = 0;j < l2;j++)
			   {
			   if (j != l2 - 1)
			   {
				   System.out.printf("%d ",p3[i][j]);
			   }
				else
				{
					System.out.printf("%d",p3[i][j]);
				}
			   }

			   if (i != h1 - 1)
			   {
				   System.out.print("\n");
			   }
		}
	}

}

