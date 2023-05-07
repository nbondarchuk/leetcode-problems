package strings.ValidAnagram_242;

/**
 * <a href="https://leetcode.com/problems/valid-anagram/description/">Valid Anagram</a>
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(new Solution().isAnagram("anagram", "nagaram"));
        System.out.println(new Solution().isAnagram("rat", "car"));

        System.out.println("---");

        System.out.println(new Solution2().isAnagram("anagram", "nagaram"));
        System.out.println(new Solution2().isAnagram("rat", "car"));
    }
}
