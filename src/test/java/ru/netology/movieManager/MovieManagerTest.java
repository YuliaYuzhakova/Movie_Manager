package ru.netology.movieManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

public class MovieManagerTest {
    private Movie movie1 = new Movie(1, "Бладшот", "боевик", false);
    private Movie movie2 = new Movie(2, "Вперед", "мультфильм", false);
    private Movie movie3 = new Movie(3, "Отель Белград", "комедия", false);
    private Movie movie4 = new Movie(4, "Джентельмены", "боевик", false);
    private Movie movie5 = new Movie(5, "Человек-невидимка", "ужасы", false);
    private Movie movie6 = new Movie(6, "Тролли.Мировой тур", "мультфильм", true);
    private Movie movie7 = new Movie(7, "Номер один", "комедия", true);
    private Movie movie8 = new Movie(8, "Один вдох", "драма", false);
    private Movie movie9 = new Movie(9, "Пиноккио", "фентези", true);
    private Movie movie10 = new Movie(10, "Кукла2: Брамс", "ужасы", true);
    private Movie movie11 = new Movie(11, "Остров фантазий", "ужасы", false);

    @Test
    public void addNewMovie() {
        MovieManager movie = new MovieManager();
        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);

        Movie[] actual = movie.findAll();
        Movie[] expected = {movie1, movie2, movie3, movie4, movie5};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addNullNewMovie() {
        MovieManager movie = new MovieManager();
        Movie[] actual = movie.findAll();
        Movie[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllInLimitTen() {
        MovieManager movie = new MovieManager();
        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);
        movie.add(movie8);
        movie.add(movie9);
        movie.add(movie10);

        Movie[] actual = movie.findAll();
        Movie[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllInOverLimitTen() {
        MovieManager movie = new MovieManager();
        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);
        movie.add(movie8);
        movie.add(movie9);
        movie.add(movie10);
        movie.add(movie11);

        Movie[] actual = movie.findAll();
        Movie[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllInLimit() {
        MovieManager movie = new MovieManager(5);
        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);
        movie.add(movie8);
        movie.add(movie9);
        movie.add(movie10);

        Movie[] actual = movie.findAll();
        Movie[] expected = {movie1, movie2, movie3, movie4, movie5};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastAddMovie() {
        MovieManager movie = new MovieManager();
        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        Movie[] actual = movie.findLast();
        Movie[] expected = {movie5, movie4, movie3, movie2, movie1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastAddMovieInLimit() {
        MovieManager movie = new MovieManager();
        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);
        movie.add(movie8);
        movie.add(movie9);
        movie.add(movie10);
        Movie[] actual = movie.findLast();
        Movie[] expected = {movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastAddMovieInLimit5() {
        MovieManager movie = new MovieManager(5);
        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);
        movie.add(movie8);
        movie.add(movie9);
        movie.add(movie10);
        Movie[] actual = movie.findLast();
        Movie[] expected = {movie10, movie9, movie8, movie7, movie6};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastAddMovieOverLimit() {
        MovieManager movie = new MovieManager();
        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);
        movie.add(movie8);
        movie.add(movie9);
        movie.add(movie10);
        movie.add(movie11);
        Movie[] actual = movie.findLast();
        Movie[] expected = {movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};
        Assertions.assertArrayEquals(expected, actual);
    }
}
