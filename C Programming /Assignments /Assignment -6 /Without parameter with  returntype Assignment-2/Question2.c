//with  returntype and without  parameter 

int  Triangle(); //function declaration 
void main()
{
	int res;
	Triangle(); // function calling 
	if(res==1)
	{
		printf("It is an Equilateral Triangle\n");
	} else if(res==2)
	{
		 printf("It is an Isosceles Triangle\n");	
	}else if(res==3)
	{
		printf("It is a Scalene Triangle\n");
	}
}
int Triangle() //function called 
{
	 int a = 10;   // hardcoded side 1
    int b = 10;   // hardcoded side 2
    int c = 5;    // hardcoded side 3

  // First check if triangle is valid
    if (a + b > c && a + c > b && b + c > a) {

        if (a == b && b == c) {
          return 1;
        }
        else if (a == b || b == c || a == c) {
           return 2;
        }
        else {
            return 3;
        }

    } else 
        printf("Invalid Triangle\n");
    }
}
