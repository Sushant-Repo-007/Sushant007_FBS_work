//with  returntype and with  parameter 

int Result(int); //function declaration 
void main()
{
	int marks;
	printf("Enter the marks ");
	scanf("%d",&marks); 
	int res;
	res=Result(marks); // function calling 
	if(res==0){
		printf("Distinction\n");
	} else if(res==1){
		 printf("First Class\n");	
	}else if(res==2){
		 printf("Second Class\n");	
	}else if (res==3) {
        printf("Pass Class\n");
    }
	
}
int Result(int marks) //function called 
{
	   // hardcoded value

    if (marks > 75) {
     	return 0;   
    }
    else if (marks > 65) {
       return 1;
    }
    else if (marks > 55) {
        return 2;
    }
    else if (marks >= 40) {
       	return 3;
    }
    else {
        printf("Fail\n");
    }

 
}
