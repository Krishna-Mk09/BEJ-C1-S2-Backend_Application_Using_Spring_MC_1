/*
 * Author Name : M.Krishna.
 * Date: 16-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */

package domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MovieImpl {
    /**
     * The main function creates an ApplicationContext object, which is an interface that represents the Spring IoC
     * container. The ApplicationContext object is created by passing the MovieConfig class to the
     * AnnotationConfigApplicationContext class. The ApplicationContext object is then used to get the Movie object
     */
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MovieConfig.class);
        Movie movie1 = (Movie) context.getBean("movieBean1");
        System.out.println(movie1);
        Movie movie2 = (Movie) context.getBean("movieBean1");
        System.out.println(movie2);
        Movie movie3 = (Movie) context.getBean("movieBean1");
        System.out.println(movie3);
        Movie movie4 = (Movie) context.getBean("movieBean1");
        System.out.println(movie4);
    }
}
