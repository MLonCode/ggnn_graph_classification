package <missing>;

public class GlobalMembers
{
	/*******************************************
	 *??????.cpp						   *
	 *?????							 	   *
	 *????: 2012-10-31			           *
	 *??????????????????????*
	 *******************************************/


	public static int Main()
	{
		//????a[100][20]???num?????temp??????�??�???????size
		//??�????�???time?????i,j,k,l
		int[][] a = new int[100][20];
		int num;
		int temp;
		int size;
		int time = 0;
		int i = 0;
		int j = 0;
		int k;
		int l;

		//?????
		while ((num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			time = 0; //time?????????????????????
			if (num == -1) //?num?1?????
			{
				break;
			}

			//??????????0???i??j???????j??1
			else if (num != 0)
			{
				a[i][j] = num;
				j = j + 1;
			}
			//?num?0???????????????
			else if (num == 0)
			{
				size = j; //?size??
				//??i?????
				for (l = 0; l < size; l++)
				{
					for (j = 0; j + 1 < size; j++) //????j + 1 < size??????l = 0?????????????0??
					{
						if (a[i][j] > a[i][j + 1])
						{
							temp = a[i][j];
							a[i][j] = a[i][j + 1];
							a[i][j + 1] = temp;
						}
					}
				}
				//??�????�???
				for (k = 0; k < size; k++)
				{
					for (l = 0; l < size; l++)
					{
						if (2 * a[i][k] == a[i][l])
						{
							time = time + 1;
						}
					}
				}

				System.out.print(time);
				System.out.print("\n");
				j = 0; //??????
				i = i + 1; //??????1?????????

			}
		}

		return 0;
	}

}

