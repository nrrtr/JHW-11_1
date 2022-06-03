import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.*;

import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
public class FilmManagerTest {
    @Mock
    private FilmRepo MockedRepo;
    @InjectMocks
    private FilmManager MockedManager;
    private Film one = new Film(1, "name1", "genre1");
    private Film two = new Film(2, "name2", "genre2");
    private Film three = new Film(3, "name3", "genre3");
    private Film four = new Film(4, "name4", "genre4");
    private Film five = new Film(5, "name5", "genre5");
    private Film[] filmsArray = {one, two, three, four, five};

    @Test
    void shouldReturnMockedRepoFindAll() {
        doReturn(filmsArray).when(MockedRepo).findAll();

        Film[] er = {one, two, three, four, five};
        Assertions.assertArrayEquals(er, MockedManager.findAll());
    }

    @Test
    void shouldReturnMockedMockedRepoFindById() {
        doReturn(five).when(MockedRepo).findById(5);

        Film eRes = five;
        Film aRes = MockedManager.findById(5);
        Assertions.assertEquals(eRes, aRes);
    }

}
