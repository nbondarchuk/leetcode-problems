package arrays.MajorityElement_169;

/**
 * See <a href="https://ru.wikipedia.org/wiki/Алгоритм_большинства_голосов_Бойера_—_Мура">Алгоритм большинства голосов Бойера — Мура</a>
 */
class Solution {

    public int majorityElement(int[] nums) {
        int majotiryElement = 0;
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (counter == 0) {
                majotiryElement = nums[i];
                counter++;
            } else {
                if (nums[i] == majotiryElement) {
                    counter++;
                } else {
                    counter--;
                }
            }
        }
        return majotiryElement;
    }
}
