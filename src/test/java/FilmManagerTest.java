import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.*;

public class FilmManagerTest {
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
    Film eleventh = new Film(11, "eleven", "eleven");
    Film twelfth = new Film(12, "twelve", "twelve");
    Film thirteenth = new Film(13, "thirteen", "thirteen");
    Film fourteenth = new Film(14, "fourteen", "fourteen");
    Film fifteenth = new Film(15, "fifteen", "fifteen");
    Film sixteenth = new Film(16, "sixteen", "sixteen");
    Film seventeenth = new Film(17, "seventeen", "seventeen");

    @Test
    void shouldAddFilmToEmptyManager() {
        FilmManager fm = new FilmManager();
        fm.addFilm(first);

        Film[] er = {first};
        Assertions.assertArrayEquals(er, fm.getFilms());
    }

    @Test
    void shouldAddFilmToNotEmptyManager() {
        FilmManager fm = new FilmManager();
        fm.addFilm(first);
        fm.addFilm(second);

        Film[] expectedResult = {first, second};
        Assertions.assertArrayEquals(expectedResult, fm.getFilms());
    }

    @Test
    void shouldFindBlankResultWithDefConstr() {
        FilmManager flm = new FilmManager();
        Film[] expected = {};
        Assertions.assertArrayEquals(expected, flm.findAll());
    }

    @Test
    void shouldFindBlankResultWithCustomConstr() {
        FilmManager flm = new FilmManager(5);
        Film[] expected = {};
        Assertions.assertArrayEquals(expected, flm.findAll());
    }

    @Test
    void shouldFindLessThenLimitWithDefConstr() {
        FilmManager fm = new FilmManager();
        fm.addFilm(first);

        Film[] er = {first};
        Assertions.assertArrayEquals(er, fm.findAll());
    }

    @Test
    void shouldFindLessThenLimitWithCustomConstr() {
        FilmManager fm = new FilmManager(15);
        fm.addFilm(first);

        Film[] er = {first};
        Assertions.assertArrayEquals(er, fm.findAll());
    }

    @Test
    void shouldFindAllLimitedByDefConstr() {
        FilmManager fm = new FilmManager();
        fm.addFilm(first);
        fm.addFilm(second);
        fm.addFilm(third);
        fm.addFilm(fourth);
        fm.addFilm(fifth);
        fm.addFilm(sixth);
        fm.addFilm(seventh);
        fm.addFilm(eighth);
        fm.addFilm(ninth);
        fm.addFilm(tenth);

        Film[] er = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};
        Assertions.assertArrayEquals(er, fm.findAll());
    }

    @Test
    void shouldFindAllLimitedByCustomConstr() {
        FilmManager fm = new FilmManager(17);
        fm.addFilm(first);
        fm.addFilm(second);
        fm.addFilm(third);
        fm.addFilm(fourth);
        fm.addFilm(fifth);
        fm.addFilm(sixth);
        fm.addFilm(seventh);
        fm.addFilm(eighth);
        fm.addFilm(ninth);
        fm.addFilm(tenth);
        fm.addFilm(eleventh);
        fm.addFilm(twelfth);
        fm.addFilm(thirteenth);
        fm.addFilm(fourteenth);
        fm.addFilm(fifteenth);
        fm.addFilm(sixteenth);
        fm.addFilm(seventeenth);


        Film[] er = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth};
        Assertions.assertArrayEquals(er, fm.findAll());
    }

    @Test
    void shouldFindAllOverLimitedByDefConstr() {
        FilmManager fm = new FilmManager();
        fm.addFilm(first);
        fm.addFilm(second);
        fm.addFilm(third);
        fm.addFilm(fourth);
        fm.addFilm(fifth);
        fm.addFilm(sixth);
        fm.addFilm(seventh);
        fm.addFilm(eighth);
        fm.addFilm(ninth);
        fm.addFilm(tenth);
        fm.addFilm(eleventh);

        Film[] er = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};
        Assertions.assertArrayEquals(er, fm.findAll());
    }

    @Test
    void shouldFindAllOverLimitedByCustomConstr() {
        FilmManager fm = new FilmManager(4);
        fm.addFilm(first);
        fm.addFilm(second);
        fm.addFilm(third);
        fm.addFilm(fourth);
        fm.addFilm(fifth);
        fm.addFilm(sixth);
        fm.addFilm(seventh);

        Film[] er = {first, second, third, fourth, fifth, sixth, seventh};
        Assertions.assertArrayEquals(er, fm.findAll());
    }

    @Test
    void shouldFindLastBlankWithDefConstr() {
        FilmManager fm = new FilmManager();
        Film[] er = {};
        Assertions.assertArrayEquals(er, fm.findLast());
    }
    @Test
    void shouldFindLastBlankWithCustomConstr() {
        FilmManager fm = new FilmManager();
        Film[] er = {};
        Assertions.assertArrayEquals(er, fm.findLast());
    }


    @Test
    void shouldFindLastOfDefaultConstructorStack() {
        FilmManager manager = new FilmManager();
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);

        Film[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    @Test
    void shouldFindLastOfCustomConstructorStack() {
        FilmManager manager = new FilmManager(7);
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);

        Film[] expected = {seventh, sixth, fifth, fourth, third, second, first};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    @Test
    void shouldFindLastItemsWithCustomConstructor() {
        FilmManager fm = new FilmManager(5);
        fm.addFilm(first);
        fm.addFilm(second);
        fm.addFilm(third);
        fm.addFilm(fourth);
        fm.addFilm(fifth);
        fm.addFilm(sixth);
        fm.addFilm(seventh);
        fm.addFilm(eighth);
        fm.addFilm(ninth);
        fm.addFilm(tenth);
        fm.addFilm(eleventh);

        Film[] er = {eleventh, tenth, ninth, eighth, seventh};
        Assertions.assertArrayEquals(er, fm.findLast());
    }

    @Test
    void shouldFindOnlyTenLastOfDefaultConstructorStack() {
        FilmManager manager = new FilmManager();
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);
        manager.addFilm(eleventh);
        manager.addFilm(twelfth);
        manager.addFilm(thirteenth);
        manager.addFilm(fourteenth);

        Film[] expected = {fourteenth, thirteenth, twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }


}
