import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    Cat cat;

    @Mock
    Feline feline;

    @Before
    public void createFeline() {
        cat = new Cat(feline);
    }

    @Test
    public void getSoundReturnMeow() {
        String expected = "Мяу";
        assertEquals(expected, cat.getSound());
    }

    @Test
    public void getFoodCallEatMeat() throws Exception {
        cat.getFood();
        Mockito.verify(feline).eatMeat();
    }
}
