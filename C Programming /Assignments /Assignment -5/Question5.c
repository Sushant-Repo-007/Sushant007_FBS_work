//Print an inverted pyramid pattern
void main()
{
	int n;
	printf("Print an inverted pyramid pattern\n");  //question 
	printf("Please enter the input  size:");
	scanf("%d",&n); //taking user input  from the user 
	
	int i,j;
	for(i=n; i>=0; i--) //rows
	{
			for(j=0; j<=i; j++) //columns
		{
				printf("* ");
		}
			printf("\n");
			
	}
	
}
