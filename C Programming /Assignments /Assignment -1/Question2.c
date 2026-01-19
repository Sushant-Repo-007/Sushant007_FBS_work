void main()
{
	int first, last;
    int N = 123;

    first = N / 100;   // first digit
    last  = N % 10;    // last digit

    if (first == last)
    {
        printf("It is a palindrome");
    }
    else
    {
        printf("It is not a palindrome");
    }
	
}
