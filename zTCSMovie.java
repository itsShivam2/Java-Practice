import java.util.*;

public class zTCSMovie {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Movie[] movies = new Movie[4];

        for (int i = 0; i < 4; i++) {
            String name = sc.nextLine();
            String company = sc.nextLine();
            String genre = sc.nextLine();
            int budget = sc.nextInt();
            sc.nextLine();
            movies[i] = new Movie(name, company, genre, budget);
        }

        String genre = sc.nextLine();

        Movie[] matchingMovies = getMovieByGenre(movies, genre);

        if (matchingMovies == null) {
            System.out.println("No movies found with the given genre.");
        } else {
            for (Movie movie : matchingMovies) {
                if (movie.getbudget() > 800000000)
                    System.out.println(movie.getname() + " " + "High Budget");
                else
                    System.out.println(movie.getname() + " " + "Low Budget");
            }
        }

        sc.close();
    }

    public static Movie[] getMovieByGenre(Movie[] movies, String genre) {
        List<Movie> matchingMovies = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getgenre().equalsIgnoreCase(genre)) {
                matchingMovies.add(movie);
            }
        }
        if (matchingMovies.isEmpty()) {
            return null;
        } else
            return matchingMovies.toArray(new Movie[0]);
    }

}

class Movie {
    private String name;
    private String company;
    private String genre;
    private int budget;

    public Movie(String name, String company, String genre, int budget) {
        this.name = name;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

    public String getname() {
        return name;
    }

    public String getcompany() {
        return company;
    }

    public String getgenre() {
        return genre;
    }

    public int getbudget() {
        return budget;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setcompany(String company) {
        this.company = company;
    }

    public void setgenre(String genre) {
        this.genre = genre;
    }

    public void setbudget(int budget) {
        this.budget = budget;
    }
}