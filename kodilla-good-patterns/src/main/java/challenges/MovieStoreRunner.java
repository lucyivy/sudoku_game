package challenges;

import java.util.stream.Collectors;

public class MovieStoreRunner {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String theResultStringOfMovies = movieStore.getMovies().entrySet().stream()
                .flatMap(movies -> movies.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(theResultStringOfMovies);
    }
}
