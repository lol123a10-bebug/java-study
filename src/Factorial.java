public class Factorial {
    long fact(long n) {
        if (n == 1) return 1;

        return this.fact(n - 1) * n;
    }

    void test(int... v) {
        System.out.println(v);
    }
}

class Recursion {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();

        System.out.println(factorial.fact(20));

        int[] items = new int[10];

        for (int item : items) {
            System.out.println(item);
        }

        String s = "test";

        System.out.println(s.equals("test"));
    }
}
