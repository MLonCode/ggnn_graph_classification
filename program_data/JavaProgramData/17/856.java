package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   String a = new String(new char[100]);
		   int nn;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   nn = Integer.parseInt(tempVar);
		   }
		   while (gets(a))
		   {
				 String ans = new String(new char[101]);
				 for (int i = 0;i < 101;i++)
				 {
					  ans = tangible.StringFunctions.changeCharacter(ans, i, ' ');
				 }
				 System.out.printf("%s\n",a);
				 int L = a.length();
				 ans = tangible.StringFunctions.changeCharacter(ans, L, '\0');
				 int mark = 0;
				 for (int i = 99;i != -1;i--)
				 {
					  if (a.charAt(i) == '(')
					  {
						  for (int j = i + 1;;j++)
						  {
								if (a.charAt(j) == ')')
								{
								a = tangible.StringFunctions.changeCharacter(a, i, '0');
								a = tangible.StringFunctions.changeCharacter(a, j, '0');
								mark++;
								break;
								}
								if (j == 101)
								{
								 a = tangible.StringFunctions.changeCharacter(a, i, '0');
								 ans = tangible.StringFunctions.changeCharacter(ans, i, '$');
								 break;
								}
						  }
					  }
				 }
					for (int i = 0;i < 101;i++)
					{
						if (a.charAt(i) == ')')
						{
							ans = tangible.StringFunctions.changeCharacter(ans, i, '?');
						}
					}
					System.out.printf("%s\n",ans);
		   }
	}
}

