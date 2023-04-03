import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    Lion lion;

    @Mock
    Feline feline;

    @Before
    public void createLion() throws Exception {
        lion = new Lion("Самец", feline);
    }

    @Test(expected = Exception.class)
    public void shouldReturnException() throws Exception {
        lion = new Lion("йцукен", feline);
    }

    @Test
    public void getKittensReturnOne() throws Exception {
        int expected = 1;
        Mockito.when(lion.getKittens()).thenReturn(1);
        assertEquals(expected, lion.getKittens());
    }

    @Test
    public void getFoodReturnPredatorFood() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(lion.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(expected, lion.getFood());
    }
}
