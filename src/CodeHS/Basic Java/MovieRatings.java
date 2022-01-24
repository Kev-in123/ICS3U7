public class MovieRatings extends ConsoleProgram
{
    public void run()
    {
        double movieRating = readDouble("Please enter a movie rating: ");
        
        // Round the movieRating to the nearest int and print it out!
        int roundedMovieRating = (int) (movieRating + 0.5);
        System.out.println("Rating rounded: " + roundedMovieRating);

        
    }
}