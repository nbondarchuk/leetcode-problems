package hashtable.InsertDeleteGetRandom_380;

import common.Difficulty;

import static common.DifficultyLevel.MEDIUM;

/**
 * <a href="">Insert Delete GetRandom O(1)</a>
 */
@Difficulty(MEDIUM)
class Main {

    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        System.out.println(obj.insert(1));
        System.out.println(obj.remove(1));
        System.out.println(obj.remove(2));
        System.out.println(obj.insert(2));
        System.out.println(obj.getRandom());
    }
}
