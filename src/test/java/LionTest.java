import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

@RunWith(Parameterized.class)
public class LionTest {

    Lion lion;

    @Mock
    Feline feline;

    private String lionSex;
    private boolean hasMane;

    public LionTest(String lionSex, boolean hasMane){
        this.lionSex = lionSex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static List<Object[]> lionSex() {
        return Arrays.asList(new Object[][] {
                {"Самец", true},
                {"Самка", false},
        });
    }

    @Before
    public void createLion () throws Exception {
        initMocks(this);
        lion = new Lion(lionSex,feline);
    }

    @Test
    public void shouldHaveMane() throws Exception {
        boolean expected = hasMane;
        assertEquals(expected, lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void shouldReturnException() throws Exception {
        lion = new Lion("йцукен", feline);
    }

    @Test
    public void shouldHaveOneKitten() throws Exception {
        int expected = 1;
        Mockito.when(lion.getKittens()).thenReturn(1);
        assertEquals(expected, lion.getKittens());
    }

    @Test
    public void shouldGetPredatorFood() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(lion.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(expected, lion.getFood());
    }
}
