import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    Feline feline;

    @Before
    public void createFeline() {
        feline = new Feline();
    }

    @Test
    public void getKittensReturnOne() {
        int expected = 1;
        assertEquals(expected, feline.getKittens());
    }

    @Test
    public void getKittensReturnThree() {
        int expected = 3;
        int numberOfKittens = 3;
        assertEquals(expected, feline.getKittens(numberOfKittens));
    }

    @Test
    public void getFamilyReturnFeline() {
        String expected = "Кошачьи";
        assertEquals(expected, feline.getFamily());
    }

    @Test
    public void eatMeatReturnPredatorFood() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, feline.eatMeat());
    }

}