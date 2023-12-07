package Recursion.level3;

public class tilesFitting {

    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }

        // vetically
        int verPlacement = placeTiles(n - m, m);

        // horizontally
        int horPlacement = placeTiles(n - 1, m);

        return verPlacement + horPlacement;
    }

    public static void main(String[] args) {
        int n = 7, m = 5;
        int totalWays = placeTiles(n, m);
        System.out.println(totalWays);

    }
}
