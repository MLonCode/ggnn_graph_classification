// ?????.cpp : Defines the entry point for the console application.
// ???????n???????????????????????n-1???????????????????????????
int main()
{
	int n;                                             //????n??n???????
	cin>>n;                                            //??n
	double sour1=0,sour2=0;                            //????sour1????????????????????sour2??????????
	double sourper,per[1000];                          //????sourper????????????????per??????????
	double patient[1000],healthy[1000];                //????patient????????????????healthy??????????????
	cin>>sour1>>sour2;
	sourper=sour2/sour1;                               //??sourper
	for(int i=0;i<n-1;i++)                             //??????????????????????????????????
	{
		cin>>patient[i]>>healthy[i];
		per[i]=healthy[i]/patient[i];
	}
	for(int j=0;j<n-1;j++)                             //???????????????????????????????
	{
		if(per[j]-sourper>0.05)                          
			cout<<"better"<<endl;
		else if(sourper-per[j]>0.05)
			cout<<"worse"<<endl;
		else
			cout<<"same"<<endl;
	}
	return 0;
}
	