package Recursion.level3;

public class WaysToInvite {
    public static int ways(int n) {
        if (n <= 1) {
            return 1;
        }

        // single
        int ways1 = ways(n - 1);

        // pair
        int ways2 = (n - 1) * ways(n - 2);

        return ways1 + ways2;

    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(ways(n));

    }
}
