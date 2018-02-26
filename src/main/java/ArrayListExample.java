import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {


    private ArrayList<String> words;
    private ArrayList<Integer> numbers;

    public ArrayListExample(ArrayList<Integer> numbers) {
        this.words = new ArrayList<>();
        this.numbers = numbers;
    }

    public void add(String word) {
        words.add(word);
    }

    public int getWordCount() {
        return words.size();
    }

    public String getWordAtIndex(int index) {
        return words.get(index);
    }

    public int getTotal() {
        int total = 0;
        for(int number : this.numbers){
            total += number;
        }
        return total;
    }

    public int getRandomNumber(){
        Collections.shuffle(numbers);
        return numbers.get(0);
    }

    public ArrayList<Integer> getNumbers(){
        return new ArrayList<>(this.numbers);  // returns a copy of the arraylist, so the arraylist in the class remains encapsulate
    }                                          // because the original arraylist might get changed/manipulate elsewhere, so good practice

}