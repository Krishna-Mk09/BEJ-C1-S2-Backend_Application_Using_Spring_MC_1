/*
 * Author Name : M.Krishna.
 * Date: 16-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */

package domain;

public class Movie {

    private String movieName;
    private String movieActor;
    private String movieActress;
    private int movieRating;
    private String movieType;

    public Movie() {
    }

    public Movie(String movieName, String movieActor, String movieActress, int movieRating, String movieType) {
        this.movieName = movieName;
        this.movieActor = movieActor;
        this.movieActress = movieActress;
        this.movieRating = movieRating;
        this.movieType = movieType;
    }
}
