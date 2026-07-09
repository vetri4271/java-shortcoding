/*Given a pattern and a string s, find if s follows the same pattern.
Here, follow means a full match, such that there is a bijection between a letter in the pattern and a non-empty word in s.
Example 1
Input:
pattern = "abba"
s = "dog cat cat dog"
Output:
true
Example 2
Input:
pattern = "abba"
s = "dog cat cat fish"
Output:
false
Example 3
Input:
pattern = "aaaa"
s = "dog cat cat dog"
Output:
false
*/
import java.util.HashMap;

public class SameStringPattern {
    public static boolean wordPattern(String pattern, String s) {

    String[] sarr = s.split(" ");
    char[] pat = pattern.toCharArray();

    if (sarr.length != pat.length) {
        return false;
    }

    HashMap<Character, String> map = new HashMap<>();

    int i = 0;

    for (char ch : pat) {

        if (!map.containsKey(ch)) {
            map.put(ch, sarr[i]);
        }
        else if (map.get(ch).equals(sarr[i])) {
            
        }
        else {
            return false;
        }

        i++;
    }

    return true;
}
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
    }
}
