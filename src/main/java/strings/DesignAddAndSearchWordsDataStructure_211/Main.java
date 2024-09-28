package strings.DesignAddAndSearchWordsDataStructure_211;

import common.Difficulty;

import static common.DifficultyLevel.MEDIUM;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/design-add-and-search-words-data-structure">Design Add and Search Words Data Structure</a>
 */
@Difficulty(MEDIUM)
class Main {

    public static void main(String[] args) {
        WordDictionary dict = new WordDictionary();
        dict.addWord("bad");
        dict.addWord("dad");
        dict.addWord("mad");

        assertThat(dict.search("pad")).isFalse();
        assertThat(dict.search("bad")).isTrue();
        assertThat(dict.search("..d")).isTrue();
        assertThat(dict.search("b..")).isTrue();
    }
}
