import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;

        if (isHappy(n)) {
            System.out.println(n + " is Happy number");
        } else {
            System.out.println(n + " is not a Happy number");
        }
    }

    public static int sum(int n) {
        int add = 0;
        while (n != 0) {
            int sq = (n % 10) * (n % 10);
            add += sq;
            n = n / 10;
        }
        return add;
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = sum(n);
        }
        return n == 1;
    }
}
