package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String c1 = new String(new char[82]);
	 String c2 = new String(new char[82]);
	 int i;
	 int l1;
	 int l2;
	 int t;
	 c1 = new Scanner(System.in).nextLine();
	 c2 = new Scanner(System.in).nextLine();
	 l1 = c1.length();
	 l2 = c2.length();
	 for (i = 0;i < l1;i++)
	 {
		  if (c1.charAt(i) >= 'A' && c1.charAt(i) <= 'Z')
		  {
	   c1.charAt(i) += 32;
		  }
	 }
	 for (i = 0;i < l2;i++)
	 {
		 if (c2.charAt(i) <= 'Z' && c2.charAt(i) >= 'A')
		 {
	   c2.charAt(i) += 32;
		 }
	 }
	 t = strcmp(c1,c2);

	 if (t == 0)
	 {
		 System.out.print("=");
		 System.out.print("\n");
	 }
	 if (t < 0)
	 {
		 System.out.print("<");
		 System.out.print("\n");
	 }
	 if (t > 0)
	 {
		 System.out.print(">");
		 System.out.print("\n");
	 }
	 return 0;
	}

}
