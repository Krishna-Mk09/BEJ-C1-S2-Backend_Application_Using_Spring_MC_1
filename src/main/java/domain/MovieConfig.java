/*
 * Author Name : M.Krishna.
 * Date: 16-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */

package domain;

import org.springframework.context.annotation.Bean;

public class MovieConfig {
    /**
     * The @Bean annotation tells Spring that the method will return an object that should be registered as a bean in the
     * Spring application context
     *
     * @return A Movie object with the given parameters.
     */
    @Bean("movieBean3")
    public Movie getMovieBean3() {
        return new Movie("Titanic", "Jack", "Rose", 7, "asdoc");
    }

    /**
     * The @Bean annotation tells Spring that the method will return an object that should be registered as a bean in the
     * Spring application context
     *
     * @return A Movie object with the given parameters.
     */
    @Bean("movieBean4")
    public Movie getMovieBean4() {
        return new Movie("Titanic", "Jack", "Rose", 7, "asdoc");
    }

    /**
     * @return A Movie object
     * @Bean("movieBean1") is a function that returns a new Movie object with the given parameters
     */
    @Bean("movieBean1")
    public Movie getMovieBean1() {
        return new Movie("Titanic", "Jack", "Rose", 7, "asdoc");
    }


    /**
     * @return Movie Object
     * @Bean annotation is used to create a bean in the Spring container
     */
    @Bean("movieBean2")
    public Movie getMovieBean2() {
        return new Movie("ArjunReddy", "Vijay", "shalini", 8, "asdoc");
    }


}
