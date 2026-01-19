//Print a pyramid pattern//
void main()
{
	int n;
	printf("Print a pyramid  pattern\n");  //question 
	printf("Please enter the input  size:");
	scanf("%d",&n); //taking user input  from the user 
	
	int i,j;
	for(i=0; i<=n; i++) //rows
	{
			for(j=0; j<i; j++) //columns
		{
				printf("* ");
		}
			printf("\n");
			
	}
	
}
