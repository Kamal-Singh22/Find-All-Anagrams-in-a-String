import java.util.ArrayList;
import java.util.List;

public class FindAnagrams {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] pCount = new int[26]; 
        int[] sCount = new int[26]; 

        
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        
        for (int i = 0; i < s.length(); i++) {
            
            sCount[s.charAt(i) - 'a']++;

           
            if (i >= p.length()) {
                sCount[s.charAt(i - p.length()) - 'a']--;
            }

            
            if (matches(pCount, sCount)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }

    
    private static boolean matches(int[] pCount, int[] sCount) {
        for (int i = 0; i < 26; i++) {
            if (pCount[i] != sCount[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println("Start indices of anagrams: " + findAnagrams(s, p));
    }
}