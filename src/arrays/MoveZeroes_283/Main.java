package arrays.MoveZeroes_283;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/move-zeroes/">Move Zeroes</a>
 * <p>
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 * </p>
 */
public class Main {

    static class Person {

        List<? super Person> children;

        public List<? super Person> getChildren() {
            return children;
        }

        void setChildren(List<Person> children) {
        }
    }

    static class Boy extends Person {
    }

    static class Girl extends Person {
    }

    public static void main(String[] args) {
        List<Person> child = new ArrayList<>();
        child.add(new Boy());
        child.add(new Girl());

        new Person().setChildren(child);
        new Person().setChildren(List.of(new Boy(), new Girl()));

        try {
            m1();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("1");
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("2");
        } catch (Exception e) {
            System.out.println("3");
        } finally {
            System.out.println("4");
        }

        System.out.println("end");

//        int[] nums = {0, 1, 0, 3, 12};
//        new Solution().moveZeroes(nums);
//        System.out.println(Arrays.toString(nums));
    }

    private static void m1() {
        System.out.println("m1");
        throw new IndexOutOfBoundsException();
    }
}
