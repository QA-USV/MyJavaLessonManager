package ru.netology.MyJavaLessonManager;

import jdk.management.jfr.FlightRecorderMXBean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfficheManagerTest {

//    @Test
//    public void shouldAddNewMovie() {
//
//        AfficheManager manager = new AfficheManager();
//
//        manager.addNewMovie("movie-01");
//        manager.addNewMovie("movie-02");
//        manager.addNewMovie("movie-03");
//        manager.addNewMovie("movie-04");
//        manager.addNewMovie("movie-05");
//        manager.addNewMovie("movie-06");
//
//        String[] expected = {"movie-01", "movie-02", "movie-03", "movie-04", "movie-05", "movie-06"};
//        String[] actual = manager.addNewMovie();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }

    @Test
    public void shouldFindLastMovies() {

        AfficheManager manager = new AfficheManager(5);

        manager.addNewMovie("movie-01");
        manager.addNewMovie("movie-02");
        manager.addNewMovie("movie-03");
        manager.addNewMovie("movie-04");
        manager.addNewMovie("movie-05");
        manager.addNewMovie("movie-06");
        manager.addNewMovie("movie-07");
        manager.addNewMovie("movie-08");
        manager.addNewMovie("movie-09");
        manager.addNewMovie("movie-10");
        manager.addNewMovie("movie-11");
        manager.addNewMovie("movie-12");

        String[] expected = {"movie-12", "movie-11", "movie-10", "movie-09", "movie-08"};
        String[] actual = manager.findLastMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesExactArray() {

        AfficheManager manager = new AfficheManager();

        manager.addNewMovie("movie-01");
        manager.addNewMovie("movie-02");
        manager.addNewMovie("movie-03");
        manager.addNewMovie("movie-04");
        manager.addNewMovie("movie-05");
        manager.addNewMovie("movie-06");
        manager.addNewMovie("movie-07");
        manager.addNewMovie("movie-08");

        String[] expected = {"movie-08", "movie-07", "movie-06", "movie-05", "movie-04", "movie-03", "movie-02", "movie-01"};
        String[] actual = manager.findLastMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesWhenZero() {


        AfficheManager manager = new AfficheManager(0);

        String[] expected = {};
        String[] actual = manager.findLastMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllMovies() {

        AfficheManager manager = new AfficheManager();

        manager.addNewMovie("movie-01");
        manager.addNewMovie("movie-02");
        manager.addNewMovie("movie-03");
        manager.addNewMovie("movie-04");
        manager.addNewMovie("movie-05");
        manager.addNewMovie("movie-06");
        manager.addNewMovie("movie-07");

        String[] expected = {"movie-01", "movie-02", "movie-03", "movie-04", "movie-05", "movie-06", "movie-07"};
        String[] actual = manager.findAllMovies();

        Assertions.assertArrayEquals(expected, actual);
    }
}