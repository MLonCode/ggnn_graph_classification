//***********************
//*???????********
//*??????**********
//*???1000012832******
//***********************
int main()
{
	int n,	i;//???? n ?????????
	cin	>>	n;
	for(i	=	1;	i	<=	n;	i	++)//??????
	{
		int m,	x[100]	=	{0},	j;//???????
		cin	>>	m;
		if(m	==	0)//???0????????60
		{
			cout	<<	60	<<	endl;
			continue;
		}
		else//??
		{
			for(j	=	0;	j	<	m;	j	++)//???????m???
			{
				cin	>>	x[j];
			}
			for(j	=	0;	j	<	m;	j	++)//????
			{
                
				if(x[j]	<	60)
				{
					if(x[j]	+	3	*	(j	+	1)	>=	60)//???????60????????????????60?????????
					{ 
						cout	<<	x[j]	<<	endl;
						break;
					}
					else if(3	*	(j	+	1)	+	x[j	+	1]	>=	60)//?????60????????????????????60????60??????
					{
						cout	<<	60	-	3	*	(j	+	1)	<<	endl;
						break;
					}
				}
			}
			if(j	==	m)//???????j==m???????????????60??????
			{
				cout	<<	60	-	3	*	m	<<	endl;
			}
		}
	}
	return 0;
}