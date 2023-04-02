import com.example.Alex;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {
    Alex alex;

    @Mock
    Feline feline;

    @Before
    public void createFeline() throws Exception {
        alex = new Alex(feline);
    }

    @Test
    public void shouldBeListOfFriends() {
        List<String> expected = List.of("Марти", "Глория", "Мелман");
        assertEquals(expected, alex.getFriends());
    }

    @Test
    public void shouldBeNewYorkZoo() {
        String expected = "Нью-Йоркский зоопарк";
        assertEquals(expected, alex.getPlaceOfLiving());
    }

    @Test
    public void shouldHaveZeroKitten() {
        int expected = 0;
        assertEquals(expected, alex.getKittens());
    }
}
