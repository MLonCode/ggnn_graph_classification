
int main()
{
	int k,height[25],start[25],max=0,h,i,j,q; //start[i]????i????????????????????????i??
	scanf("%d",&k);   //???????
	for(h=0;h<k;h++){
		scanf("%d",&height[h]);  //?????????
		start[h]=1;  //????1???start[i]???1,???i????
	}
	for(i=k-2;i>=0;i--){   //??????start[i]?start[k-1]???1???????????????????????
		for(j=i+1;j<k;j++){   //??????????????????
			if(height[j]<=height[i]&&start[j]+1>start[i]){   //?????start[j]+1>start[i]???start[j]??????i????�?????�?????start[i]
				start[i]=start[j]+1;   //start[i\j]??1?????????????????????start[i]
			}
		}
	}
	for(q=1;q<k;q++){
		if(start[q]>start[max]){   //??????????????????????
			max=q;
		}
	}
	printf("%d",start[max]);
	return 0;
}