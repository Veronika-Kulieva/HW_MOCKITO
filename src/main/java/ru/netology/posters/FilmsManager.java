package ru.netology.posters;

import ru.netology.domain.Films;

public class FilmsManager {
    private Films[] films = new Films[0];
    private int limit;

    public FilmsManager() {
        limit = 5;
    }

    public FilmsManager(int limit) {
        this.limit = limit;
    }

    public void addFilm(Films film) {
        Films[] tmp = new Films[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Films[] findAll() {
        return films;
    }

    public Films[] findLast() {
        Films[] all = findAll();
        Films[] resultLength;
        if (limit < all.length) {
            resultLength = new Films[limit];
        } else {
            resultLength = new Films[all.length];
        }
        for (int i = 0; i < resultLength.length; i++) {
            int index = all.length - 1 - i;
            resultLength[i] = all[index];
        }
        return resultLength;

    }
}
