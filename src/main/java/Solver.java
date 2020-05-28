package main.java;

import java.util.ArrayList;

public class Solver {

    private long gcd(long a1, long b1) {
        long a = Math.max(a1, b1);
        long b = Math.min(a1, b1);
        while (b > 0) {
            a %= b;
            long c = a;
            a = b;
            b = c;
        }
        return a;
    }

    public long gcd(ArrayList<Long> nums) {
        while (nums.size() > 2) {
            nums.set(0, gcd(nums.get(0), nums.get(1)));
            nums.remove(1);
        }
        return gcd(nums.get(0), nums.get(1));
    }

    private long lcm(long a, long b) {
        return (a * b) / (gcd(a, b));
    }

    public long lcm(ArrayList<Long> nums) {
        while (nums.size() > 2) {
            nums.set(0, lcm(nums.get(0), nums.get(1)));
            nums.remove(1);
        }
        return lcm(nums.get(0), nums.get(1));
    }

}
