package Movie;

import java.util.ArrayList;
import java.util.List;


public class MovieMain {
    public static void main(String[] args) {
        List<String> actors = new ArrayList<>();
        actors.add("Joy");
        actors.add("D.O");
        
        Movie movie = new Movie("Girl Next Door", "Abter", actors);
        System.out.println("Title: " + movie.getTitle());
        System.out.println("Director: " + movie.getDirector());
        System.out.println("Actors: " + movie.getActors());
        
        movie.setReview("Great movie!");
        movie.setReview("Excellent acting.");
        System.out.println("Reviews: " + movie.retrieveReviews());
        
        movie.setTitle("Behind Close Door");
        System.out.println("Updated Title: " + movie.getTitle());
    }
}