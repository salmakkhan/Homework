package LAB;

import java.util.Scanner;
import java.lang.Math;


public class guessinggame 
{

	public static void main(String[] args) 
	
	{
	
		
		//Scanner newscanner= new Scanner(System.in);//creates Scanner
		boolean check=false; //boolean value for while loop 
		int number,counter=0;// number willbe input, counter keeps track of the while loop iterations 
		int rng=(int) (Math.random()*10+1);
				System.out.println(rng);
		while(check==false)
				{
			if(counter>2)
				{System.out.println("You're very wrong, LOSER!");
		break; // break exits the while loop
			
				}
			
			
			
				System.out.println("Pick a number from 1-10 NOW");
				number=new.Scanner.next.int();
			
			if(number==rng)
				{System.out.println("Ok, Ok, you can keep your retirment funds...");
				check=true;
					
				}
			else if((number+1==rng)||(number-1==rng))
				{System.out.println("HOT");
				
				}
			else if ((number+2==rng)||(number-2==rng))
				{
				System.out.println("Warm");
				
				}
			
		
			else
				
				System.out.println("cold"); // if you are any of the above you're cold
				}
				
		
		counter++; // increments the time through the loop
	}
}
		
		
		
	


