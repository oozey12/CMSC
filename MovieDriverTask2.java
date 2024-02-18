import java.util.Scanner;

public class MovieDriver_task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepAsking = true;

        while (keepAsking) {
            // Getting information from user.
            System.out.println("Enter name of movie: ");
            String movieTitle = scanner.nextLine();

            System.out.println("Enter rating of movie: ");
            String movieRating = scanner.nextLine();
            

            System.out.println("Enter tickets sold: ");
            int movieTickets_Sold = scanner.nextInt();

            // movie object, passing movie infomration for terminal display.
            Movie movie = new Movie(movieTitle, movieRating, movieTickets_Sold);
            System.out.println(movie.toString());
            System.out.println(" ");
            // prevents incorrect format of prompts after 1 iteration of loop
            scanner.nextLine();
            // asks the user to enter information about another movie
            System.out.println("Enter another movie? ( y / n ): ");
            String response = scanner.nextLine();
            if(response.equals("n")){
                System.out.println("Goodbye.");
                keepAsking = false;
            }
            
        }

        scanner.close();
    }
}