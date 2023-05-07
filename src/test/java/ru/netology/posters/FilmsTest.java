package ru.netology.posters;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.domain.Films;

public class FilmsTest {
    Films film1 = new Films(12331, "Бладшот", 2019, "netology.ru", "боевик");
    Films film2 = new Films(21212, "Вперед", 2019, "netology.ru", "мультфильм");
    Films film3 = new Films(213231, "Отель Белград", 2020, "netology.ru", "комедия");
    Films film4 = new Films(6578987, "Джентельмены", 2019, "netology.ru", "боевик");
    Films film5 = new Films(23423, "Человек-невидимка", 2020, "netology.ru", "ужасы");
    Films film6 = new Films(9878457, "Тролли. Мировой тур", 2020, "netology.ru", "мультфильм");
    Films film7 = new Films(565749, "Номер один", 2020, "netology.ru", "комедия");

    @Test
    public void shouldFindAll() {
        FilmsManager manager = new FilmsManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        Films[] expected = {film1, film2, film3, film4, film5, film6, film7};
        Films[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindNone() {
        FilmsManager manager = new FilmsManager();
        Films[] expected = {};
        Films[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast5() {
        FilmsManager manager = new FilmsManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        Films[] expected = {film7, film6, film5, film4, film3};
        Films[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast7() {
        FilmsManager manager = new FilmsManager(7);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        Films[] expected = {film7, film6, film5, film4, film3, film2, film1};
        Films[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast0() {
        FilmsManager manager = new FilmsManager(0);
        Films[] expected = {};
        Films[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


}