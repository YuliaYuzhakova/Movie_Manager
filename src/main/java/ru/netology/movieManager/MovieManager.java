package ru.netology.movieManager;

import ru.netology.domain.Movie;

public class MovieManager {
    private Movie[] movies = new Movie[0];
    private int countMovie = 10;

    public MovieManager() {
    }

    public MovieManager(int countMovie) {

        this.countMovie = countMovie;
    }

    //Добавление нового фильма.
    public void add(Movie movie) {
        //создаем новый массив, где length - длина нового массива
        //movies.length + 1 - это длинна исходного массива + одна новая ячейка
        //tmp - название нового массива
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];

        //перебираем ячейки, копируем старый массив
        //и добавляем еще одну пустую ячейку - i
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        //заполняем последнюю ячейку
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    //Вывод всех фильмов в порядке добавления
    public Movie[] findAll() {
        int resultLength = movies.length;
        if (resultLength > countMovie) {
            resultLength = countMovie;
        } else {
            resultLength = movies.length;
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[i];
        }
        return result;
    }

    //Вывод максимум лимит последних добавленных фильмов в обратном от добавления порядке
    public Movie[] findLast() {
        int resultLength = movies.length;
        if (resultLength > countMovie) {
            resultLength = countMovie;
        } else {
            resultLength = movies.length;
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}
