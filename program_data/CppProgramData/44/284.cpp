int fanxushu(int a)//??????
{
	int i=0,j=0;
	int b[100]={0};
	if(a==0)
		return 0;//????????0????????0
	else if(a>0)
	{
		for(i=0;a>0;i++)
		{
			b[i]=a%10;
			a=a/10;
		}
		for(j=0;j<i;j++)
		{
			a=b[j]+a*10;
		}
		return a;
	}//a???????????a????
	else
	{
		a=-a;
		for(i=0;a>0;i++)
		{
			b[i]=a%10;
			a=a/10;
		}
		for(j=0;j<i;j++)
		{
			a=b[j]+a*10;
		}
		a=-a;
		return a;
	}//?a???????????????????
}
int main()//???
{//?????
	int i=0,n=6;
	int a=0;
	for(i=0;i<n;i++)
	{
		cin>>a;
		cout<<fanxushu(a)<<endl;
	}//????6??????
	return 0;
}//?????