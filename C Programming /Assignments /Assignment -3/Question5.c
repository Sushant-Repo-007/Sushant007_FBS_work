void  main()
{
	int n = 153, temp, rem, sum = 0;

		temp = n;

	while(temp > 0)
	{
    	rem = temp % 10;
    	sum = sum + (rem*rem*rem);
    	temp = temp / 10;
	}

	if(sum == n)
    	printf("Armstrong");
	else
    	printf("Not Armstrong");

}
