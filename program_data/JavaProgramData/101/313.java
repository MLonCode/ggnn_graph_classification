package <missing>;

public class GlobalMembers
{
	/*A??B??????C??????? 
	B??A??????A??C??? 
	C????B????B?A???? 
	*/
	public static int Main()
	{
		int[] a = {1, 2, 3}; //????????1? 2? 3?si?????????
		int A;
		int B;
		int C;
		int s1;
		int s2;
		int s3;
		String b = new String(new char[3]); //???????A? B? C
		for (int i = 0; i < 3;i++)
		{
			A = a[i];
			for (int j = 0; j < 2;j++)
			{
				if (j == i)
				{
					continue;
				}
				else
				{
					B = a[j];
					for (int k = 0; k < 3; k++)
					{
						if (k == i && k == j)
						{
							continue;
						}
						else
						{
							C = a[k];
							s1 = (B > A) + (A == C);
							s2 = (A > B) + (A > C);
							s3 = (C > B) + (B > A);
							b = tangible.StringFunctions.changeCharacter(b, s1, 'A'); //???????????????????
							b = tangible.StringFunctions.changeCharacter(b, s2, 'B');
							b = tangible.StringFunctions.changeCharacter(b, s3, 'C');
							if (s1 != s2 && s1 != s3 && s2 != s3) //???????
							{
								int f = 0;
								for (int l = 0;l < 3; l++)
								{
									System.out.print(b.charAt(l));
									f++;
									if (f == 3)
									{
										return 0;
									}
								}
							}
						}
					}
				}
			}
		}
	}
}

