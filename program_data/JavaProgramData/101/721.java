package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int af;
	  int bf;
	  int cf;
	  int ah;
	  int bh;
	  int ch;
	  int i;
	  String res = new String(new char[3]);
	  for (af = 0;af < 3;af++)
	  {
		for (bf = 0;bf < 3;bf++)
		{
		  for (cf = 0;cf < 3;cf++)
		  {
			ah = 0;
			bh = 0;
			ch = 0;
			if (bf > af)
			{
				ah++;
			}
			if (cf == af)
			{
				ah++;
			}
			if (af > bf)
			{
				bh++;
			}
			if (af > cf)
			{
				bh++;
			}
			if (cf > bf)
			{
				ch++;
			}
			if (bf > af)
			{
				ch++;
			}
			if ((((ah > bh) && (af < bf)) || ((ah == bh) && (af == bf)) || ((ah < bh) && (af> bf))) && (((bh> ch) && (bf < cf)) || ((bh == ch) && (bf == cf)) || ((bh < ch) && (bf> cf))) && (((ch> ah) && (cf > af)) || ((ch == ah) && (cf == af)) || ((ch < ah) && (cf> af))))
			{
			   res = tangible.StringFunctions.changeCharacter(res, 2 - af, 'A');
			   res = tangible.StringFunctions.changeCharacter(res, 2 - bf, 'B');
			   res = tangible.StringFunctions.changeCharacter(res, 2 - cf, 'C');
			}
		  }
		}
	  }
	  System.out.print("BCA");
	  System.out.print("\n");
	  return 0;
	}

}

