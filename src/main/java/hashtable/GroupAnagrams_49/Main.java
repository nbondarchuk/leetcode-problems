package hashtable.GroupAnagrams_49;

import common.Difficulty;

import java.util.Comparator;
import java.util.List;

import static common.DifficultyLevel.MEDIUM;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/group-anagrams">Group Anagrams</a>
 */
@Difficulty(MEDIUM)
class Main {

    public static void main(String[] args) {
        List<List<String>> result = new Solution().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});

        result.sort(Comparator.comparing(List::size));

        assertThat(result).size().isEqualTo(3);
        assertThat(result.get(0)).containsExactlyInAnyOrder("bat");
        assertThat(result.get(1)).containsExactlyInAnyOrder("nat", "tan");
        assertThat(result.get(2)).containsExactlyInAnyOrder("ate", "eat", "tea");
    }
}
