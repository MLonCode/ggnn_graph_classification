//***************************************
//* ???5.cpp  **
//* ??????  1200012971  **
//* ????????????????? **
//* ???2012.10.10 **
//****************************************
int main()
{
	int i,n,a,b,t = 0,T = 0;                       //??n????a????b???????t,T?????
	cin >> n;                          //????
	for ( i = 1;i <= n;i++ )
	{
		cin >> a >> b;                              //????????
		if (a <= 140 && a >= 90 && b >= 60 && b <= 90)     //????????
			t = t + 1;                                  //????????
		else
		
		{
			if (t >= T)                               //??????t????T???t????0
				T = t;
			t = 0;
		}
	}
   if (t >= T)
	   cout << t <<endl;                             //????????
   else 
	   cout << T <<endl;
	return 0;
}





