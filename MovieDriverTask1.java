import java.util.Scanner;

public class MovieDriver_task1
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    // Getting information from user.
	    System.out.println("Enter name of movie: ");
	    String movieTitle = scanner.nextLine();
	    
	    System.out.println("Enter rating of movie: ");
	    String movieRating = scanner.nextLine();
	    
	    System.out.println("Enter tickets sold: ");
	    int movieTickets_Sold = scanner.nextInt();
	    
	    // movie object, passing movie infomration for termial display.
		Movie movie = new Movie(movieTitle,movieRating,movieTickets_Sold);
		System.out.println(movie.toString());
	}
}
