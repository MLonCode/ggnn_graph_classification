package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		double x,y;
	//};
		point[] points = tangible.Arrays.initializeWithDefaultpointInstances(1000);

			for (i = 0;i < n;i++)
			{
				double x1;
				double y1;
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  x1 = Double.parseDouble(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  y1 = Double.parseDouble(tempVar3);
		  }
		  points[i].x = x1;
		  points[i].y = y1;
			}
			double[] distance = new double[1000];
			int p = 0;
			double max = 0;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n && j != n;j++)
				{
					distance[p] = Math.sqrt((points[i].x - points[j].x) * (points[i].x - points[j].x) + (points[i].y - points[j].y) * (points[i].y - points[j].y));
			 if (distance[p] > max)
			 {
				 max = distance[p];
			 }
			 else
			 {
				 max = max;
			 }
			 p++;
				}
			}
			 System.out.printf("%.4f",max);
	}


}

