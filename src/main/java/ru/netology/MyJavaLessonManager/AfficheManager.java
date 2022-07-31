package ru.netology.MyJavaLessonManager;

public class AfficheManager {

    private String[] movies = new String[0];

    private int limitLastMovies;

    public AfficheManager() {
        this.limitLastMovies = 10;
    }

    public AfficheManager(int limitLastMovies) {
        this.limitLastMovies = limitLastMovies;
    }

    public void addNewMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAllMovies() {
        String[] tmp = new String[movies.length];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1];
        }
        return movies;
    }

    public String[] findLastMovies() {
        int askingLimitMovies;
        if (limitLastMovies <= movies.length) {
            askingLimitMovies = limitLastMovies;
        } else {
            askingLimitMovies = movies.length;
        }
        String[] tmp = new String[askingLimitMovies];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}