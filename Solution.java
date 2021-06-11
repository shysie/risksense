import java.util.*;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;


public class Solution {

    public static Map counter(List<String> wordList) {
        Map<String, Integer> wordMap = new HashMap<String, Integer>();
        for (String word : wordList){
            wordMap.merge(word, 1, Integer::sum);
        }
        return wordMap;
    }


    @Test
    void testCase1() {
        System.out.println("in test case 1");
        ArrayList test = new ArrayList<String>(Arrays.asList("a", "b", "c", "ab", "ab", "cd"));
        HashMap expected = new HashMap(){{
            put("a", 1);
            put("b", 1);
            put("c", 1);
            put("ab", 2);
            put("cd", 1);
        }};
        assertEquals(expected, Solution.counter(test));
    }

    @Test
    void testCase2() {
        System.out.println("in test case 2");
        assertEquals(new HashMap(), Solution.counter(new ArrayList<String>()));
    }

}
