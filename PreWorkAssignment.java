package greatlearning;

import java.util.Scanner;

public class PreWorkAssignment {
	
	Scanner sc=new Scanner(System.in);
	
	public void checkPalindrome()  {
		  
		int r,sum=0,temp;    
	
		 System.out.println("Enter the number to check palindrome");
		  int n=sc.nextInt();
		  
		  temp=n;    
		  while(n>0)
		  {    
		   r=n%10;  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("It is a palindrome number ");    
		  else    
		   System.out.println("It is not palindrome number");    
		}  

	
	public void printPattern() 
	{
		
		System.out.println("Enter the required number of pattern lines");
		int n= sc.nextInt();
		
		for(int i=n;i>=1;i--)
		
		{
			for(int j=0; j<i; j++) 
		{
				System.out.print("*");
		}
			System.out.println();
		}
		
	
    }
	
	 public void checkPrimeNumber() 
	 {
		 int m=0, flag=0; 
			System.out.println("Enter the number to check if the number is Prime or not");
			int n= sc.nextInt();
			
			 m=n/2;
			
				if(n==0||n==1)
				{
					System.out.println("Number is not a Prime Number");
				}
				else {
					
					for(int i=2;i<n;i++)
					{
						if(n%i==0)
						{
							System.out.println(n+" Is not a Prime Number");
							flag=1;
							break;
						}
					}
					
					if(flag==0)
					{
						System.out.println(n+ " Is a Prime Number");
					}
					
				}
	 }
				
      		 public void printFibonacciSeries() 
				 {
					 int n1=0, n2=1,n3;
						
						System.out.println("Enter the range for the Fibonacci series");
						int r= sc.nextInt();
					
						
							System.out.print(n1+" "+n2);
						
						for(int n = 2; n<=r;n++)
						{
						    n3=n2+n1;
							System.out.print(" "+n3);
							
							n1=n2;
							n2=n3;
						}
						
		                
		         }

		 
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		PreWorkAssignment obj = new PreWorkAssignment();

          int choice;

          Scanner sc = new Scanner(System.in);

do {

System.out.println("\n Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();



choice = sc.nextInt();

switch (choice) {



case 0:

choice = 0;

break;



case 1: {

obj.checkPalindrome();

}

break;



case 2: {



obj.printPattern();

}

break;



case 3: {

obj.checkPrimeNumber();

}

break;



case 4: {



obj.printFibonacciSeries();

}

break;



default:

System.out.println("Invalid choice. Enter a valid no.\n");

}



} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}

	}
