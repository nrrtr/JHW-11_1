import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Film;
import ru.netology.FilmManager;
import ru.netology.FilmRepo;

import java.net.FileNameMap;

public class FilmRepoTest {
    Film first = new Film(1, "one", "one");
    Film second = new Film(2, "two", "two");
    Film third = new Film(3, "three", "three");
    Film fourth = new Film(4, "four", "four");
    Film fifth = new Film(5, "five", "five");
    Film sixth = new Film(6, "six", "six");
    Film seventh = new Film(7, "seven", "seven");
    Film eighth = new Film(8, "eight", "eight");
    Film ninth = new Film(9, "nine", "nine");
    Film tenth = new Film(10, "ten", "ten");

    @Test
    void shouldFindBlankResultWithFindAll() {
        FilmRepo fr = new FilmRepo();
        Film[] expected = {};
        Assertions.assertArrayEquals(expected, fr.findAll());
    }

    @Test
    void shouldFindAll() {
        FilmRepo fr = new FilmRepo();
        fr.save(first);
        fr.save(second);
        fr.save(third);
        fr.save(fourth);
        fr.save(fifth);
        fr.save(sixth);
        fr.save(seventh);
        fr.save(eighth);
        fr.save(ninth);
        fr.save(tenth);


        Film[] er = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};
        Assertions.assertArrayEquals(er, fr.findAll());
    }

    @Test
    void shouldSaveFilmToEmpty() {
        FilmRepo fr = new FilmRepo();
        fr.save(first);

        Film[] er = {first};
        Assertions.assertArrayEquals(er, fr.getFilms());
    }

    @Test
    void shouldSaveFilmToNotEmpty() {
        FilmRepo fr = new FilmRepo();
        fr.save(first);
        fr.save(second);

        Film[] expectedResult = {first, second};
        Assertions.assertArrayEquals(expectedResult, fr.getFilms());
    }


    @Test
    void shouldFindById() {
        FilmRepo filmRepo = new FilmRepo();
        filmRepo.save(fifth);
        Film er = fifth;
        Assertions.assertEquals(er, filmRepo.findById(5));
    }

    @Test
    void shouldFindNullInEmpty() {
        FilmRepo fr = new FilmRepo();
        Film er = null;
        Assertions.assertEquals(er, fr.findById(1));
    }

    @Test
    void shouldFindNullInNotEmpty() {
        FilmRepo filmRepo = new FilmRepo();
        filmRepo.save(first);
        filmRepo.save(fifth);
        filmRepo.save(second);

        Film er = null;
        Assertions.assertEquals(er, filmRepo.findById(3));
    }

    @Test
    void shouldRemoveByIDEmpty() {
        FilmRepo fr = new FilmRepo();
        fr.removeById(1);
        Film[] er = {};
        Assertions.assertArrayEquals(er, fr.getFilms());
    }

    @Test
    void shouldRemoveByIdWithOnlyOneFilm() {
        FilmRepo fr = new FilmRepo();
        fr.save(first);
        fr.removeById(1);
        Film[] expected = {};
        Assertions.assertArrayEquals(expected, fr.getFilms());
    }

    @Test
    void shouldRemoveByIdWithNonEmpty() {
        FilmRepo fr = new FilmRepo();
        fr.save(first);
        fr.save(second);
        fr.save(third);
        fr.save(tenth);
        fr.save(fourth);
        fr.save(fifth);
        fr.removeById(10);
        Film[] er = {first, second, third, fourth, fifth};
        Assertions.assertArrayEquals(er, fr.getFilms());
    }

    @Test
    void shouldRemoveAll() {
        FilmRepo filmRepo = new FilmRepo();
        filmRepo.save(first);
        filmRepo.save(second);
        filmRepo.save(third);
        filmRepo.removeAll();
        Film[] eRes = {};
        Assertions.assertArrayEquals(eRes, filmRepo.getFilms());
    }

    @Test
    void shouldRemoveAllWithEmpty() {
        FilmRepo tt = new FilmRepo();
        tt.removeAll();
        Film[] expected = {};
        Assertions.assertArrayEquals(expected, tt.getFilms());
    }
}
