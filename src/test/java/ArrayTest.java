import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ArrayTest {

    private ArrayListExample arrayListExample;

    @Before
    public void before() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        arrayListExample = new ArrayListExample(numbers);
    }

    @Test
    public void canAddItem() {
        arrayListExample.add("Hello");
        assertEquals(1, arrayListExample.getWordCount());
    }

    @Test
    public void canTotalNumbers() {
        assertEquals(10, arrayListExample.getTotal());
    }

    @Test
    public void canGetRandomNumber(){
        ArrayList results = arrayListExample.getNumbers();
        int randomNumber = arrayListExample.getRandomNumber();
        assertTrue(results.contains(randomNumber));
    }

}