import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Practice {

//public HashMap<Integer, Student> buildMap (Student[] students){
//    HashMap<Integer, Student> map = new HashMap<Integer, Student>();
//    for (Student s : students) map.put(s.getId(),s);
//    return map;
//}
// example hash map

    public static ArrayList<String> merge(String[] words, String[] more) {
        ArrayList<String> sentence = new ArrayList<String>();
        for (String w : words) sentence.add(w);
        for (String w : more) sentence.add(w);
        return sentence;;
    }

// Implement an algorithm to determine if a string has all unique characters. What is you cannot use additional data structures.






    public static void main(String[] args) {
        String[] newArr = {"fun", "dun", "bun"};
        String[] addArr = {"fan", "dan", "ban"};
        System.out.println(merge(newArr,addArr));

    }
};
