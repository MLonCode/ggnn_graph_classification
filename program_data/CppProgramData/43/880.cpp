//??????
int main()
{
	int m,i=3,j,x,y;                           //m??????  i??3?????  j?m-i x?y???i,j???????????
	int a,b,c=1;
	cin>>m;
	for(i=3;i<=m/2;i=i+2)                    //i?3?m/2?????
	{
		c=1;
		j=m-i;
		x=sqrt(i);
		y=sqrt(j);
		for(a=2;a<=x;a++)             //?a?2?x?????i?????
		{
			if(i%a==0)               //??i??a??  c=0 ?????
			{
				c=0;
				break;
			}
		}
		for(b=2;b<=y;b++)        //?b?2?y?????j?????
		{
			if(j%b==0)           //??j??b??  c=0 ?????
			{
				c=0;
				break;
			}
		}
		if(c==1)                //?c=1???i j ???
		{
			cout<<i<<" "<<j<<endl;
		}
	}
	return 0;
}