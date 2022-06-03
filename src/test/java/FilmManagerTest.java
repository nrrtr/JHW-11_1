import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.*;

public class FilmManagerTest {
    Film first =  new Film(1,"one","one");
    Film second =  new Film(2,"two","two");
    Film third =  new Film(3,"three","three");
    Film fourth =  new Film(4,"four","four");
    Film fifth =  new Film(5,"five","five");
    Film sixth =  new Film(6,"six","six");
    Film seventh =  new Film(7,"seven","seven");
    Film eighth =  new Film(8,"eight","eight");
    Film ninth =  new Film(9,"nine","nine");
    Film tenth =  new Film(10,"ten","ten");
    Film eleventh =  new Film(11,"eleven","eleven");
    Film twelfth =  new Film(12,"twelve","twelve");
    Film thirteenth =  new Film(13,"thirteen","thirteen");
    Film fourteenth =  new Film(14,"fourteen","fourteen");
    Film fifteenth =  new Film(15,"fifteen","fifteen");
    Film sixteenth =  new Film(16,"sixteen","sixteen");
    Film seventeenth =  new Film(17,"seventeen","seventeen");

    @Test
    void shouldAddFilmToEmptyManager() {
        FilmManager fm = new FilmManager();
        fm.addFilm(first);

        Film[] er = {first};
        Assertions.assertArrayEquals(er, fm.getFilms());
    }
}
