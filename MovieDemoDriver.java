import java.util.Scanner;

public class MovieDemoDriver {
	public static void main(String [] args)
	
	{
		char answer ;
		String ans;
		
		Scanner input =new Scanner(System.in);
		
		MovieDriver2 Movie1 = new MovieDriver2();
		do {	
		System.out.println("Enter the title of a movie");
		Movie1.setTitle(input.next());
		System.out.println("Enter the movie rating");
		Movie1.setRating(input.next());
		System.out.println("How many tickets were sold at MC theater?");
		Movie1.setSoldTickets(input.nextInt());
		
		System.out.println(Movie1.toString());
		
		System.out.println("Do you want to enter another movie? Enter y or n");
		ans =input.next();
		answer = ans.charAt(0);
				
	}
	while ( answer == 'Y'||answer == 'y');
	
	
	}

}
