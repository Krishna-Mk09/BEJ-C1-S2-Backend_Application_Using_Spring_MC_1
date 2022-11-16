/*
 * Author Name : M.Krishna.
 * Date: 16-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package domain;

import org.springframework.context.annotation.Bean;

public class MovieConfig {
    @Bean("movieBean1")
    public Movie getMovieBean1() {
        return new Movie("Titanic", "Jack", "Rose", 7, "asdkjfo");
    }

    @Bean("movieBean2")
    public Movie getMovieBean2() {
        return new Movie("ArjunReddy", "Vijay", "shalini", 8, "asdkjfo");
    }

    @Bean("movieBean3")
    public Movie getMovieBean3() {
        return new Movie("Titanic", "Jack", "Rose", 7, "asdkjfo");
    }

    @Bean("movieBean4")
    public Movie getMovieBean4() {
        return new Movie("Titanic", "Jack", "Rose", 7, "asdkjfo");
    }
}
