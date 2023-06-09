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
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    Lion lion;

    @Mock
    Feline feline;

    @Before
    public void createLion() throws Exception {
        lion = new Lion("Самец", feline);
    }

    @Test
    public void shouldReturnException() {
        Exception exception = assertThrows(Exception.class, () -> new Lion("йцукен", feline));
        assertEquals("Используйте допустимые значения пола животного - самей или самка", exception.getMessage());
    }

    @Test
    public void getKittensCallFeline() {
        lion.getKittens();
        Mockito.verify(feline).getKittens();
    }
}
