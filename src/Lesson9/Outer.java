package Lesson9;

public class Outer {

    int nums[];

    Outer(int[] nums) {
        this.nums = nums;
    }

    void analyze() {
        Inner inOb = new Inner();

        System.out.println("minimum: " + inOb.min());
    }

    class Inner {
        int min() {
            int m = nums[0];

            for (int i = 0; i < nums.length; i++)
                if (nums[i] < m) m = nums[i];
            return m;
        }
    }
}

