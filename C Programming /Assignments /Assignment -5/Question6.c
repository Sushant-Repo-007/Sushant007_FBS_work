//Print a half pyramid using numbers
void main()
{
	int n;
	printf("Print a half pyramid using numbers\n");  //question 
	printf("Please enter the input  size:");
	scanf("%d",&n); //taking user input  from the user 
	
	int i,j;
	for(i=1; i<=n; i++) //rows
	{
			for(j=1; j<=i; j++) //columns
		{
				printf("%d",j);
		}
			printf("\n");
			
	}
	
}
