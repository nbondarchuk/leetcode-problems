package hashtable.InsertDeleteGetRandom_380;

import java.util.*;

class RandomizedSet {

    private final Random random = new Random();

    private final List<Integer> list = new ArrayList<>();

    private final Map<Integer, Integer> map = new HashMap<>();

    public RandomizedSet() {
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }

        list.add(val);
        map.put(val, list.size() - 1);

        return true;
    }

    public boolean remove(int val) {
        if (map.containsKey(val)) {
            int index = map.remove(val);
            if (index == list.size() - 1) {
                list.remove(index);
            } else {
                Integer lastElementValue = list.get(list.size() - 1);
                list.set(index, lastElementValue);
                list.remove(list.size() - 1);
                map.put(lastElementValue, index);
            }
            return true;
        }
        return false;
    }

    public int getRandom() {
        int index = random.nextInt(list.size());
        return list.get(index);
    }
}