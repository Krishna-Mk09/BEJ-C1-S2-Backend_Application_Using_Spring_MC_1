/*
 * Author Name : M.Krishna.
 * Date: 16-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */

package domain;

public class Movie {

    // Declaring the variables.
    private String movieName;
    private String movieActor;
    private String movieActress;
    private int movieRating;
    private String movieType;

    // This is a default constructor.
    public Movie() {
    }

    // This is a constructor.
    public Movie(String movieName, String movieActor, String movieActress, int movieRating, String movieType) {
        this.movieName = movieName;
        this.movieActor = movieActor;
        this.movieActress = movieActress;
        this.movieRating = movieRating;
        this.movieType = movieType;
    }

    // This is a getter and setter method.
    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieActor() {
        return movieActor;
    }

    public void setMovieActor(String movieActor) {
        this.movieActor = movieActor;
    }

    public String getMovieActress() {
        return movieActress;
    }

    public void setMovieActress(String movieActress) {
        this.movieActress = movieActress;
    }

    public int getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(int movieRating) {
        this.movieRating = movieRating;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    /**
     * The toString() method returns a string representation of the object
     *
     * @return The movieName, movieActor, movieActress, movieRating, and movieType are being returned.
     */
    @Override
    public String toString() {
        return "Movie{" + "movieName='" + movieName + '\'' + ", movieActor='" + movieActor + '\'' + ", movieActress='" + movieActress + '\'' + ", movieRating=" + movieRating + ", movieType='" + movieType + '\'' + '}';
    }
}
