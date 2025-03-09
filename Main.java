package classAndObject.homeWork;

import java.time.Instant;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setMovie(1, "123", "The Avengers", "The Avengers is a team of superheroes appearing in American comic books published by Marvel Comics.", Date.from(Instant.now()), new String[]{"Action", "Adventure", "Sci-Fi"});

        Movie movie2 = new Movie();
        movie2.setMovie(2, "456", "The Dark Knight", "The Dark Knight is a 2008 superhero film directed, produced, and co-written by Christopher Nolan.", Date.from(Instant.now()), new String[]{"Action", "Crime", "Drama"});

        Movie movie3 = new Movie();
        movie3.setMovie(3, "789", "The Shawshank Redemption", "The Shawshank Redemption is a 1994 American drama film written and directed by Frank Darabont, based on the 1982 Stephen King novella Rita Hayworth and Shawshank Redemption.", Date.from(Instant.now()), new String[]{"Drama"});

        Movie movie4 = new Movie();
        movie4.setMovie(4, "101", "The Godfather", "The Godfather is a 1972 American crime film directed by Francis Ford Coppola, who co-wrote the screenplay with Mario Puzo, based on Puzo's best-selling 1969 novel of the same name.", Date.from(Instant.now()), new String[]{"Crime", "Drama"});

        Movie movie5 = new Movie();
        movie5.setMovie(5, "112", "The Lord of the Rings: The Return of the King", "The Lord of the Rings: The Return of the King is a 2003 epic fantasy adventure film directed by Peter Jackson, based on the third volume of J. R. R. Tolkien's The Lord of the Rings.", Date.from(Instant.now()), new String[]{"Action", "Adventure", "Drama"});

        List<Movie> movies = List.of(movie, movie2, movie3, movie4, movie5);

        for (Movie m : movies) {
            System.out.println("=".repeat(30));
            System.out.println("Movie List");
            System.out.println("=".repeat(30));
            System.out.println(m);
        }
    }
}
