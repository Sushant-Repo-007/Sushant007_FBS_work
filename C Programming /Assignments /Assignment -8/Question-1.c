#include<stdio.h>
void main()
{
	int a[5]={10,20,30,40,50};
	int i,min,max;
	min=max=a[0];
	
		for(i=0; i<5; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		
		printf("%d\n",max);
		printf("%d\n",min);
		
		
		
}

